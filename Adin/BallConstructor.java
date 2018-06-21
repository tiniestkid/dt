import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class BallConstructor extends Circle
{
    private double moveX;
    private double moveY;

    public BallConstructor(Color c)
    {super(15, Color.WHITE);
    }

    public void act()
    {
        setExactLocation(getExactX() + moveX, getExactY() + moveY);
    }

    public double getMoveX() { return moveX; }
    public double getMoveY() { return moveY; }
    public double getNewX() { return getExactX() + getMoveX(); }
    public double getNewY() { return getExactY() + getMoveY(); }

    protected void setMove(double vx, double vy)
    {
        moveX = vx;
        moveY = vy;
    }

    public String toString()
    {
        return getClass().toString() + " @ (" + getExactX() + ", " + getExactY() + ")";
    }

    public boolean stopped(){
        if (moveX == 0 && moveY == 0){
            return true;
        }
        else
            return false;
    }
}
