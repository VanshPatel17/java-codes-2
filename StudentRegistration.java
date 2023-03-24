import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class StudentRegistration extends JFrame implements FocusListener, ActionListener {
	JLabel lblname, lbladdress, lblage;
	JTextField txtname, txtage;
	JTextArea txtaddress;
	JButton btnadd, btnproject;
	JCheckBox chk1, chk2, chk3;
	JRadioButton rd1, rd2;
	JComboBox<String> cmb1;
	JList<String> list;

	// prj details control
	JTextField txtprjname, txtprjtech;
	JTextArea txtprjdescription;
	JPanel panel1;

	public StudentRegistration() {

		this.setVisible(true);
		this.setBounds(50, 50, 600, 600);
		this.setTitle("Registration");
		this.setLayout(null);

		// design GUI
		lblname = new JLabel("Name");
		lblname.setBounds(50, 50, 80, 30);
		this.add(lblname);

		txtname = new JTextField();
		txtname.setBounds(150, 50, 100, 30);
		this.add(txtname);

		lbladdress = new JLabel("Address");
		lbladdress.setBounds(50, 100, 80, 30);
		this.add(lbladdress);

		txtaddress = new JTextArea();
		txtaddress.setBounds(150, 100, 100, 80);
		this.add(txtaddress);

		txtage = new JTextField();
		txtage.setBounds(150, 200, 100, 30);
		this.add(txtage);
     txtage.addFocusListener(this);
		chk1 = new JCheckBox("C");
		chk2 = new JCheckBox("C++");
		chk3 = new JCheckBox("Java");

		chk1.setBounds(150, 250, 80, 30);
		this.add(chk1);

		chk2.setBounds(250, 250, 80, 30);
		this.add(chk2);

		chk3.setBounds(350, 250, 80, 30);
		this.add(chk3);

		rd1 = new JRadioButton("Yes");
		rd2 = new JRadioButton("No");

		rd1.setBounds(150, 300, 80, 30);
		this.add(rd1);
		rd2.setBounds(250, 300, 80, 30);
		this.add(rd2);

		String[] qualis = { "BE", "ME", "BCA", "MCA", "Diploma" };
		cmb1 = new JComboBox<String>(qualis);
		cmb1.setBounds(150, 350, 100, 30);
		this.add(cmb1);

		btnadd = new JButton("Save");
		btnadd.setBounds(150, 450, 80, 30);
		this.add(btnadd);
		btnadd.addActionListener(this);

		list = new JList<String>();
		list.setBounds(150, 500, 300, 200);
		this.add(list);

		btnproject = new JButton("Add Project Details");
		btnproject.setBounds(250, 450, 180, 30);
		this.add(btnproject);
		btnproject.addActionListener(this);
		txtprjname = new JTextField("Enter Prj Name Here");
		txtprjdescription = new JTextArea();
		txtprjtech = new JTextField();

		panel1 = new JPanel();
		panel1.setBackground(Color.cyan);

		panel1.setBounds(450, 350, 200, 300);
		panel1.add(txtprjname);
		panel1.setVisible(false);
		this.add(panel1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StudentRegistration();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnadd) {
			System.out.println(txtname.getText());
			System.out.println(txtaddress.getText());
			System.out.println(txtage.getText());
			
			System.out.println(chk1.getText());
			System.out.println(chk2.getText());
		//	System.out.println(txtname.getText());

		} else if (e.getSource() == btnproject) {
			panel1.setVisible(true);
		}

	}

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		System.out.println("----gain foucs-----");
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		System.out.println("----focusLost-----");
		int age=Integer.parseInt(txtage.getText());
			
		
		if(age<18 || age>50)
			JOptionPane.showMessageDialog(this, "Invalid Age :must >18 and <50");
	txtage.requestFocus(); 
	}

}
















