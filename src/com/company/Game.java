package com.company;

import com.company.input.Controller;
import com.company.input.KeyInput;
import com.company.object.Enemy;
import com.company.object.Player;

import javax.swing.*;//GUI toolkit for Java
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 public class Game extends JPanel implements ActionListener //used to see the window
{
    public static final long serialVersionUID = 1L;//Gives our class an ID
    String backgroundImage = "/images/background.png";
    Timer mainTimer;
    Player p;
    //Enemy e;
    Controller c;
    public Game()
    {
        setFocusable(true);//focus is directly on the screen opened up rather than clicking on it
        mainTimer = new Timer(8,this);//reduce the delay to make the player move faster
        mainTimer.start();
        //creating an object of Player class in constructor
        p = new Player(250,150);//player will be 250px right and 150 px down from top left
      //  e = new Enemy(250,250);
        c= new Controller();
        addKeyListener(new KeyInput(p)); //used to take key input
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;//converting the graphics into graphics 2D as its better
        g2d.drawImage(getBackgroundImage(),0,0,this);
        p.draw(g2d);
        //e.draw(g2d);
        c.draw(g2d);
    }

    public Image getBackgroundImage()
    {
        ImageIcon i = new ImageIcon(getClass().getResource(backgroundImage));
        return i.getImage();
    }

    @Override//ActionListener is required to have atleast one method
    public void actionPerformed(ActionEvent ee) {
//runs through this code every 10ms it basically causes a delay of 10ms in the game before an action
        //System.out.println("start game");
        p.update();
        //e.update();
        c.update();
        repaint();//used to call paint every 10ms
    }
}
