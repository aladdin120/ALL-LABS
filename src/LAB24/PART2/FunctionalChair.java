package LAB24.PART2;

public class FunctionalChair extends AbstractFactory implements Chair {
    public FunctionalChair(int color, String material, String name) {
        super(color, material, name);
    }

    @Override
    public void SitDown() {
        System.out.println("I'm sitting on Functional chair");
    }
}
