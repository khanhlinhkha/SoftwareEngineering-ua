package be.uantwerp;

import java.io.*;
import java.util.ArrayList;

public class OrderStandardInputter implements OrderStandardInputterIf{
    int status = 0;
    OrderList orders = null;

    public OrderStandardInputter(OrderList aOrders){
        orders = aOrders;
    }

    public void enter(){
        String productName = null;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while (status >= 0){
            System.out.println("Enter [orderNumber<CR> productName<CR> numberOfUnits<CR> customerName<CR>]: ");
            try{
                String orderNumberStr = in.readLine();
                if (orderNumberStr != null && orderNumberStr.length() != 0){
                    int orderNumber = Integer.parseInt(orderNumberStr);
                    productName = in.readLine();
                    int numberOfUnits = Integer.parseInt(in.readLine());
                    String customerName = in.readLine();
                    Order order = new Order(orderNumber,productName,numberOfUnits,customerName);
                    orders.addMember(order);
                }
                else {status = -1;
                }
            }
        catch (Exception e){}
        }
    }
}