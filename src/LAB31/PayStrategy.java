package LAB31;

public interface PayStrategy {

    boolean pay(int amount);
    void collectDetails();
    boolean verify();
}
