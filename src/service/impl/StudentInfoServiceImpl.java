package service.impl;

import java.util.List;

import dao.StudentInfoDAO;
import dao.impl.StudentDAOImpl;
import entity.StudentInfo;
import service.StudentInfoService;

public class StudentInfoServiceImpl implements StudentInfoService{

	//�������ʲ��������
	StudentInfoDAO dao = new StudentDAOImpl();
	@Override
	public List isok() {
		return dao.Student_ManangerInfo();
	}

}
