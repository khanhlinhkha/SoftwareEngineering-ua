package be.uantwerp;

import java.io.*;
import java.util.ArrayList;

public class OrderFileWriter implements OrderFileWriterIf {
	public void writeCsvFile(OrderList orderList){
        try{
            String outputStr = "";
            for (Order order: orderList.getMembers()){
                System.out.println("Order: " + order.giveOverview());
                outputStr += order.getOrderNumber() + ";" +
                order.getProductName() + ";" +
                order.getNumberOfUnits() + ";" +
                order.getCustomerName() + "\n";
            }
            File nFile = new File (orderList.orderListName + ".csv");
            DataOutputStream nDos = new DataOutputStream(new BufferedOutputStream (new 
                FileOutputStream(nFile.getCanonicalPath(),false)));
            nDos.writeBytes(outputStr);
            nDos.flush();
            nDos.close();
            System.out.println("New file " + orderList.orderListName + ".csv with order list written." + "\n");
        }
        catch (Exception e){}
    }
}