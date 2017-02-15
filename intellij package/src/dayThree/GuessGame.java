package dayThree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


/**
 * Created by student on 15/02/2017.
 */
public class GuessGame {

    //Random number object generator
    private Random random = new Random();

    int generatedNumber, userInput;
    private JTextField guessInput;
    private JLabel lbl1, lbl2, resultLabel;
    private JButton newGameBtn;
    JFrame mainFrame;

    //constructor
    public GuessGame(){
        //set the GUI: JFrame, JLabel, JTextField, JButton

        //Main frame
        mainFrame = new JFrame("Guessing Game");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Terminate program when they click on close
        mainFrame.setSize(250, 100);                              //Set default size width, height
        //mainFrame.setLayout(new FlowLayout());             //'1' is gap between - so buttons spread out well
        Dimension dimension = mainFrame.getToolkit().getScreenSize(); //get screen size
        mainFrame.setLocation(                                          //so program opens in middle of screen
                dimension.width/2 - mainFrame.getWidth()/2,             //get centre width
                dimension.height/2- mainFrame.getHeight()/2             //get centre height
        );

        //Labels
        lbl1 = new JLabel("I have a number between 1 and 100");
        lbl2 = new JLabel("Can you guess my number?");


        //Text input field- Collect user input when they press enter
        guessInput = new JTextField(3); //JTextField(number of characters to support)
        guessInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                userInput = Integer.parseInt(guessInput.getText());
                match();
                }catch (Exception e1){
                    //if they try an enter a character will show message dialog
                    JOptionPane.showMessageDialog(null, "You must enter a NUMBER between 1 and 100");
                }

            }
        });

        //Create result label and set initial text
        resultLabel = new JLabel("Result appears here...");

        //New game button
        newGameBtn = new JButton("New Game");

        //when user clicks newGameBtn
        newGameBtn.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultLabel.setText("Guess Result");    //set result label text so they know game has started
                guessInput.setText("");                 //clear text box
                guessInput.setEditable(true);
                generate();                             //call generate function- i.e. generate a random number
                mainFrame.repaint();                    //NEED to repaint to refresh page

            }
        }));

        //Show labels and input box and button
        mainFrame.add(lbl1);
        mainFrame.add(lbl2);
        mainFrame.add(resultLabel);
        mainFrame.add(guessInput);
        mainFrame.add(newGameBtn);

        //normally declared last:
        mainFrame.setVisible(true); //display frame- default is invisible

    }

    //method to generate random number
    private void generate(){
        generatedNumber= random.nextInt(100) + 1;  //1 is starting value (default is 0), and max 100
    }

    //Compare user input to generated number
    private void match(){

        if(userInput >100 || userInput<0)
        {
            resultLabel.setText("Your guess is not in the random number scope");
            guessInput.setEditable(false);
        }
        else {
            if (userInput == generatedNumber) {
                resultLabel.setText("Correct!");    //Set label to produce result
                guessInput.setEditable(false);
                JOptionPane.showMessageDialog(null, "MATCH!");
            } else if (userInput < generatedNumber) {
                resultLabel.setText("Too Low...");
            } else {
                resultLabel.setText("Too high...");
            }
        }

        //JFrame method called repaint();
        mainFrame.repaint();
    }


    public static void main(String[] args){
        new GuessGame();        //call method to start game

    }


}
