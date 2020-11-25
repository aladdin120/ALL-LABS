package LAB24.PART2;

public class Client implements Chair{

    MagicChair magicChair = new MagicChair(289121, "Wood", "Magic");
    FunctionalChair functionalChair = new FunctionalChair(2354, "Wood", "Functional");
    VictorianChair victorianChair = new VictorianChair(1244, "Metal", "Victorian");
    Chair[] chairs = {magicChair, functionalChair, victorianChair};

    public void Sit() {
        chairs[0].SitDown();
    }

    @Override
    public void SitDown() {}
}
