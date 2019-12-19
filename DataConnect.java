package twentyfour;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataConnect {


		private static Statement stat;

		private static void init() throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3306/game";
			String name = "root";
			String pw = "888888";
			Connection con = DriverManager.getConnection(url, name, pw);
			 stat = con.createStatement();
		}
		
		public static Statement getStat() throws ClassNotFoundException, SQLException{
			if(stat==null)
				init();
			return stat;
		}

	
}
