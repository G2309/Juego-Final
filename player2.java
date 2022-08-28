import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player2 extends Actor
{
    
    /**
     * Act - do whatever the player2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Actor eneV = getOneIntersectingObject(eneV.class);
        setRotation(90);
        setImage("player.png");
        if (Greenfoot.isKeyDown("up"))
        {
            setImage("playerLeft.png");
            move(-16);
        }
          
        if (Greenfoot.isKeyDown("down"))
        {
            setImage("playerRight.png");
            move(16);
        }
        
        if (Greenfoot.isKeyDown("space"))
        {
            getWorld().addObject(new shot(), getX(), getY());
            Greenfoot.playSound("pew.wav");
        }
        if (isTouching(eneV.class)){
            setImage("explogif.gif");
            getWorld().setBackground("gameover.png");
            Greenfoot.stop();
        }
        }
    }

