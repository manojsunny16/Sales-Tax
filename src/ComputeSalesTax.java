public class ComputeSalesTax implements TaxCalculator {

    private TaxCalculator calculator;

    public ComputeSalesTax(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public Item getItem() {
        return calculator.getItem();
    }

    @Override
    public double calc() {
        return calculator.calc() + getItem().basePrice * 0.1d;
    }

}
