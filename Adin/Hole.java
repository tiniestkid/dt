import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class Hole extends Circle
{
    public Hole(Color c)
    {
        super(15, Color.BLUE);
    }

    public void act(){	
        if(isTouching(GolfBall.class)){
            Greenfoot.setWorld(new pythonbetterthanjava());

        }	
    }
}
