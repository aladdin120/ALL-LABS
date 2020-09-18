package LAB5;

public abstract class Shape {
    private int S;
    private int P;

    public int getS() {
        return S;
    }

    abstract void setS(int s);

    public int getP() {
        return P;
    }

    abstract void setP(int p);
}
