package master.dao;
import java.sql.*;


import master.dto.RegisterDto;
import master.utilities.ConnectionFactory;
public class RegisterDao {
	private Connection cn=null;
	private Statement st=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	private String insert_sql="insert into reg values(?,?,?,?,?)";
	public void addData(RegisterDto fdto)
	{
		try
		{
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConn();
			System.out.println(cn);
			ps=cn.prepareStatement(insert_sql);
			ps.setString(1,fdto.getUname());
			ps.setString(2,fdto.getPass());
			ps.setString(3,fdto.getNm());
			ps.setString(4,fdto.getEmail());
			ps.setString(5,fdto.getPhno());
			ps.executeUpdate();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
}
