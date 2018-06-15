import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Dimension;
import java.awt.Toolkit;
public class bg extends World{
    private int screenWidth = getWidth();
    private int screenHeight = getHeight();
    public bg(){
            super((int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth()*0.8),
                  (int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight()*0.8),1);
                
          addObject(new person(), (int)(screenWidth*0.7),(int)(screenHeight*0.5));
           //Debug
          System.out.println("Debug: World Dimensiions = (" + getWidth()+","+ getHeight()+")");
        }
    }