package LAB3;

public class Circle {

    private int radius;
    private int diametr;
    private double P;
    private double S;

    public Circle(int radius) {
        this.radius = radius;
        setDiametr(radius);
        setP(radius);
        setS(radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int radius) {
        this.diametr = radius*2;
    }

    public double getP() {
        return P;
    }

    public void setP(int radius) {
        this.P = 2*3.14*radius;
    }

    public double getS() {
        return S;
    }

    public void setS(int radius) {
        this.S = 3.14*radius*radius;
    }

    public void getInfo() {
        System.out.println("Радиус = "+radius+"\nДиаметр = "+diametr+"\nПериметр = "+P+"\nПлощадь = "+S);
    }
}
