import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Koby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Koby extends Circle
{
    public Koby()
    {
        super(15, Color.RED);
    }

    /**
     * Act - do whatever the Koby wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() 
    {
        
        if(isTouching(GolfBall.class))
        {
           
            getWorld().addObject(new GolfBall(), 400,560);
        }
    }    
}
