package LAB3;

public class Human {

    public void getInfo() {
        Head head = new Head("Черный", "Маленькая");
        Leg leg = new Leg("Длинная", true);
        Hand hand = new Hand("Длинная", true, false);

        head.getInfo();
        leg.getInfo();
        hand.getInfo();
    }
}
