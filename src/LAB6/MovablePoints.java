package LAB6;

public class MovablePoints extends MovableRectangle{


    protected int x,y,speed;

    MovablePoints(int x, int y, int speed)
    {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }


    public boolean checkSpeed(MovablePoints left, MovablePoints right)
    {
        if(left.speed == right.speed)
            return true;
        else
            return false;
    }

    @Override
    public String data() {
        return "X = "+x +"\nY = "+y+"\nSPEED = "+speed;
    }
}
