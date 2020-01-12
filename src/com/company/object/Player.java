package com.company .object;

import com.company.GlobalPosition;
import com.company.input.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

public class Player  extends GlobalPosition {
    private String playerimage = "/images/player.png";

    int velX = 0;
    int velY = 0;
    private LinkedList<Enemy> e = Controller.getEnemyBounds();
    public Player(int x, int y)
    {
        super(x, y);
    }

    public void update()
    {
        //x+=2;x coordinate increases by 2
        //y+=2;y coordinate increases by 2
        x+=velX;
        y+=velY;
        //COLLISION WITH OUTSIDE
        if(x<0)
        {
            x=0;
        }
        if(y<0)
        {
            y=0;
        }
        if(x>590)//size of window minus the horizontal image size
        {
            x=590;
        }
        if(y>390)
        {
            y=390;
        }
        Collision();
    }

    public void Collision()
    {
        for(int i=0;i<e.size();i++)
        {
            if(getBounds().intersects(e.get(i).getBounds()))
            {
                System.out.println("COLLISION!");
            }
        }

    }

    public void keyPressed(KeyEvent e)//player movement when key is pressed
    {
        int key  = e.getKeyCode();

        if(key==KeyEvent.VK_RIGHT){
            velX = 5;
        }
            else if(key==KeyEvent.VK_LEFT) {
                velX = -5;
        }
            else if(key==KeyEvent.VK_DOWN){
                velY = 5;
        }
            else if(key==KeyEvent.VK_UP){
                velY = -5;
        }
    }

    public void keyReleased(KeyEvent e)//initializing player movement to 0 when key is released
    {
        int key  = e.getKeyCode();

        if(key==KeyEvent.VK_RIGHT){
            velX = 0;
        }
        else if(key==KeyEvent.VK_LEFT) {
            velX = 0;
        }
        else if(key==KeyEvent.VK_DOWN){
            velY = 0;
        }
        else if(key==KeyEvent.VK_UP){
            velY = 0;
        }

    }

    public Rectangle getBounds()
    {
        return new Rectangle(x,y,32,32);//Creates a rectangle around our player
    }

    public void draw(Graphics2D g2d)
    {
        g2d.drawImage(getPlayerImage(),x,y,null);
        g2d.draw(getBounds());
    }
    public Image getPlayerImage()
    {
        ImageIcon i = new ImageIcon(getClass().getResource(playerimage));
        return i.getImage();
    }
}
