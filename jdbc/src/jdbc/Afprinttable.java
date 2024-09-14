package jdbc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Afprinttable extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private DefaultTableModel model = new DefaultTableModel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Afprinttable frame = new Afprinttable();
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
	public Afprinttable() {
		/*
		 2:- Write a Program which reads the Table Name From the User as command-line argument and prints all the Data of theat Table using 
		 the REsultSEtMeatDAta .
		 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 128));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Enter the Table name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(230, 10, 171, 24);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField.setBounds(230, 46, 168, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 90, 766, 2);
		contentPane.add(separator);
		
		model = new DefaultTableModel();
		table = new JTable(model);
		JScrollPane scroll = new JScrollPane(table);
		scroll.setBounds(39, 102, 709, 446);
		contentPane.add(scroll);
		
		JButton btnNewButton = new JButton("Show");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tablename = textField.getText().trim();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms", "root", "12345678@");
					//PreparedStatement st = con.prepareStatement("select *from ?");
					//st.setString(1, tablename);
					Statement st = con.createStatement();
					String q = "select * from " + tablename;
					ResultSet rs = st.executeQuery(q);
					
					ResultSetMetaData d = rs.getMetaData();
                    int c = d.getColumnCount();
                    String[] col_name = new String[c];	
                    for (int i = 1; i <= c; i++) {
                        col_name[i - 1] = d.getColumnLabel(i);
                    }
                    model.setColumnIdentifiers(col_name);
                    
                    do{
                        Object[] row = new Object[c];
                        for(int i=1;i<=c;i++){
                            row[i-1] = rs.getObject(i);
                        }
                        model.addRow(row);
                    }while(rs.next());
                    table.setModel(model);
				}catch(Exception ae) {
					System.out.println(ae);
				}
				
		        
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(438, 44, 125, 37);
		contentPane.add(btnNewButton);
		
		
		
	}
}
