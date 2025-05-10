package be.uantwerp;

public class Order implements OrderIf {
    public int orderNumber;
    public String productName;
    public int numberOfUnits;
    public String customerName;

    public Order(int orderNumber, String productName, int numberOfUnits, String customerName){
        this.orderNumber = orderNumber;
        this.productName = productName;
        this.numberOfUnits = numberOfUnits;
        this.customerName = customerName;
    }

    public int getOrderNumber(){
        return orderNumber;
    }
    public void setOrderNumber(int orderNumber){
        this.orderNumber = orderNumber;
    }
    public String getProductName(){
        return productName;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }
    public int getNumberOfUnits(){
        return numberOfUnits;
    }
    public void setNumberOfUnits(int numberOfUnits){
        this.numberOfUnits = numberOfUnits;
    }
    public String getCustomerName(){
        return customerName;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public String giveOverview(){
        return "OrderNumber: " + orderNumber + ", productName: " + productName +
                ", numberOfUnits: " + numberOfUnits + ", customerName: " + customerName;
    }
    @Override
    public String toString() {
        return giveOverview();
    }
}