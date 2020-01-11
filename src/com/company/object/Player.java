package com.company.object;

import com.company.GlobalPosition;

import javax.swing.*;
import java.awt.*;

public class Player  extends GlobalPosition {
    private String playerimage = "/Images/Player.png";
    public Player(int x, int y)
    {
        super(x, y);
    }

    public void update()
    {

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
