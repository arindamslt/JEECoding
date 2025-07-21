package master.dao;
import java.sql.*;

import master.utilities.ConnectionFactory;
public class LoginDao {
	private Connection cn=null;
	private Statement st=null;
	private ResultSet rs=null;
	public boolean checkLogin(String uname,String pass)
	{
		boolean flag=false;
		try
		{
		String check_sql="select * from reg where uname='"+uname+"' and pass='"+pass+"'";
		ConnectionFactory con=new ConnectionFactory();
		cn=con.getConn();
		st=cn.createStatement();
		rs=st.executeQuery(check_sql);
		if(rs.next())
		{
			flag=true;
		}
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		return flag;
	}
}
