package LAB5;

public class Circle extends Shape {
    private double R;

    public double getR() {
        return R;
    }

    public void setR(double R) {
        this.R = R;
    }

    public Circle (int R) {
        this.R = R;
        setP(2*3.14*R);
        setS(3.14*R*R);
    }

    public void Info(){
        System.out.println("Круг\nРадиус: "+R+"\nПлощадь: "+getS()+"\nПериметр: "+getP());
    }
}
