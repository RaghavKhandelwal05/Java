//Q.17a) – Write a Java program to display the working of AnonymousInnerClass.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//<applet code="AnonymousInnerClass" width=500 height=500></applet>

public class AnonymousInnerClass extends Applet
{
	public void init()
	{
		addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent me)
			{
				showStatus("Mouse Clicked");
			}
		});
	addMouseMotionListener(new MouseMotionAdapter()
	{
		public void mouseMoved(MouseEvent me)
		{
			showStatus("Mouse Moved");
		}
	});
	}
}
	

	
	

