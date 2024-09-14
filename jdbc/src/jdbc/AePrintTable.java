package jdbc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AePrintTable extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AePrintTable frame = new AePrintTable();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AePrintTable() {
		
		//  1:- Use Swing Api to desing a"Temperatur Converter" where provide JComboBox to select the Unit of Input Type, Output tupe and 
		//  TextFiedl to read the value to be coverted and Display the result in non-editable field. 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,500);		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 128));
		contentPane.setLayout(null);
        setContentPane(contentPane);
        
        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.BOLD, 14));
        textField.setBounds(260, 97, 111, 37);
        contentPane.add(textField);
        textField.setColumns(10);
        
        JLabel lblNewLabel = new JLabel("Enter the number and Select the Temprature Type");
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lblNewLabel.setBounds(169, 50, 328, 37);
        contentPane.add(lblNewLabel);
        
        JComboBox comboBox = new JComboBox();
        comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"Fahrenheit", "Celsius", "Kelvin"}));
        comboBox.setBounds(242, 144, 152, 37);
        contentPane.add(comboBox);
        
        JLabel lblSelectTheType = new JLabel("Select the type to Convert");
        lblSelectTheType.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lblSelectTheType.setBounds(232, 191, 180, 37);
        contentPane.add(lblSelectTheType);
        
        JComboBox comboBox_1 = new JComboBox();
        comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Fahrenheit", "Celsius", "Kelvin"}));
        comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        comboBox_1.setBounds(242, 230, 152, 37);
        contentPane.add(comboBox_1);
        
        textField_1 = new JTextField();
        textField_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        textField_1.setEditable(false);
        textField_1.setColumns(10);
        textField_1.setBounds(242, 273, 152, 37);
        contentPane.add(textField_1);
        
        JButton btnNewButton = new JButton("Show");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String input = textField.getText();
        		if(!(input.matches("\\d+")) ) {
        			JOptionPane.showInternalMessageDialog(null, "Enter valid input");
        		}else{	
        			if(comboBox.getSelectedItem() == comboBox_1.getSelectedItem()) {
        				JOptionPane.showInternalMessageDialog(null, "Both Input and the form to Convert Both are same select something else");
        			}
        			if(comboBox_1.getSelectedItem()=="Fahrenheit") {
        				if(comboBox.getSelectedItem()=="Celsius") {
        					float conv = Float.parseFloat(input);
        					conv = (conv* 9/5) + 32 ;
        					textField_1.setText(Float.toString(conv)+" °F");
        				}
        				if(comboBox.getSelectedItem()=="Kelvin") {
        					float conv = Float.parseFloat(input);
        					conv = (float) ((conv - 273.15)*9/5 + 32) ;
        					textField_1.setText(Float.toString(conv)+" °F");
        				}
        			}
        			if(comboBox_1.getSelectedItem()=="Celsius") {
        				if(comboBox.getSelectedItem()=="Fahrenheit") {
        					float conv = Float.parseFloat(input);
        					conv = (conv - 32) * 5/9 ;
        					textField_1.setText(Float.toString(conv)+" °C");
        				}
        				if(comboBox.getSelectedItem()=="Kelvin") {
        					float conv = Float.parseFloat(input);
        					conv =  (float)(conv - 273.15) ;
        					textField_1.setText(Float.toString(conv)+" °C");
        				}
        			}
        			if(comboBox_1.getSelectedItem()=="Kelvin") {
        				if(comboBox.getSelectedItem()=="Fahrenheit") {
        					float conv = Float.parseFloat(input);
        					conv = (float) ((conv - 32) * 5/9 + 273.15) ;
        					textField_1.setText(Float.toString(conv)+" K");
        				}
        				if(comboBox.getSelectedItem()=="Celsius") {
        					float conv = Float.parseFloat(input);
        					conv =  (float) (conv + 273.15) ;
        					textField_1.setText(Float.toString(conv)+" K");
        				}
        			}
        		}
        	} 
        });
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnNewButton.setBounds(478, 200, 111, 49);
        contentPane.add(btnNewButton);
	}
}
