package com.taster;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.text.LayoutQueue;

public class TestBorderLayout extends JFrame {

	public TestBorderLayout() {
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
		 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestBorderLayout();
	}

}
