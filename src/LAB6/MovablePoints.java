package LAB6;

public class MovablePoints extends MovableRectangle{


    protected int x,y,speed;

    MovablePoints(int x, int y, int speed)
    {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }


    public String checkSpeed(MovablePoints left, MovablePoints right)
    {
        if(left.speed == right.speed)
            return "Скорость одинаковая";
        else
            return "Скорость разная";
    }

    @Override
    public String data() {
        return "X = "+x +"\nY = "+y+"\nSPEED = "+speed;
    }
}
