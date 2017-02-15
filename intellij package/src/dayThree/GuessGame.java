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
        mainFrame = new JFrame("Guessing Game");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Terminate program when they click on close
        mainFrame.setSize(250, 100);                              //Set default size width, height
        mainFrame.setLayout(new FlowLayout());             //'1' is gap between - so buttons spread out well
        Dimension dimension = mainFrame.getToolkit().getScreenSize(); //get screen size
        mainFrame.setLocation(                                          //so program opens in middle of screen
                dimension.width/2 - mainFrame.getWidth()/2,             //get centre width
                dimension.height/2- mainFrame.getHeight()/2             //get centre height

        );

        //Labels
        lbl1 = new JLabel("I have a number between 1 and 100");
        lbl2 = new JLabel("Can you guess my number?");


        //Text input field- Collect user 
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

        resultLabel = new JLabel("Result appears here...");
        newGameBtn = new JButton("New Game");

        newGameBtn.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultLabel.setText("Guess Result");
                guessInput.setText("");
                guessInput.setEditable(true);
                generate();
                mainFrame.repaint();

            }
        }));



        mainFrame.add(lbl1);
        mainFrame.add(lbl2);
        mainFrame.add(resultLabel);
        mainFrame.add(guessInput);
        mainFrame.add(newGameBtn);

        //normally declared last:
        mainFrame.setVisible(true); //display frame-



    }

    //method to generate number
    private void generate(){
        generatedNumber= random.nextInt(100) + 1;  //1 is starting value (default is 0), and max 100
    }

    private void match(){
        //match generatedNumber with user input
        if(userInput >100 || userInput<0)
        {
            resultLabel.setText("Your guess is not in the random number scope");
            guessInput.setEditable(false);
        }
        else {

            if (userInput == generatedNumber) {
                resultLabel.setText("Correct!");
                guessInput.setEditable(false);
                JOptionPane.showMessageDialog(null, "MATCH!");
            } else if (userInput < generatedNumber) {
                resultLabel.setText("Too Low...");
            } else {
                resultLabel.setText("Too high...");

            }
        }
        mainFrame.repaint();

        //Set label to produce result
        //JFrame method called repaint();

    }


    public static void main(String[] args){
        new GuessGame();

    }


}
