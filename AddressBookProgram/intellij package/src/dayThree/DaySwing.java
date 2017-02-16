package dayThree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import static java.awt.event.KeyEvent.VK_F;

/**
 * Created by student on 15/02/2017.
 */
public class DaySwing {
    JFrame mainFrame;
    JButton goodBtn;
    JButton badBtn;


    public DaySwing(){
        mainFrame = new JFrame("Message of the Day");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Terminate program when they click on close
        mainFrame.setSize(250, 100);                              //Set default size width, height
        mainFrame.setLayout(new FlowLayout(1, 1, 1));             //'1' is gap between - so buttons spread out well
        Dimension dimension = mainFrame.getToolkit().getScreenSize(); //get screen size
        mainFrame.setLocation(                                          //so program opens in middle of screen
                dimension.width/2 - mainFrame.getWidth()/2,             //get centre width
                dimension.height/2- mainFrame.getHeight()/2             //get centre height

        );

        JMenuBar menuBar = new JMenuBar();      //Add menu bar
        JMenu fileMenu = new JMenu("File");     //Add menu
        //set key event
        fileMenu.setMnemonic(KeyEvent.VK_F);
        JMenuItem exitMenuItem = new JMenuItem("Exit");  //add new menu item
        exitMenuItem.setMnemonic(KeyEvent.VK_X);   //vk= is virtual key
        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);
        mainFrame.setJMenuBar(menuBar);



        //Good button
        goodBtn = new JButton("Good");  //view
        goodBtn.addActionListener(new ActionListener() { //controller
            @Override
            public void actionPerformed(ActionEvent e) { //i.e. when they click on button
                //model
                JOptionPane.showMessageDialog(null, "Today is a good day!");
            }
        });
        mainFrame.getContentPane().add(goodBtn);


        //bad button
        badBtn = new JButton("Bad");  //view
        badBtn.addActionListener(new ActionListener() { //controller
            @Override
            public void actionPerformed(ActionEvent e) {
                //model
                JOptionPane.showMessageDialog(null, "Today is a bad day!");
            }
        });

        mainFrame.getContentPane().add(badBtn);


        //normally declared last:
        mainFrame.setVisible(true); //display frame-
    }

    public static void main(String[] args){
        new DaySwing(); //call function
    }

}

