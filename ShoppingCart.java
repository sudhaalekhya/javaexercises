package day4;
import java.util.ArrayList;
import java.util.Scanner;

class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price   
 = price;
    }

    public double getPrice() {
        return   
 price;
    }
}

public class ShoppingCart {
	private ArrayList<Item> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);   

    }

    public double calculateTotalPrice() {
        double total   
 = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public double applyDiscount(double total) {
        // Set your desired discount percentage and minimum total for discount
        double discountPercentage = 10; // 10% discount
        double minimumTotalForDiscount = 1000; // Minimum total to qualify for discount

        if (total >= minimumTotalForDiscount) {
            double discountAmount = total * (discountPercentage / 100);
            total -= discountAmount;
        }
        return total;
    }

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter   
 item name (or 'quit' to exit): ");
            String itemName = scanner.nextLine();
            if (itemName.equalsIgnoreCase("quit")) {
                break;
            }

            System.out.print("Enter item price: ");
            double itemPrice = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline

            cart.addItem(new Item(itemName, itemPrice));
        }

        double totalPrice = cart.calculateTotalPrice();
        totalPrice = cart.applyDiscount(totalPrice);

        System.out.println("Total price: " + totalPrice);

	}

}
