import java.awt.*;
import java.awt.Color.*;
import java.util.*;
import java.awt.event.*;
public class recordmanager extends Frame implements ActionListener
{
	MenuBar mb1=new MenuBar();
	Choice c=new Choice();
	public recordmanager()
	{
		Menu m1=new Menu("Record Manager");
		MenuItem m11=new MenuItem("RecordManager");
		m1.add(m11);
		mb1.add(m1);
		mb1.setFont(new Font("SERIF",Font.PLAIN,20));
		
		m1.addActionListener(this);
	setBackground(Color.black);
		setMenuBar(mb1);

		setSize(1000,1000);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{

		System.out.println(((MenuItem)e.getSource()).getLabel());
	}
	public static void main(String args[])
	{
		recordmanager rm=new recordmanager();
	}
}