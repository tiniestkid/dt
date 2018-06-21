import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Dimension;
import java.awt.Toolkit;

public class bg extends World{
    private int screenWidth = getWidth();
    private int screenHeight = getHeight();
    public int bedroom = 1;
    public bg(){
            super((int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth()*0.8),
                  (int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight()*0.8),1);
                GreenfootImage image = getBackground();
            image.scale(image.getWidth() + 1000, image.getHeight() + 1000);
            setBackground(image);    
           //Debug
          System.out.println("Debug: World Dimensions = (" + getWidth()+","+ getHeight()+")");
          
           addObject(new person(), (int)(screenWidth*0.35),(int)(screenHeight*0.5));
           addObject(new minigame(), (int)(screenWidth*0.85),(int)(screenHeight*0.5));
           addObject(new lighting(), (int)(screenWidth*0.35),(int)(screenHeight*0.5));
           addObject(new bed(), (int)(screenWidth*0.2),(int)(screenWidth*0.095));
         
           setPaintOrder(lighting.class, person.class, bed.class);
        }
}
 