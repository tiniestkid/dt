import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Dimension;
import java.awt.Toolkit;
/**
 * Write a description of class lighting here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bed extends Actor
{
    private int screenWidth = (int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth()*0.8);
    private int screenHeight = (int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight()*0.8);
    public bed()
    {
        GreenfootImage image = getImage();
        image.scale((int)(screenWidth*0.4), (int)(screenWidth*0.2));
        setImage(image);
          //Debug
        System.out.println(screenWidth +","+ screenHeight);
    }
    /**
     * Act - do whatever the bed wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
