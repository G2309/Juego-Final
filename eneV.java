import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class eneV here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class eneV extends Actor
{
    /**
     * Act - do whatever the eneV wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
    World world = getWorld();
    eneV eneVq = new eneV();
    Actor shot = getOneIntersectingObject(shot.class);     
    int b = Greenfoot.getRandomNumber(26);
    int x = Greenfoot.getRandomNumber(598);
    int a = Greenfoot.getRandomNumber(150);
    int d = Greenfoot.getRandomNumber(1000);
    move(-15);
    if(b == 5){
            world.addObject(eneVq, 1000, x); 
    }
    if (isTouching(shot.class))
        {
        World myWorld =  getWorld();
        myWorld.removeObject(shot);
        myWorld.removeObject(this);
        }
    else{
        if(isAtEdge()){
        getWorld().setBackground("gameover.png");
        Greenfoot.stop();
        }
    }
    }
    }
    
     
    