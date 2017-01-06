package main;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class MainBuild {
	static JFrame frame = null;
	static JPanel panel = null;
	static JLabel typeLabel = null;
	static JLabel costLabel = null;
	static JLabel incomeLabel = null;
	static JLabel summaryLabel = null;
	static JTextArea costOutput = null;
	static JTextArea sumOutput = null;
	static JTextArea summaryOutput = null;
	static JTextArea custom_border1 = null;
	static JTextArea custom_border2 = null;
	static JTextField typeInput = null;
	static JTextField costInput = null;
	static JTextField incomeInput = null;
	static JButton addBtn = null;
	static JButton removeBtn = null;
	static JButton aboutBtn = null;
	static JButton advancedBtn = null;
	static JButton helpBtn = null;
	static JButton calculateBtn = null;
	static JButton exportBtn = null;
	static JComboBox incomeCombo = null;
	
	
	static final String howOften_choices[] = {"Biweekly", "Monthly", "Annual"};
	
	MainBuild(){
		/**Initialize components*/
		frame = new JFrame("Buget Me");
		panel = new JPanel();
		typeLabel = new JLabel("Type");
		costLabel = new JLabel("Cost");
		incomeLabel = new JLabel("Income");
		summaryLabel = new JLabel("Summary");
		costOutput = new JTextArea();

		sumOutput = new JTextArea("Total:");
		summaryOutput = new JTextArea();
		custom_border1 = new JTextArea();
		custom_border2 = new JTextArea();
		typeInput = new JTextField();
		costInput = new JTextField();
		incomeInput = new JTextField();
		calculateBtn = new JButton("Calculate");
		exportBtn = new JButton("Export");
		advancedBtn = new JButton("Advanced");
		aboutBtn = new JButton("About");
		helpBtn = new JButton("Help");
		addBtn = new JButton("+");
		removeBtn = new JButton("-");

		incomeCombo = new JComboBox(howOften_choices);
		
		/**Border for the different components*/
		Border border = BorderFactory.createLineBorder(Color.BLACK);
		Border border2 = BorderFactory.createLineBorder(Color.GRAY);
		
		/**Configuring frame*/
		frame.setSize(625, 355);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.getContentPane().add(panel);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/**Adding components to main panel*/
		panel.setLayout(null);
		panel.add(typeLabel);		
		panel.add(costLabel);				
		panel.add(incomeLabel);				
		panel.add(summaryLabel);
		
		panel.add(typeInput);	
		panel.add(costInput);					
		panel.add(incomeInput);
		
		panel.add(costOutput);
		panel.add(sumOutput);
		panel.add(summaryOutput);
		panel.add(custom_border1);
		panel.add(custom_border2);

		panel.add(calculateBtn);
		panel.add(exportBtn);	
		panel.add(advancedBtn);
		panel.add(helpBtn);
		panel.add(removeBtn);
		panel.add(addBtn);
		panel.add(aboutBtn);

		panel.add(incomeCombo);				
		
		/*Setting bounds of components*/
		typeLabel.setBounds(125, 5, 30, 15);
		costLabel.setBounds(255, 5, 30, 15);
		incomeLabel.setBounds(125, 255, 55, 15);
		summaryLabel.setBounds(475, 5, 60, 15);
		
		typeInput.setBounds(125, 20, 120, 25);
		costInput.setBounds(255, 20, 75, 25);
		incomeInput.setBounds(125, 270, 110, 25);
		
		costOutput.setBounds(125, 50, 205, 150);
		sumOutput.setBounds(125, 205, 205, 20);
		summaryOutput.setBounds(405, 20, 205, 300);
		custom_border1.setBounds(110, 0, 1, 350);
		custom_border2.setBounds(385, 0, 1, 350);
		
		calculateBtn.setBounds(9, 15, 90, 60);
		exportBtn.setBounds(5, 75, 98, 25);
		advancedBtn.setBounds(5, 100, 98, 25);
		aboutBtn.setBounds(5, 250, 98, 25);
		helpBtn.setBounds(5, 275, 98, 25);
		addBtn.setBounds(330, 20, 45, 25);
		removeBtn.setBounds(330, 50, 45, 25);

		incomeCombo.setBounds(120, 295, 120, 30);
		
		
		/*Component specific configurations*/
		typeInput.setBorder(border);
		costInput.setBorder(border);
		incomeInput.setBorder(border);
		
		costOutput.setBorder(border);
		costOutput.setEditable(false);

		sumOutput.setBorder(border);
		sumOutput.setEditable(false);
		
		summaryOutput.setBorder(border);
		summaryOutput.setEditable(false);
		
		custom_border1.setBorder(border2);
		custom_border1.setEditable(false);
		
		custom_border2.setBorder(border2);
		custom_border2.setEditable(false);
		
	}
	
	public static void main(String[] args){
		//new MainBuild();
		new Buttons();
	}
}
