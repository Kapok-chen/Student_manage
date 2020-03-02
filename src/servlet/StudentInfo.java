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

	//创建业务层对象
	StudentInfoService sser = new StudentInfoServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//设置请求的编码
		req.setCharacterEncoding("UTF-8");
		//设置响应的数据格式
		resp.setContentType("text/html;charset=UTF-8");

		List<entity.StudentInfo> lists = sser.isok();
		//将数据保存到作用域中
		req.setAttribute("lists",lists);
//		//页面跳转
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}

}
