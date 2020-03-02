package untls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBStuden_Mananger {

	//先定义需要用到的字符串
			private final String DRIVER = "com.mysql.jdbc.Driver";
			private final String URL="jdbc:mysql://localhost:3306/Student_Manager?UseUnicode=true&characterEncoding=UTF-8";
			private final String UNAME="root";
			private final String PASSWORD="12345";
			
			private Connection conn;
			private PreparedStatement pst;
			private ResultSet rs;
			
			//创建数据库连接
			public Connection getConn() {
				try {
					Class.forName(DRIVER);
					conn = DriverManager.getConnection(URL, UNAME, PASSWORD);
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				return conn;
			}
			// 释放资源
			public void closeAll(ResultSet rs,PreparedStatement pst,Connection conn) {
				try {
					if(rs != null)
						rs.close();
					if(pst != null)
						pst.close();
					if(conn != null)
						conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
}
