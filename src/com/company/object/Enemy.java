package com.company.object;

import com.company.GlobalPosition;
import com.company.Main;

import javax.swing.*;
import java.awt.*;

public class Enemy extends GlobalPosition {
    private String image = "/images/enemy.png";//gets the image from the location
    int speed = 3;
    public Enemy(int x, int y)
    {
        super(x, y);
    }

    public void update()
    {
        x+=speed;
        if(x > Main.WIDTH-52)//-40 as the origin of the image is on the top left corner
        {//if x is going beyond the screen, move the character 3px to the left
            speed = -3;
        }
        if(x<0)//if character is crossing the left boundary of the screen then move it 3px to the right
        {
            speed = 3;
        }
    }

    public void draw(Graphics2D g2d)
    {
        g2d.drawImage(getEnemyImage(),x,y,null);
    }

    public Rectangle getBounds()
    {
        return new Rectangle(x,y,32,32);//Creates a rectangle around our player
    }

    public Image getEnemyImage()
    {
        ImageIcon i = new ImageIcon(getClass().getResource(image));
        return i.getImage();
    }
}
