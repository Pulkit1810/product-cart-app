enum ProductCategory {
    ELECTRONICS(0.18),
    CLOTHING(0.05),
    GROCERIES(0.02);

    private final double taxRate;

    ProductCategory(double taxRate) {
        this.taxRate = taxRate;
    }

    public double getTaxRate() {
        return taxRate;
    }
}
