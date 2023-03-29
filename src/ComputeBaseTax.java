public class ComputeBaseTax implements TaxCalculator {

    protected Item item;

    public ComputeBaseTax(Item item) {
        this.item = item;
    }

    @Override
    public Item getItem() {
        return item;
    }

    @Override
    public double calc() {
        return 0;
    }
}
