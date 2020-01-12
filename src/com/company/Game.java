package com.company;

import com.company.input.KeyInput;
import com.company.object.Player;

import javax.swing.*;//GUI toolkit for Java
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 public class Game extends JPanel implements ActionListener //used to see the window
{
    public static final long serialVersionUID = 1L;//Gives our class an ID
    private String background = "/images/background.png";
    Timer gamelooptimer;
    Player p;
    public Game()
    {
        setFocusable(true);//focus is directly on the screen opened up rather than clicking on it
        gamelooptimer = new Timer(10,this);//reduce the delay to make the player move faster
        gamelooptimer.start();
        //creating an object of Player class in constructor
        p = new Player(250,150);//player will be 100px right and 100 px down from top left
        addKeyListener(new KeyInput(p)); //used to take key input
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;//converting the graphics into graphics 2D as its better
        g2d.drawImage(getBackgroundImage(),0,0,this);
        p.draw(g2d);
    }

    public Image getBackgroundImage()
    {
        ImageIcon i = new ImageIcon(getClass().getResource(background));
        return i.getImage();
    }

    @Override//ActionListener is required to have atleast one method
    public void actionPerformed(ActionEvent e) {
//runs through this code every 10ms it basically causes a delay of 10ms in the game before an action
        //System.out.println("start game");
        p.update();
        repaint();//used to call paint every 10ms
    }
}
