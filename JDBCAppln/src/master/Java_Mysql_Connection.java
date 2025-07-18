package master;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
class TestConnection
{
	private Connection cn=null;
	private Statement st=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	private Scanner sc;
	private String select_sql="select * from customer";
	private String insert_sql="insert into customer values(?,?,?)";
	private String delete_sql="delete from customer where cid=?";
	private String update_sql="update customer set cname=?,cphno=? where cid=?";
	public void getData()
	{
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/JEE_DBS","root","arindam");
		st=cn.createStatement();
		rs=st.executeQuery(select_sql);
		System.out.println("FETCHING DATA=======");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"===>"+rs.getString(2)+"===>"+rs.getString(3));
		}
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
				
	}
	public void addData()
	{
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/JEE_DBS","root","arindam");
		ps=cn.prepareStatement(insert_sql);
		sc=new Scanner(System.in);
		System.out.println("INSERT DATA========");
		System.out.println("ENTER THE CID");
		String cid=sc.next();
		System.out.println("ENTER THE NAME");
		String cname=sc.next();
		System.out.println("ENTER THE PHONE NUMBER");
		String cphno=sc.next();
		ps.setString(1, cid);
		ps.setString(2,cname);
		ps.setString(3, cphno);
		ps.executeUpdate();
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	public void updateData()
	{
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/JEE_DBS","root","arindam");
		ps=cn.prepareStatement(update_sql);
		sc=new Scanner(System.in);
		System.out.println("INSERT DATA========");
		System.out.println("ENTER THE CID");
		String cid=sc.next();
		System.out.println("ENTER THE NAME");
		String cname=sc.next();
		System.out.println("ENTER THE PHONE NUMBER");
		String cphno=sc.next();
		ps.setString(3, cid);
		ps.setString(1,cname);
		ps.setString(2, cphno);
		ps.executeUpdate();
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	public void deleteData()
	{
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/JEE_DBS","root","arindam");
		ps=cn.prepareStatement(delete_sql);
		sc=new Scanner(System.in);
		System.out.println("DELETE DATA========");
		System.out.println("ENTER THE CID");
		String cid=sc.next();
		ps.setString(1, cid);
		ps.executeUpdate();
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
}
public class Java_Mysql_Connection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     TestConnection ts=new TestConnection();
   //  ts.addData();
     //ts.deleteData();
     ts.updateData();
     ts.getData();
	}

}
