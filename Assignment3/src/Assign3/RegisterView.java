package Assign3;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import DB.MyDB;

public class RegisterView extends JFrame {
	
	private static final long serialVersionUID = 1L;

	private JTextField user;
	private JTextField email;
	private JTextField pw;
	private InventoryController invC;

	public RegisterView(InventoryController invC){
		this.invC = invC;
		
		this.setLayout(new BorderLayout());
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 2));
		
		panel.add(new JLabel("User Name"));
		user = new JTextField();
		panel.add(user);
		
		panel.add(new JLabel("Password"));
		pw = new JTextField();
		panel.add(pw);
		
		panel.add(new JLabel("Email"));
		email = new JTextField();
		panel.add(email);
		
		this.add(panel, BorderLayout.CENTER);
		
		this.setLayout(new BorderLayout());
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(1,1));
		
		JButton button = new JButton("Register");
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				User newUser = new User(user.getText(), email.getText(), 0);
				MyDB db = null;
				db.register(newUser, pw.getText());
			}
		});
		buttonPanel.add(button);
		this.add(buttonPanel,BorderLayout.SOUTH);
	}
	
	
}
