package servlet;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.StudentInfoService;
import service.impl.StudentInfoServiceImpl;
@WebServlet("/index")
public class StudentInfo extends HttpServlet {

	//����ҵ������
	StudentInfoService sser = new StudentInfoServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//��������ı���
		req.setCharacterEncoding("UTF-8");
		//������Ӧ�����ݸ�ʽ
		resp.setContentType("text/html;charset=UTF-8");

		List<entity.StudentInfo> lists = sser.isok();
		//�����ݱ��浽��������
		req.setAttribute("lists",lists);
//		//ҳ����ת
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}

}
