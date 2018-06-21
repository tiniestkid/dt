import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Dimension;
import java.awt.Toolkit;
/**
 * Write a description of class lighting here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lighting extends Actor
{
    private int screenWidth = (int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth()*0.8);
    private int screenHeight = (int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight()*0.8);
    public lighting()
    {
        GreenfootImage image = getImage();
        image.scale( 1+ (int)(screenWidth*0.7), screenHeight);
        setImage(image);
    }
    /**
     * Act - do whatever the lighting wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
