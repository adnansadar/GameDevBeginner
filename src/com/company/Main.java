package com.company;

import javax.swing.*;

public class Main{
    public static final int WIDTH = 640,HEIGHT = 480;
    public static final String TITLE = "BASIC GAME";

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();//package used for opening the window
        frame.pack();
        frame.setSize(WIDTH,HEIGHT);//setting the size of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//closes the window and terminates the program when x button is clicked
        frame.setResizable(false);//user is not allowed to change the window size
        frame.setLocationRelativeTo(null);//used for making the window appear in the center
        frame.add(new Game());//adding the game
        frame.setVisible(true);//window is made visible
    }
}
