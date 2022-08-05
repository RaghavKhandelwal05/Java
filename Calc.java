//Q.3b) - Create a calculator with functionality in an Applet.

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

//<applet code="Calc" width=500 height=500></applet>

public class Calc extends Applet implements ActionListener
{
	String  cmd[]={"+","-","*","/","=","C"};
	int pv=0;
	int mv=0;
	String op=" ";
	Button b[]=new Button[16];
	TextField t1=new TextField(10);
	Panel p1,p2; 
	
	public void init()
	{
		setLayout(new BorderLayout());
		Label lblmsg=new Label("Simple Calculator");
		add(t1,"North");
		
		t1.setText("0");
		Panel p=new Panel();
		p.setLayout(new GridLayout(4,4));
		for(int i=0;i<16;i++)
		{
			if(i<10)
				b[i]=new Button(String.valueOf(i));
			else
				b[i]=new Button(cmd[i%10]);
			b[i].setFont(new Font("Arial",Font.BOLD,25));
			p.add(b[i]);
			add(p,"Center");
			b[i].addActionListener(this);
		}
	}
	public void actionPerformed(ActionEvent ae)
	{
		int res=0;
		String cap=ae.getActionCommand();
		System.out.println("cap is "+cap);
		if(mv==1)
			t1.setText("0");
		System.out.println(t1.getText());
		int cv=Integer.parseInt(t1.getText());
		System.out.println("cv is"+cv);
		if(cap.equals("C"))
		{
			t1.setText("0");
			pv=0;
			cv=0;
			res=0;
			op=" ";
		}
		else if(cap.equals("="))
		{
			res=0;
			if(op=="+")
				res=pv+cv;
			else if(op=="-")
				res=pv-cv;
			else if(op=="*")
				res=pv*cv;
			else if(op=="/")
				res=pv/cv;
			t1.setText(String.valueOf(res));
		}
		else if(cap.equals("+")||cap.equals("-")||cap.equals("*")||cap.equals("/"))
		{
			t1.setText(cap);
			pv=cv;
			System.out.println("pv is"+pv);
			System.out.println("cv is"+cv);
			op=cap;
			mv=1;
		}
		else
		{
			int v=cv*10+Integer.parseInt(cap);
			t1.setText(String.valueOf(v));
			System.out.println("v is"+v);
			mv=0;
		}
	}
}
		