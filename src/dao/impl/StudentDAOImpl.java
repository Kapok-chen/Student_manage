package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dao.StudentInfoDAO;
import entity.StudentInfo;
import untls.DBStuden_Mananger;

public class StudentDAOImpl extends DBStuden_Mananger implements StudentInfoDAO {

	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	@Override
	public List<StudentInfo> Student_ManangerInfo() {
		List<StudentInfo> list = new ArrayList<StudentInfo>();
		try {
			
			//创建数据连接
			conn = getConn();
			//创建数据库执行语句
			String sql = "SELECT * FROM StudentInfo";
			//创建执行sql命令对象
			pst = conn.prepareStatement(sql);
			//调用执行命令的方法
			rs = pst.executeQuery();
			while(rs.next()) {
				list.add(new StudentInfo(rs.getInt(1),rs.getString(2),rs.getInt(3)));
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

}
