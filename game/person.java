import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 
public class person extends Actor
{
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
}
