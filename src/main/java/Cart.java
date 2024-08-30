import java.util.ArrayList;
import java.util.List;

class Cart {
    private List<CartItem> items;
    private List<User> subscribedUsers;

    public Cart() {
        this.items = new ArrayList<>();
        this.subscribedUsers = new ArrayList<>();
    }

    public void addItem(Product product, int quantity) {
        for (CartItem item : items) {
            if (item.getProduct().getId().equals(product.getId())) {
                item.increaseQuantity(quantity);
                return;
            }
        }
        items.add(new CartItem(product, quantity));
    }

    public void removeItem(String productId) {
        items.removeIf(item -> item.getProduct().getId().equals(productId));
    }

    public void increaseQuantity(String productId, int amount) {
        for (CartItem item : items) {
            if (item.getProduct().getId().equals(productId)) {
                item.increaseQuantity(amount);
            }
        }
    }

    public void decreaseQuantity(String productId, int amount) {
        for (CartItem item : items) {
            if (item.getProduct().getId().equals(productId)) {
                item.decreaseQuantity(amount);
            }
        }
    }

    public double getTotalValue() {
        return items.stream().mapToDouble(CartItem::getItemTotal).sum();
    }

    public void subscribeUser(User user) {
        if (!subscribedUsers.contains(user)) {
            subscribedUsers.add(user);
        }
    }

    public void notifyPriceChange(Product product) {
        for (User user : subscribedUsers) {
            user.notifyPriceChange(product);
        }
    }

    public void updateProductPrice(Product product, double newPrice) {
        if (product.getPrice() != newPrice) {
            product.setPrice(newPrice);
            notifyPriceChange(product);
        }
    }
}