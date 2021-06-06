package client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//suppress warnings
@SuppressWarnings("serial")

public class SymbolPanel extends JPanel{
    JLabel title, symbol_label;
    JTextField symbol_textbox;
    JButton next_button, quit_button;
    

    public SymbolPanel(){
        super();
        this.setBackground(new Color(204, 236, 239));
        this.setPreferredSize(new Dimension(600,600));
        this.setLayout(null);

        title = new JLabel("", JLabel.CENTER);
		title.setFont(new Font("Tahoma", Font.BOLD, 20));
		title.setBounds(159, 10, 309, 32);
		this.add(title);
		
		symbol_label = new JLabel("Symbol :");
		symbol_label.setFont(new Font("Tahoma", Font.PLAIN, 17));
		symbol_label.setBounds(80, 119, 130, 32);
		this.add(symbol_label);
		
		symbol_textbox = new JTextField();
		symbol_textbox.setFont(new Font("Tahoma", Font.PLAIN, 17));
		symbol_textbox.setBounds(220, 120, 280, 32);
		this.add(symbol_textbox);
		// textField.setColumns(10);
		
        next_button = new JButton("Next");
		next_button.setFont(new Font("Tahoma", Font.BOLD, 17));
		next_button.setBounds(318, 293, 136, 40);
		this.add(next_button);

		quit_button = new JButton("Quit");
		quit_button.setFont(new Font("Tahoma", Font.BOLD, 17));
		quit_button.setBounds(123, 293, 87, 40);
		this.add(quit_button);
    }
    //Method to add action listener to button
    public void addButtonListener(ActionListener listenForButton, JButton button){
        button.addActionListener(listenForButton);           
    } 
}