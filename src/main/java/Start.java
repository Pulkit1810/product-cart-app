import java.util.Scanner;

/*
For detailed instructions, please refer to the README file.
It contains all the necessary guidelines and information for submitting and working with this project.
 */


public class Start {
    //you may remove the static keyword if required, and please DO NOT CREATE a new object for scanner class
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Product laptop = new Product("P001", "Laptop", 1000, ProductCategory.ELECTRONICS);
        Product shirt = new Product("P002", "Shirt", 50, ProductCategory.CLOTHING);

        User user1 = new User("Alice");
        User user2 = new User("Bob");

        Cart cart = new Cart();
        cart.subscribeUser(user1);
        cart.subscribeUser(user2);

        cart.addItem(laptop, 1);
        cart.addItem(shirt, 2);

        System.out.println("Total Cart Value: " + cart.getTotalValue());

        // Price change scenario
        cart.updateProductPrice(laptop, 1200); // This should notify the users

        System.out.println("Total Cart Value after price change: " + cart.getTotalValue());
    }
}
