import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.io.IOException;


public class LogInPage{
	public static void main(String[] args) throws IOException {
		 JFrame f = new JFrame("Login");
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        f.setResizable(true);
	        f.setSize(1200,700);
			f.setUndecorated(false);
	        f.getContentPane().setBackground(new Color(90, 187, 232));
	        // Load the image
	        
	        ImageIcon imageIcon = new ImageIcon("C:\\All codes\\java code\\loginBackground.png");
	        Image img = imageIcon.getImage();

	        // Create a JPanel to display the image
	        JPanel imagePanel = new JPanel() {
	            @Override
	            public Dimension getPreferredSize() {
	                // Return the size of the image as the preferred size
	                return new Dimension(img.getWidth(this), img.getHeight(this));
	            }

	            @Override
	            protected void paintComponent(Graphics g) {
	                super.paintComponent(g);
	                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
	            }
	        };

	        // Set the content pane of the JFrame
	        f.setContentPane(imagePanel);

//	        Set the size of the JFrame based on the preferred size of the image
//	        f.pack();

	        // Center the JFrame on the screen
	        f.setLocationRelativeTo(null);

			// JPanel p1 = new JPanel();
			// f.add(p1);
			// p1.setLayout(null);
			 
			imagePanel.setOpaque(false); // make this panel transparent
	        
	        imagePanel.setLayout(null);
	        
			JLabel Username = new JLabel("Username");
	        imagePanel.add(Username);
	        Username.setBounds(50,100, 100,100);
			Username.setForeground(Color.white);
			Username.setFont(new Font("Segoe UI", 1, 14));
		    

			
	        JLabel Password = new JLabel("Password");
	        imagePanel.add(Password);
	        Password.setBounds(50,200,100,20);
            Password.setForeground(Color.white);
			Password.setFont(new Font("Segoe UI", 1, 14));
			


			JTextField userfield = new JTextField();
			imagePanel.add(userfield);
			userfield.setBounds(150,143,200,20);
			userfield.setFont(new Font("Segoe UI", 1, 14));


			JPasswordField passwordField = new JPasswordField();
			imagePanel.add(passwordField);
			passwordField.setBounds(150,200,200,20);
			passwordField.setFont(new Font("Segoe UI", 1, 14));

			
			JCheckBox showpas = new JCheckBox("Show Password");
			imagePanel.add(showpas);
			showpas.setBounds(150,250,130,20);
			showpas.setFont(new Font("Segoe UI", 1, 14));

			JButton login = new JButton("login",new ImageIcon("C:\\All codes\\java code\\BillingManagementSystem\\src\\BillingManagementSystem\\login.png"));
			imagePanel.add(login);
			login.setBounds(150,300,100,20);
			login.setFont(new Font("Segoe UI", 1, 14));


			JButton close = new JButton("close", new ImageIcon("C:\\All codes\\java code\\BillingManagementSystem\\src\\BillingManagementSystem\\close Jframe.png"));
			imagePanel.add(close);
			close.setBounds(290,300,100,20);
			close.setFont(new Font("Segoe UI", 1, 14));
			close.addActionListener(ae -> {
				int a = JOptionPane.showConfirmDialog(null,"do you really want to close","select",JOptionPane.YES_NO_OPTION);
			    if(a==0) {
			    	System.exit(0);
			    }
			});
			
	        

	        // Make the JFrame visible
			f.setVisible(true);
	    }

}
