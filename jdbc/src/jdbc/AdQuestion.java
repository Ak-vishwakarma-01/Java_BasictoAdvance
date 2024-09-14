package jdbc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Period;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class AdQuestion extends JFrame {

	/*
	 wap to design a gui which reads teh emp_id of an employee and prints the work experience of the employee along with employee Name and salary.
	 Also display the Current Date and day on the top right corner of the frame.
	 
	  
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdQuestion frame = new AdQuestion();
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
	public AdQuestion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setLayout(null);
		
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("EmpId:-");
		lblNewLabel.setFont(new Font("STZhongsong", Font.BOLD, 14));
		lblNewLabel.setBounds(77, 104, 110, 32);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("STZhongsong", Font.BOLD, 14));
		textField.setBounds(182, 97, 185, 46);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String empId = textField.getText();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdbms", "root", "12345678@");
					Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("select *from emp where empId = '"+empId+"'");
                                   
                  while (rs.next()) {
                	  LocalDate pr = LocalDate.parse(rs.getString("joindate"));
                	  LocalDate curdate = LocalDate.now();
                	  Period period = Period.between(pr,curdate);
                	  int s = period.getYears();
                	  String experi = Integer.toString(s);
                	  experi += " years";
                	  
                	  
                      model.addRow(new Object[]{
                      	rs.getString("empId"),
                          rs.getString("name"),
                          rs.getString("salary"),
                          rs.getString("joindate"),
                          experi
                      	
                      });
                      table.setModel(model);
                  }
					
				}catch(Exception ae){
					JOptionPane.showMessageDialog(null, ae);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(404, 105, 110, 28);
		contentPane.add(btnNewButton);
		
		String columnNames[] = {"EmpId", "EmpName", "Sallary" , "JoiningDate", "WorkExperience"};
        model = new DefaultTableModel(columnNames, 0);
        
        
        table = new JTable();
        JScrollPane myScroll = new JScrollPane(table);
		myScroll.setBounds(67, 169, 540, 284);
		contentPane.add(myScroll, BorderLayout.CENTER); 
		
		JLabel lblNewLabel_1 = new JLabel("Date");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(77, 30, 74, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel();
				LocalDate ld = LocalDate.now();
				String dayDate = "";
				dayDate += ld.getDayOfWeek();
				dayDate +="- ";
				dayDate += ld.getMonth();
				dayDate += "- ";
				dayDate += ld.getYear();
				lblNewLabel_3.setText(dayDate);
				
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(179, 27, 188, 32);
		contentPane.add(lblNewLabel_3);
	}
}
