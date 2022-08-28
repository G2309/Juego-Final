import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Espacio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Espacio extends World
{
    /**
     * Constructor for objects of class Espacio.
     * 
     */
    public Espacio()
    {    
        super(1000, 600, 1); 
        int a = Greenfoot.getRandomNumber(600);
        prepare();
        Greenfoot.playSound("musica.wav");
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        player2 player2 = new player2();
        addObject(player2,50,100);
        eneV eneV = new eneV();
        addObject(eneV,981,591);
    }
    public void act()
    {
    if(numberOfObjects() > 150){
        setBackground("gameover.png");
        Greenfoot.stop();
    }
    }
}
