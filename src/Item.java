
    public class Item {
        public final String name;
        public final Category cat;
        public final boolean isImported;
        public final double basePrice;

        public Item(String name, Category cat, boolean isImported, double basePrice) {
            this.name = name;
            this.cat = cat;
            this.isImported = isImported;
            this.basePrice = basePrice;
        }
    }