package be.uantwerp;

public class OrderListSearcher implements OrderListSearcherIf {
    OrderList orders = null;
    public OrderListSearcher(OrderList aOrders){
        orders = aOrders;
    }
    public OrderList searchCustomerNameEqualTo(String name){
        OrderList result = new OrderList(name);
        for (Order order: orders.getMembers()) {
            if (order.getCustomerName().equals(name)) {
                result.addMember(order);
            }
        }
        return result;
    }
    public OrderList searchNumberOfUnitsGreaterThan(int limit){
        OrderList result = new OrderList(Integer.toString(limit));
        for (Order order : orders.getMembers()){
            if (order.getNumberOfUnits()>limit) {
                result.addMember(order);
            }
        }
        return result;
    }
}