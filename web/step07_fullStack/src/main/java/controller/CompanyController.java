package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.EmpDeptDAO;
import model.domain.entity.Dept;

@WebServlet("/com")
public class CompanyController extends HttpServlet {
	/*
	 * 1단계 : 어떤 요청인지 구분 2단계 : 요청에 맞게 로직 처리
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String command = request.getParameter("command");

		if (command != null) {
			EmpDeptDAO dao = EmpDeptDAO.getInstance();
			if (command.equals("deptone")) { // 모든 dept 정보를 출력
				String search = request.getParameter("search");

				try {
					Dept dept = dao.findDept(Integer.parseInt(search));

					request.setAttribute("one", dept);
					request.getRequestDispatcher("deptview.jsp").forward(request, response);

				} catch (Exception e) {
					e.printStackTrace();
				}

			} else if (command.equals("all")) { // 하나의 dept 정보만 출력
				try {
					List<Dept> all = dao.findElementDept();
					// jsp로 출력하기 위해 정보를 담아 전송해줌.
					request.setAttribute("allDept", all);
					request.getRequestDispatcher("deptall.jsp").forward(request, response);

				} catch (Exception e) {
					e.printStackTrace();
				}
			} else { // 잘못된 값

			}
		} else { // null값

		}

	}

}