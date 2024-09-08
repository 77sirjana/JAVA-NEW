package com.nist.exception.custom;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 

public class SwingPratice {
	public static void main(String[] args) {
		 JFrame frame = new JFrame("User Information Form");
	        frame.setSize(400, 300);	 
	        frame.setLayout(null); 
	        frame.setResizable(false);
	        JLabel a = new JLabel("First Number:");
	        a.setBounds(10,10,100,30);
	        frame.add(a);
	        JTextField a1 = new JTextField();
	        a1.setBounds(120, 10, 100, 30);
	        frame.add(a1);
	        
	        JLabel b = new JLabel("Second Number:");
	        b.setBounds(10,60,100,30);
	        frame.add(b);
	        JTextField b1 = new JTextField();
	        b1.setBounds(120,80, 100, 30);
	        frame.add(b1);

	        JLabel totalLabel = new JLabel("Total:");
	        totalLabel.setBounds(10, 120, 100, 30);
	        frame.add(totalLabel);
	        
	        JTextField totalField = new JTextField();
	        totalField.setBounds(120, 120, 100, 30);
	        totalField.setEditable(false); 
	        frame.add(totalField);
	       
	        JButton submitButton = new JButton("Submit");
	        submitButton.setBounds(90, 180, 100, 30);
	        frame.add(submitButton);     
	        
	        JButton clearButton = new JButton("Clear");
	        clearButton.setBounds(200, 180, 100, 30);
	        frame.add(clearButton);    
	        
	        ActionListener action =  new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String firstNumber = a1.getText();
					String secondNumber = b1.getText();
					
					int a = Integer.parseInt(firstNumber);
					int b = Integer.parseInt(secondNumber);
					int c = a + b;
					
					String result = String.valueOf(c);					
					totalField.setText(result);
					
				}
			};      
			submitButton.addActionListener(action);
			
			
			ActionListener clear = new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					a1.setText("");  
		            b1.setText("");  
		            totalField.setText("");  
				}
			};
			clearButton.addActionListener(clear);

			frame.setVisible(true);
	    }
	}