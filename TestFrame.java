import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestFrame extends JFrame{

	public TestFrame()
	{
		this.setTitle("Border Layout");
		this.setBounds(150, 140, 600, 600);// x,y,width,height
		this.setVisible(true);
		
		//border layout
		
		JButton btn1=new JButton("Top");
		JButton btn2=new JButton("Bottom");
		JButton btn3=new JButton("Left");
		JButton btn4=new JButton("Right");
		JButton btn5=new JButton("Center");
		
		//place/add all btns on frame
		//border layout
//		 this.add(btn1,BorderLayout.NORTH);
//		 this.add(btn2,BorderLayout.SOUTH);
//		 this.add(btn3,BorderLayout.WEST);
//		 this.add(btn4,BorderLayout.EAST);
//		 this.add(btn5,BorderLayout.CENTER);
		 
		 //flowLayout
		
//	    	this.setLayout(new FlowLayout());
//		 this.add(btn1);
//		 this.add(btn2);
//		 this.add(btn3);
//		 this.add(btn4);
//		 this.add(btn5);
				 
		//gridLayout
		JButton bt1=new JButton("1");
		JButton bt2=new JButton("2");
		JButton bt3=new JButton("3");
		JButton bt4=new JButton("4");
		JButton bt5=new JButton("5");
		JButton bt6=new JButton("6");
		JButton bt7=new JButton("7");
		JButton bt8=new JButton("8");
		JButton bt9=new JButton("9");
		
		this.setLayout(new GridLayout(3, 3,20,20));
		this.add(bt1);
		this.add(bt2);
		this.add(bt3);
		this.add(bt4);
		this.add(bt5);
		this.add(bt6);
		this.add(bt7);
		this.add(bt8);
		this.add(bt9);
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestFrame();

	}

}
