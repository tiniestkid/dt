import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Dimension;
import java.awt.Toolkit;
public class person extends Actor
{
    private int screenWidth = (int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth()*0.8);
    private int screenHeight = (int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight()*0.8);
    private int sleeping = 0;
    public person()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 300, image.getHeight() - 150);
        setImage(image);
    }
    /**
     * Act - do whatever the person wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    public void bed()
    {
        if(((bg)getWorld()).bedroom == 1){
            sleeping = 1;
        }
        // debug
        System.out.println(sleeping);
        if (sleeping == 1){
            turn(90);
        }
    }
}
