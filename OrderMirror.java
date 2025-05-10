package be.uantwerp;
import java.util.ArrayList;

import be.uantwerp.OrderStandardInputter;
import be.uantwerp.OrderGraphicalInputter;
import be.uantwerp.OrderGraphicalRetriever;

public class OrderMirror {

	public static void main(String [] args) {

		OrderList orders = (new OrderFileReader()).readCsvFile("orders");


		(new OrderGraphicalInputter(orders)).enter();
		(new OrderGraphicalRetriever(orders)).lookUp();
		(new OrderStandardInputter(orders)).enter();
		
		(new OrderFileWriter()).writeCsvFile(orders);
	}
	
}