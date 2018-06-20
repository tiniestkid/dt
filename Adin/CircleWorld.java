import greenfoot.*; 

import java.util.List;

public class CircleWorld extends World
{
    public CircleWorld()
    {
        super(800, 600, 1, false);
        addObject(new Hole(greenfoot.Color.BLUE), Greenfoot.getRandomNumber(300)+50, Greenfoot.getRandomNumber(300)+50);
        addVerticalWalls(560, 300);
        addHorizontalWalls(430, 215);
        addHorizontalWalls(430, 585);
        addObject(new GolfBall(), 400,560);
    }
    

    private void addVerticalWalls(int height, int centre)
    {
        addObject(new VerticalWall(20, height), 10, centre);
        addObject(new VerticalWall(Greenfoot.getRandomNumber(440)+20, 20), 10, Greenfoot.getRandomNumber(440)+20);
        addObject(new VerticalWall(20, height), 790, centre);
    }

    private void addVerticalWalls2(int random1, int random2, int centre)
    {
        addObject(new VerticalWall(20, random1), random2, centre); 	
    }

    private void addHorizontalWalls(int width, int centre)
    {
        
        addObject(new HorizontalWall(width, 20), centre, 10);
        addObject(new HorizontalWall(Greenfoot.getRandomNumber(440)+20, 20), centre, Greenfoot.getRandomNumber(440)+20);
        addObject(new HorizontalWall(width, 20), centre, 590);    
    }

    private void addHorizontalWalls2(int random3, int random4, int centre)
    {
        addObject(new HorizontalWall(20, random3), random4, centre); 	
    }

    public void act()
    {
        for (BallConstructor b : (List<BallConstructor>)getObjects(BallConstructor.class))
        {
            applyFriction(b);
        }

        boolean altered = true;
        while (altered)
        {
            altered = false;
            for (BallConstructor b : (List<BallConstructor>)getObjects(BallConstructor.class))
            {
                boolean wall = collideWalls(b);
            }
        }

    }

    public void applyFriction(BallConstructor b)
    {
        double vx = b.getMoveX() * 0.99;
        double vy = b.getMoveY() * 0.99;
        if (Math.hypot(vx, vy) < 0.05)
        {
            b.setMove(0, 0);
        }
        else
        {
            b.setMove(vx, vy);
        }
    }

    public boolean collideWalls(BallConstructor b)
    {
        double newX = b.getNewX();
        double newY = b.getNewY();

        double vx = b.getMoveX();
        double vy = b.getMoveY();

        boolean bounced = false;

        for (Wall w : (List<Wall>)getObjects(Wall.class))
        {

            if (w.intersectsCircle((int)newX, (int)newY, b.getRadius()))
            {
                //Bounce:
                double angle = Math.toDegrees(Math.atan2(vy, vx));
                angle = 2 * w.getNormalAngle((int)newX, (int)newY, b.getRadius()) - 180 - angle;
                double mag = 0.9 * Math.hypot(vx, vy);

                vx = Math.cos(Math.toRadians(angle)) * mag;
                vy = Math.sin(Math.toRadians(angle)) * mag;
                bounced = true;
                break; 
            }
        }

        if (bounced)
        {
            b.setMove(vx, vy);
        }

        return bounced;
    }

    private double distAlong(double x, double y, double xAlong, double yAlong)
    {
        return (x * xAlong + y * yAlong) / Math.hypot(xAlong, yAlong);
    }
}
