package be.uantwerp;

import java.util.ArrayList;

public interface OrderListIf {
    public ArrayList<Order> getMembers();
    public void addMember(Order order);
    public void addAllMembers(OrderList orderList);
}