package LAB6;

public class Main {
    public static void main(String[] args) {

        MovablePoints left = new MovablePoints(0, 0, 1000);
        MovablePoints right = new MovablePoints(55, 55, 1000);
        System.out.println(left.data()+"\n\n"+right.data()+"\n"+left.checkSpeed(left, right));

    }
}
