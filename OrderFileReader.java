package be.uantwerp;

import java.io.*;
import java.util.ArrayList;

import be.uantwerp.OrderList;

public class OrderFileReader {
	public OrderList readCsvFile(String aName){
        OrderList orderList = new OrderList(aName);
        try{
            int lineNr = 0;
            File aFile = new File(aName+".csv");
            BufferedReader aBr = new BufferedReader(new FileReader(aFile));
            String aLine = "";
            while (aLine != null){
                aLine = aBr.readLine();
                if (aLine != null){
                    String [] lineParts = aLine.split(";",-1);
                    if (lineParts.length == 4){
                        int orderNumber = Integer.parseInt(lineParts[0]);
                        int numberOfUnits = Integer.parseInt(lineParts[2]);
                        Order order = new Order(orderNumber, lineParts[1], numberOfUnits, lineParts[3]);
                        orderList.addMember(order);
                    }
                    else System.out.println("Number of attributes <> 4 on " + lineNr);
                    lineNr++;
                }
            }
            System.out.println("Number of persons that were read: " + lineNr);
        }
        catch (Exception e){}
        return orderList;
    }
}