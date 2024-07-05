package com.sp_record_2;

import java.sql.DriverManager;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Sports_Record_2 {

	public static void main(String args[]) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql:localhost:3306//Jdbc_db:","root","sumeet123");
		
		Scanner sc = new Scanner(System.in);
		PreparedStatement ps = null;
		for(int i=1; i<=4; i++)
		{
			System.out.println("Enter cricketername");
			String name = sc.next();
			System.out.println("Enter strikerate");
			int strikerate = sc.nextInt();
			System.out.println("Enter bestscore");
			int bestscore = sc.nextInt();
		    ps = con.prepareStatement("insert into matchlist values(?,?,?)");
			
			ps.setString(1,name);
			ps.setInt(2,strikerate);
			ps.setInt(3,bestscore);
			ps.executeUpdate();
		}
		ps.close();
		con.close();
	}
}
