
package ElectricityBillingSystem;
import java.sql.*;
public class connection_db {
	public void setQuery(String query) {
		this.query = query;
	}

	static String query;

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/temp";
		String userName="";  //insert your db username
		String password=""; // insert your password to run 
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, userName, password);
			Statement st= con.createStatement();
			ResultSet rs=st.executeQuery(query);
			rs.next();
//			String name=rs.getString("name");
//			System.out.println(name);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
