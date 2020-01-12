package com.company.input;

import com.company.object.Player;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter
{
    Player p;//Player object

    public KeyInput(Player p)
    {
        this.p = p;
    }

    public void keyPressed(KeyEvent e)
    {
        p.keyPressed(e);//calls keyPressed in player class
    }

    public void keyReleased(KeyEvent e)
    {
        p.keyReleased(e);//calls keyReleased in player class
    }
}
