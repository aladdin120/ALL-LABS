package LAB24.PART2;

public class MagicChair extends AbstractFactory implements Chair {
    public MagicChair(int color, String material, String name) {
        super(color, material, name);
    }

    @Override
    public void SitDown() {
        System.out.println("I'm sitting on Magic chair");
    }
}

