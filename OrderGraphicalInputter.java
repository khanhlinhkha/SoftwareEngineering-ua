package be.uantwerp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.*;

public class OrderGraphicalInputter {

	OrderList orders = null;

	public OrderGraphicalInputter(OrderList aOrders) {
		orders = aOrders;
	}

	public void enter(){
		final JFrame dialog = new JFrame("Inputting orders");
		JLabel dialogLabel = new JLabel("Select action:");
		JButton inputButton = new JButton("Input order");
		JButton cancelButton = new JButton("Exit input");
		dialog.add(dialogLabel);
		dialog.add(inputButton);  
		dialog.add(cancelButton); 

		dialog.setLayout(new FlowLayout());
		dialog.pack();
		dialog.setLocation(500, 200);
		dialog.setVisible(true);

		//Input orders
		inputButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Integer orderNumber = Integer.parseInt(JOptionPane.showInputDialog("Order number:"));
				String productName = JOptionPane.showInputDialog("Product name:");
				Integer numberOfUnits = Integer.parseInt(JOptionPane.showInputDialog("Number of units:"));
                String customerName = JOptionPane.showInputDialog("Customer name:");
				Order newOrder = new Order(orderNumber, productName, numberOfUnits, customerName);
				orders.addMember(newOrder);
			}
		});

		//Quit input
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dialog.dispose();
			}
		});
	}
}