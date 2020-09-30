package LAB7;

public abstract class Furniture {

    int price, amount;
    String material, size, name;

    public void getInfo() {
        System.out.println("Name: "+ name+"\nMaterial: "+material+"\nSize: "+size+"\nPrice: "+price+"\n\n");
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String  getC() {
        return "Name: "+name+"\nAmount: "+amount+"\n";
    }

    public int getPrice() {
        return price*amount;
    }
}
