class Product {
    private String id;
    private String name;
    private double price;
    private ProductCategory category;

    public Product(String id, String name, double price, ProductCategory category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public ProductCategory getCategory() {
        return category;
    }
}
