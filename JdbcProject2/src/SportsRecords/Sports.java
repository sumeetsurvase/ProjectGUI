package SportsRecords;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Sports 
{
	 public static void main(String args[]) throws Exception
	 {
		String sportname1 = "kabaddi";
		String sportperson1 = "Anup kumar";
		int Goldmedal1 = 1;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Jdbc_db","root","sumeet123");
		PreparedStatement ps = con.prepareStatement("insert into list values(?,?,?)");
		
		ps.setString(1,sportname1);
		ps.setString(2,sportperson1);
		ps.setInt(3, Goldmedal1);
		
		int i = ps.executeUpdate();
		if(i>0)
		{
			System.out.println("sucess");
		}
		else
		{
			System.out.println("fail");
		}	
	 }

	
 }



