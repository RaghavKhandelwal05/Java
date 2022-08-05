//Q. Write an AWT application that contains a frame and two buttons RED and 
//BLUE. On clicking the button give respective colour to the frame

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorDemo extends Frame implements ActionListener
{
	String msg="";
	JButton btn1,btn2;
	ColorDemo()
	{
		setLayout(new FlowLayout());
		setSize(500,500);
		setVisible(true);
		btn1=new JButton("RED");
		btn2=new JButton("BLUE");
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		addWindowListener(new WindowClose());
		
		add(btn1);
		add(btn2);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btn1)
		{
			setBackground(Color.red);
		}
		else if(ae.getSource()==btn2)
		{
			setBackground(Color.blue);
		}
	}
	class WindowClose extends WindowAdapter
	{
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
	}
	public static void main(String args[])
	{
		new ColorDemo();
	}
}
