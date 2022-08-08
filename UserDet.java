package parkingproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class UserDet {
	void my_UserDet(String string1,String string2,String string3) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/parking_proj","root","password");
			Statement st=con.createStatement();
			String query1="INSERT INTO 'parking_proj'.'userDet"
					+"('USER_ID','VEHICLE_NUM','LICENSE_NUM')"
					+"VALUES('"+ string1+"','"+string2+"','"+string3+"')";
			st.executeQuery(query1);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
