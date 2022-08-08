package parkingproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class extTim {
	void my_extTim(String string1,String string2,String string3) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/parking_proj","root","password");
			Statement st=con.createStatement();
			String query1="INSERT INTO 'parking_proj'.'extTIME"
					+"('USER_ID','SLOT_NO','EXTENSIONGIVEN')"
					+"VALUES('"+ string1+"','"+string2+"','"+string3+"')";
			st.executeQuery(query1);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
