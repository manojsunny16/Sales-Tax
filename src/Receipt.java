import java.util.*;
    public class Receipt {

        private List<Item> items;

        public Receipt() {

            items = new ArrayList<>();
        }

        public Receipt addItem(Item item) {
            items.add(item);
            return this;
        }


        public void print() {
            double SalesTax = 0.0;
            double TotalAmount = 0.0;
            for (Item item: items) {
                TaxCalculator calc = new ComputeBaseTax(item);
                if (item.cat == Category.OTHER)
                    calc = new ComputeSalesTax(calc);
                if (item.isImported)
                    calc = new ComputeImportTax(calc);
                calc = new Rounder(calc);
                double Tax = calc.calc();
                SalesTax += Tax;
                double Total = item.basePrice + Tax;
                TotalAmount += item.basePrice + Tax;
                System.out.println(item.name + " " + Total);



                
            }
            System.out.println("Sales Taxes : " +SalesTax);
            System.out.println("Total: "+TotalAmount);
        }



    }
