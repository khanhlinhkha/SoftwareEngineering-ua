package be.uantwerp;

public interface OrderListSearcherIf {
    public OrderList searchNumberOfUnitsGreaterThan(int limit);
    public OrderList searchCustomerNameEqualTo(String name);
}