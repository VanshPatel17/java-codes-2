package com.gui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TestTexChnage extends JFrame implements KeyListener{

	JLabel lblUserName;// = new JLabel("Enter User Name");
	JLabel lblPwd;
	JTextField txt1,txt2;
 
	JButton btnLogin;
	JButton btnclear;

	public TestTexChnage() {

		lblUserName = new JLabel("Enter   Name");
		lblPwd = new JLabel("Name");
		txt1 = new JTextField();
		txt2 = new JTextField();
		btnLogin = new JButton("Submit");
		btnclear = new JButton("Clear");

		this.setLayout(null);// imp
		this.setTitle("Login Form");
		this.setBounds(100, 100, 400, 400);
		this.setVisible(true);// imp

		lblUserName.setBounds(50, 70, 200, 30);
		// lblUserName.setFont(new Font("Arial",Font.BOLD, 20));
		this.add(lblUserName);

		lblPwd.setBounds(50, 150, 200, 30);
		this.add(lblPwd);

		// accept input :textField

		txt1.setBounds(200, 70, 200, 30);
		;
		this.add(txt1);

		txt2.setBounds(200, 150, 200, 30);
		this.add(txt2);

		btnLogin.setBounds(200, 200, 100, 30);
		this.add(btnLogin);

		btnclear.setBounds(320, 200, 100, 30);
		this.add(btnclear);
		
		txt1.addKeyListener(this);
		 
	}
	public static void main(String[] args)
	{System.out.println("----");
		new TestTexChnage();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("----key type----");
		//System.out.println("----key pressed----");
		txt2.setText(txt1.getText());
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyChar());
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	 
}
