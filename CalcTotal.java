//Q. Write a java program using swing that accept item name, item quantity and 
//price and display total amount as an output (in separate textbox).
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CalcTotal extends Frame implements ActionListener
{
	JLabel l1,l2,l3,l4;
	JTextField t1,t2,t3,t4;
	JButton b1,b2;
	
	CalcTotal()
	{
		setLayout(new FlowLayout());
		l1=new JLabel("Item name");
		l2=new JLabel("Quantity");
		l3=new JLabel("Price");
		l4=new JLabel("Total");
		
		t1=new JTextField(20);
		t2=new JTextField(20);
		t3=new JTextField(20);
		t4=new JTextField(20);
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(l4);
		add(t4);
		
		b1=new JButton("TOTAL");
		b2=new JButton("CLEAR");
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		addWindowListener(new WindowClose());
		
		setVisible(true);
		setSize(600,500);
	}
	class WindowClose extends WindowAdapter
	{
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s2=t2.getText();
		String s3=t3.getText();
		
		if(ae.getSource()==b1)
		{
			int q=Integer.parseInt(s2);
			int p=Integer.parseInt(s3);
			int tot=p*q;
			t4.setText(Integer.toString(tot));
		}
		else if(ae.getSource()==b2)
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
		}
	}
	public static void main(String args[])
	{
		new CalcTotal();
	}
}
