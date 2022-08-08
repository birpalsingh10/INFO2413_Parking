package parkingproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class ticsubmit {
	void my_ticsubmit(String string1,String string2,String string3,String string4) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/parking_proj","root","password");
			Statement st=con.createStatement();
			String query1="INSERT INTO 'parking_proj'.'issue_tick"
					+"('USER_ID','TICKET_DATE','VEHICLE_NO','PARK_VIOLATION_TYPE')"
					+"VALUES('"+ string1+"','"+string2+"','"+string3+"','"+string4+"')";
			st.executeQuery(query1);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
