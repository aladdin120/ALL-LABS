package LAB2;

public class Dog {
    private String name;
    private int age;

    public Dog() {};

    public Dog(String name, int age){
        this.age = age;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int dogToPerson() {
        return age*7;
    }

    public String toString() {
        return "Имя: "+name+"; Возраст: "+age+"; 'Человеческий возраст': "+dogToPerson();
    }

}

