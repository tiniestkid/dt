import greenfoot.*; 

import java.util.List;

public class pythonbetterthanjava extends World
{
    public pythonbetterthanjava()
    {
        super(800, 600, 1, false);
        addObject(new Hole(greenfoot.Color.BLUE), Greenfoot.getRandomNumber(700)+50, Greenfoot.getRandomNumber(500)+50);
        addVerticalWalls(560, 300);
        addHorizontalWalls(430, 215); //left
        addHorizontalWalls(430, 585); //right

        addObject(new GolfBall(), 400,560);
        
        prepare();
    }

    private void addVerticalWalls(int height, int centre)
    {
        addObject(new VerticalWall(10, height), 10, centre);

        addObject(new VerticalWall(10, height), 790, centre);  
    }

    private void addHorizontalWalls(int width, int centre)
    {
        addObject(new HorizontalWall(width, 10), centre, 10);

        addObject(new HorizontalWall(width, 10), centre, 590);    
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

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

    }
}
