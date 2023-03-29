



public class Main {

    public static void main(String[] args) {


        Item cd = new Item("Perfume", Category.OTHER, true, 47.50d);
        Item bar = new Item("Chocolate Bar", Category.FOOD, true, 10.00d);

        Receipt receipt = new Receipt();
        receipt.addItem(cd).addItem(bar);

        receipt.print();


    }
}
