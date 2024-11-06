package ie.atu.exam;

public class Order {
    private String orderID;
    private String customerName;
    private String productName;
    private int quantity;

    public Order(String orderID, String customerName, String productName, int quantity) {
        this.orderID = orderID;
        this.customerName = customerName;
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
