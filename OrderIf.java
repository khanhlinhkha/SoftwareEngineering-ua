package be.uantwerp;

public interface OrderIf {
    public int getOrderNumber();
    public void setOrderNumber(int orderNumber);
    public String getProductName();
    public void setProductName(String productName);
    public int getNumberOfUnits();
    public void setNumberOfUnits(int numberOfUnits);
    public String getCustomerName();
    public void setCustomerName(String customerName);
    public String giveOverview();
}