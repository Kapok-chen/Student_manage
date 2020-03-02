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
			
			//������������
			conn = getConn();
			//�������ݿ�ִ�����
			String sql = "SELECT * FROM StudentInfo";
			//����ִ��sql�������
			pst = conn.prepareStatement(sql);
			//����ִ������ķ���
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
