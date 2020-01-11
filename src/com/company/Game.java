package com.company;

import javax.swing.*;//GUI toolkit for Java
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 public class Game extends JPanel implements ActionListener //used to see the window
{
    public static final long serialVersionUID = 1L;//Gives our class an ID
    Timer gamelooptimer;
    public Game()
    {
        setFocusable(true);//focus is directly on the screen opened up rather than clicking on it
        gamelooptimer = new Timer(10,this);
        gamelooptimer.start();
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;//converting the graphics into graphics 2D as its better
    }

    @Override//ActionListener is required to have atleast one method
    public void actionPerformed(ActionEvent e) {
//runs through this code every 10ms it basically causes a delay of 10ms in the game before an action
        //System.out.println("start game");
        repaint();//used to call paint every 10ms
    }
}
