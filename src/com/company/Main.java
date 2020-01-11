package com.company;

import javax.swing.*;

public class Main{

    public static void main(String[] args) {
        JFrame frame = new JFrame();//package used for opening the window
        frame.pack();
        frame.setSize(640,480);//setting the size of the window
        frame.setResizable(false);//user is not allowed to change the window size
        frame.setLocationRelativeTo(null);//used for making the window appear in the center
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//closes the window and terminates the program when x button is clicked
        frame.add(new Game());//adding the game
        frame.setVisible(true);//window is made visible
    }
}
