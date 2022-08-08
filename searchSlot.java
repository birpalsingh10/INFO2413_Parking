package parkingproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class searchSlot {
	String my_searchSlot(String String1) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/parking_proj","root","password");
			Statement st=con.createStatement();
			String query1="SELECT USERID FROM 'parking_proj'.'slotDet"
					+"('SLOTNUM')== String1";	
			st.executeQuery(query1);
			return query1;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}
	void update_slot(String St1, String St2 ) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/parking_proj","root","password");
			Statement st=con.createStatement();
			String query1="UPDATE slotDet"
					+"SET SLOTNUM=St1"
					+"WHERE USERID=St2"; 
			st.executeQuery(query1);
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
