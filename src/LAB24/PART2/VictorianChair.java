package LAB24.PART2;

public class VictorianChair extends AbstractFactory implements Chair {
    public VictorianChair(int color, String material, String name) {
        super(color, material, name);
    }

    @Override
    public void SitDown() {
        System.out.println("I'm sitting on Victorian chair");
    }
}
