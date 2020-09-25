package LAB6;


public class Rectangle extends Shape{
    private double a, b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    Rectangle(){ }

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
        setP((a+b)*2);
        setS(a*b);
    }

    public void Info(){
        System.out.println("Прямоугльник\nСторона A: "+a+"\nСторона B: "+b+"\nПлощадь: "+getS()+"\nПериметр: "+getP());
    }
}
