package LAB5;

public class Square extends Shape {
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public Square(int a) {
        this.a = a;
        setP(a*4);
        setS(a*a);
    }

    public void Info(){
        System.out.println("Квадрат\nСторона A: "+a+"\nПлощадь: "+getS()+"\nПериметр: "+getP());
    }
}
