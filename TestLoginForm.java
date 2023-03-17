import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TestLoginForm extends JFrame {

	public TestLoginForm() {

		this.setTitle("Login Form");
		this.setBounds(100, 100, 400, 400);
		this.setVisible(true);//imp
		
		//lable to give purpose
		 //default layout is Border Layout
		
		this.setLayout(null);//imp
		
		JLabel lblUserName=new JLabel("Enter User Name");
		lblUserName.setBounds(50, 70, 200	, 30);
		//lblUserName.setFont(new  Font("Arial",Font.BOLD, 20));
		this.add(lblUserName);
		
		JLabel lblPwd=new JLabel("Enter Password");
		lblPwd.setBounds(50, 150, 200, 30);
		this.add(lblPwd);
		
		
		//accept input :textField
		JTextField txtusername=new JTextField();
		txtusername.setBounds(200,70,200,30);;
		this.add(txtusername);
		
		JPasswordField txtpwd=new JPasswordField();
		txtpwd.setBounds(200, 150, 200, 30);
		this.add(txtpwd);
		
		
		JButton btnLogin=new JButton("Login");
		btnLogin.setBounds(200, 200, 100, 30);
		this.add(btnLogin);		
		
		JButton btnclear=new JButton("Clear");
		btnclear.setBounds(320, 200, 100, 30);
		this.add(btnclear);		
	}
public void sayHello()
{
	System.out.println("----login----");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestLoginForm();
	}

}
