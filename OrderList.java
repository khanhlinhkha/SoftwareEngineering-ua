package be.uantwerp;

import java.util.ArrayList;

public class OrderList implements OrderListIf {
    public String orderListName;
    public ArrayList<Order> orders;

    public OrderList(String orderListName){
        this.orderListName = orderListName;
        this.orders = new ArrayList<>();
    }
    
    public ArrayList<Order> getMembers(){
        return orders;
    }
    public void addMember(Order order){
        orders.add(order);
    }
    public void addAllMembers(OrderList orderList){
        orders.addAll(orderList.getMembers());
    }
    @Override
    public String toString() {
        return "OrderList: " + orderListName + "\nMembers: " + orders;
    }
}