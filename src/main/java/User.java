class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void notifyPriceChange(Product product) {
        System.out.println("Dear " + name + ", the price of " + product.getName() + " has changed to " + product.getPrice());
    }
}