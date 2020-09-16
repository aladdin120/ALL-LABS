package LAB2;

public class DogKennel extends Dog{

    static Dog[] array = new Dog[3];

    public void addDog() {
        DogKennel.array[0] = new Dog("Max", 5);
        DogKennel.array[1] = new Dog("Sam", 8);
        DogKennel.array[2] = new Dog("Xx", 10);
    }

    public void info(){
        for (int i = 0; i<3; i++){
            System.out.println(array[i].toString());
        }
    }
}
