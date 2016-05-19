package jp.co.opst.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {

	public static Connection getCon() {

		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		} catch (SQLException e) {
			System.out.println("接続エラー");
			e.printStackTrace();
		}
		return conn;
	}

}
