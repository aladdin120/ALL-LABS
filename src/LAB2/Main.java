package LAB2;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        test.getInfo();
        System.out.println();

        DogKennel dog = new DogKennel();
        dog.addDog();
        dog.info();
    }
}
