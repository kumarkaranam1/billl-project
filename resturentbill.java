import java.util.ArrayList;

public class RestaurantBillGenerator {
    public static void main(String[] args) {
        // Creating an array list to hold the menu items
        ArrayList<MenuItem> menu = new ArrayList<>();
        
        // Adding menu items to the list
        menu.add(new MenuItem("Pizza", 12.99));
        menu.add(new MenuItem("Burger", 8.99));
        menu.add(new MenuItem("Salad", 6.99));
        menu.add(new MenuItem("Fries", 2.99));
        menu.add(new MenuItem("Soda", 1.99));
        
        // Creating an array list to hold the customer's order
        ArrayList<MenuItem> order = new ArrayList<>();
        
        // Adding items to the customer's order
        order.add(menu.get(0));
        order.add(menu.get(1));
        order.add(menu.get(3));
        order.add(menu.get(4));
        
        // Calculating the total cost of the order
        double totalCost = 0;
        for (MenuItem item : order) {
            totalCost += item.getPrice();
        }
        
        // Printing the bill
        System.out.println("******************************");
        System.out.println("*        RESTAURANT BILL      *");
        System.out.println("******************************");
        System.out.println("");
        System.out.println("ITEMS ORDERED:");
        System.out.println("");
        for (MenuItem item : order) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("");
        System.out.println("TOTAL COST: $" + totalCost);
        System.out.println("");
        System.out.println("THANK YOU FOR DINING WITH US!");
        System.out.println("******************************");
    }
}

class MenuItem {
    private String name;
    private double price;
    
    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
}
