package udistrital.design.patterns.creational.singleton;

import java.sql.ResultSet;
import java.sql.SQLException;


public class TestDB {
	
	private void testDBConnection() {
		MysqlConnect conn1 = MysqlConnect.getDbCon();
//		System.out.println(conn1.getDbCon());		
		try {
			conn1.getDbCon();
			String query = "SELECT * FROM author";
			ResultSet rs = conn1.query(query);
			while (rs.next()) {
				int id = rs.getInt("oid");
				String biography = rs.getString("biography");
				String nationality = rs.getString("nationality");
				String name = rs.getString("name");				
				System.out.println(id + "\t" + biography +
	                    "\t" + nationality + "\t" + name);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		TestDB testDB = new TestDB();
		testDB.testDBConnection();
	}

}
