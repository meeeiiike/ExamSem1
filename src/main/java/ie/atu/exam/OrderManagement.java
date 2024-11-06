package ie.atu.exam;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderManagement {
    public static Order addOrder(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter order ID: ");
        String orderID = sc.nextLine();
        System.out.println("Enter customer name: ");
        String customerName = sc.nextLine();
        System.out.println("Enter product name: ");
        String productName = sc.nextLine();
        System.out.println("Enter quantity: ");
        int quantity = sc.nextInt();
        sc.close();
        return new Order(orderID, customerName, productName, quantity);
    }
    public static Order updateOrder(){
        System.out.println("enter order ID: ");
        System.out.println("Which field to update? ");
        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Order pancakes = new Order("1000", "mike", "pancakes", 100);
        Order laptops = new Order("1001", "john", "laptops", 20);
        ArrayList listOfOrders = new ArrayList();
        listOfOrders.add(pancakes);
        listOfOrders.add(laptops);
        boolean isTrue = true;
        int menuOption;

        System.out.println("MENU\n1. Add Order\n2. Update Order\n3. Display All Orders\n4. Exit");
        menuOption = sc.nextInt();

        switch (menuOption) {
            case 1:
                try {
                    Order order = addOrder();
                    listOfOrders.add(order);
                } catch (Exception e) {
                    System.out.println("Encountered a problem! Error Message: " + e.getMessage());
                }
                break;
            case 2:
                updateOrder();
                System.out.println(listOfOrders.get(0));
                break;
            case 3:
                System.out.println(listOfOrders);
                break;
            case 4:
                System.out.println("Goodbye!");
                isTrue = false;
                sc.close();
                break;
            default:
                System.out.println("Something went wrong!");
        }
        sc.close();
    }
}
