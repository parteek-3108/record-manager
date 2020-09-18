import java.awt.*;
import java.awt.Color.*;
import java.util.*;
import java.awt.event.*;
import java.sql.*;
public class recordmanager extends Frame implements ActionListener
{
	public recordmanager()
	{

		Button add=new Button("Add");
		Button show=new Button("Show");
		Button edit=new Button("Edit");
		add.setBounds(100,100,100,100);
		show.setBounds(250,100,100,100);
		edit.setBounds(400,100,100,100);
		add(add);
		add(show);
		add(edit);
		add.addActionListener(this);
		show.addActionListener(this);
		edit.addActionListener(this);

		setBackground(Color.black);
		setSize(1400,1400);
		setLayout(null);
		setVisible(true);

	}
	public void actionPerformed(ActionEvent e)
	{ 
System.out.println(e.getSource());
if(((Button)e.getSource()).getLabel().equals("Show"))
{
try{  
Class.forName("oracle.jdbc.driver.OracleDriver");  
  
//step2 create  the connection object  
Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:xe","DEMODBJAVA","parteek@1234");  
  
//step3 create the statement object  
Statement stmt=con.createStatement(); 
 ResultSet rs=stmt.executeQuery("SELECT * FROM DEMO_STATES");
 while(rs.next())
  {
  	System.out.println(rs);
  }
}
catch(Exception e1)
{
	System.out.println("Exception"+e1);
}
	}
}
	public static void main(String args[])
	{
		recordmanager rm=new recordmanager();
	}
}