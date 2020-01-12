package com.company.object;

import com.company.GlobalPosition;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Player  extends GlobalPosition {
    private String playerimage = "/images/player.png";

    int velX = 0;
    int velY = 0;

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
        if(x>560)//size of window minus the horizontal image size
        {
            x=560;
        }
        if(y>360)
        {
            y=360;
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

    public void draw(Graphics2D g2d)
    {
        g2d.drawImage(getPlayerImage(),x,y,null);
    }
    public Image getPlayerImage()
    {
        ImageIcon i = new ImageIcon(getClass().getResource(playerimage));
        return i.getImage();
    }
}
