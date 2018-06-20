import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GolfBall extends BallConstructor
{
    public GolfBall()
    {
        super(Color.BLACK); 
    }

    public void act() 
    {
        super.act();
        
        MouseInfo info = Greenfoot.getMouseInfo();
        
        if (info != null && Greenfoot.mouseClicked(null))
        {
            double angle = Math.atan2(info.getY() - getY(), info.getX() - getX());
            double clubSpeed = -15;
            setMove(Math.cos(angle) * clubSpeed, Math.sin(angle) * clubSpeed);
        }
        
        
    }    
}
