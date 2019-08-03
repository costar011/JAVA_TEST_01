package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.spi.DirStateFactory.Result;

public class DBconnection {

	private static final String DrvierManager = null;

	Connection conn;
	Statement stmt;

	String driver = "oracle.jdbc.drvier.OracleDriver";
	String user = "scott";
	String pass = "tiger";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";

	public DBconnection() {
		try {
			Class.forName(this.driver);
			System.out.println("[INFO] oracle driver connent");

			this.conn = DriverManager.getConnection(this.url, this.user, this.pass);
			System.out.println("IFNO Complate Connection");
			this.stmt = conn.createStatement();
		} catch (Exception e) {
			System.out.println("fail to Oracle Driver Connect");
			System.exit(0);
		}

	}

	/*
	 * @return ReslutSet
	 */
	public ResultSet selectQuery (String query) {
		System.out.println("DBconnection접근");
		ResultSet rs = null;
		try {
			rs = this.stmt.executeQuery(query);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
}
