package com.company.input;

import com.company.object.Enemy;

import javax.naming.ldap.Control;
import java.awt.*;
import java.util.LinkedList;

public class Controller {
    LinkedList<Enemy> e = new LinkedList<Enemy>();
    Enemy TempEnemy;

    public Controller()
    {
        addEnemy(new Enemy(50,50));
        addEnemy(new Enemy(50,200));
        addEnemy(new Enemy(0,300));
        addEnemy(new Enemy(50,400));
    }

    public void draw(Graphics2D g2d)
    {
        for(int i = 0;i < e.size(); i++)//checks the no of enemies present
        {
            TempEnemy = e.get(i);//tempEnemy = newEnemy
            TempEnemy.draw(g2d);
        }
    }
    public void update()
    {
        for(int i=0;i<e.size();i++)
        {
            TempEnemy = e.get(i);
            TempEnemy.update();
            /*if(TempEnemy.x<20)
            {
                removeEnemy(TempEnemy);
            }*/
        }
    }

    public void addEnemy(Enemy enemy)
    {
        e.add(enemy);
    }
    public void removeEnemy(Enemy enemy)
    {
        e.remove(enemy);
    }


}
