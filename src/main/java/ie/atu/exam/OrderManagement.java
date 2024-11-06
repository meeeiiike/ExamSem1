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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList listOfOrders = new ArrayList();
        System.out.println("MENU\n1. Add Order\n2. Update Order\n3. Display All Orders\n4. Exit");
        int menuOption = sc.nextInt();

        switch(menuOption){
            case 1: Order order = addOrder();
                listOfOrders.add(order);
                break;
            case 2:
                break;
            case 3:
                System.out.println(listOfOrders);
                break;
            case 4:
                System.out.println("Goodbye!");
                break;
            default:
        }
    }
}
