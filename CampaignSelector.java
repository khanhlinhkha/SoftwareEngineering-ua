package be.uantwerp;

import java.util.ArrayList;

import be.uantwerp.OrderList;

public class CampaignSelector implements CampaignSelectorIf {
    OrderList orders = null;
    
    public CampaignSelector (OrderList aOrders){
        orders = aOrders;
    }

    public ArrayList<String> generateCustomerList(String productName, int limit){
        ArrayList<String> result = new ArrayList<String>();
        for (Order order: orders.getMembers()){
            boolean isEntitledTo = false;
            if (order.getProductName().equals(productName) && order.getNumberOfUnits() > limit){
                isEntitledTo = true;
            }
            if (isEntitledTo){
                result.add(order.getCustomerName());
            }   
        }
        return result;
    }
}