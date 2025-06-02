package och02Git;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Person
 */
@WebServlet("/Person")
public class Person extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Person() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String[] notice = request.getParameterValues("notice");
		String job = request.getParameter("job");
		
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>개인정보</h1>");
		out.printf("이름 : %s<p>", name);
		out.printf("아이디 : %s<p>", id);
		out.printf("암호 : %s<p>", password);
		out.printf("성별 : %s<p>", gender);
		out.print("수신메일 : ");
		if(notice != null) {
			for(int i = 0; i < notice.length; i++) {
				out.printf("%s ", notice[i]);
			}
		}
		out.printf("<p>직업 : %s<p>", job);
		
		out.println("</body></html>");
		out.close();
	}

}
