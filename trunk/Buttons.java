package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Buttons extends MainBuild {
	static ArrayList<String> typeList = new ArrayList<String>();
	static ArrayList<Integer> costList = new ArrayList<Integer>();
	
	static int income;
	static int cost;
	static String type;
	
	Buttons(){
		System.out.println("Buttons, reporting for duty.");
		
		calculateBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent a){
					System.out.println("EVENT: Set button");
					
					if(!incomeInput.getText().isEmpty()){
						income = Integer.parseInt(incomeInput.getText());
						System.out.println(income);
					}else
						JOptionPane.showMessageDialog(frame, "Enter income");
			}
		});

		exportBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent a){
					System.out.println("EVENT: Export button");
			}
		});
		
		addBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent a){
					System.out.println("EVENT: Add button");
					
					type = typeInput.getText();
					typeList.add(type);
					
					cost = Integer.parseInt(costInput.getText());
					costList.add(cost);
					
					System.out.println(typeList.get(0) + " " + costList.get(0));
					
					typeInput.setText("");
					costInput.setText("");
					
					int sum = 0;
					for(int i = 0; i < costList.size(); i++)
						sum += costList.get(i);
					
					System.out.println(sum);
					
					
					
			}
		});

		removeBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent a){
					System.out.println("EVENT: Remove button");
			}
		});
		
		
		
		
		aboutBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent a){
				JOptionPane.showMessageDialog(frame, "About");
			}
		});
		
		helpBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent a){
				String message = "• To calculate, there must be user input (i.e. type of bill, cost, and income).\n\n"
								+ "• Enter input to the type of bill and the cost followed by the amiunt of income you have, and the pay period.\n\n"
								+ "• The summary will be filled out to provide detailed information information regarding your budget";
				
				JOptionPane.showMessageDialog(frame, message);
			}
		});
		
		
		
	}
}
