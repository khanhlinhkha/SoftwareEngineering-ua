package be.uantwerp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.*;

public class OrderGraphicalRetriever {
	OrderList orders = null;
	OrderListSearcher orderSearcher = null;

	public OrderGraphicalRetriever(OrderList aOrders) {
		orders = aOrders;
		orderSearcher = new OrderListSearcher(aOrders);
	}

	public void lookUp() {		
		final JFrame dialog = new JFrame("Retrieving orders");
		JLabel dialogLabel = new JLabel("Select action:" + "\n");
		JButton customernameButton = new JButton("Search by customer name");
		JButton unitButton = new JButton("Search by number of units");
		JButton cancelButton = new JButton("Exit retrieval");
		dialog.add(dialogLabel);
		dialog.add(customernameButton);
		dialog.add(unitButton);
		dialog.add(cancelButton);

		dialog.setLayout(new FlowLayout());
		dialog.pack();
		dialog.setLocation(500, 100);
		dialog.setVisible(true);

		//Search Customer name
		customernameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				String name = JOptionPane.showInputDialog("customerName = ");
				OrderList resultsCustName = orderSearcher.searchCustomerNameEqualTo(name);
				write(resultsCustName);
			}
		});
		
		//Search Position
		unitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
                Integer unit = Integer.parseInt(JOptionPane.showInputDialog("Units > "));
				OrderList resultsUnits = orderSearcher.searchNumberOfUnitsGreaterThan(unit);
				write(resultsUnits);
			}
		});	

		//Press Cancel and the dialog closes.
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				dialog.dispose();
			}
		});  
	}

	public void write(OrderList results) {
		String result = JOptionPane.showInputDialog("Output [Screen/File]: ");
		if (result.contains("F"))
			(new OrderFileWriter()).writeCsvFile(results);
		else JOptionPane.showMessageDialog(null, results.toString());
	}	
}