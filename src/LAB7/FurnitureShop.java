package LAB7;

public class FurnitureShop {

    Bed bed = new Bed();
    Table table = new Table();
    Sofa sofa = new Sofa();

    public void get_info() {
        bed.getInfo();
        table.getInfo();
        sofa.getInfo();
    }
}
