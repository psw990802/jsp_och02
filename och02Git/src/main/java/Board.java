

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Servlet implementation class Board
 */
@WebServlet("/Board")
public class Board extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Board() {
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
//		게시판
//		제목 : 투표
//		작성자 : 국민
//		작성일 : Mon May 19 16:37:56 KST 2025
//		내용
//		잘 합시다
		request.setCharacterEncoding("utf-8");
		
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		Date date = new Date();
		// browser에 Display 하기 위한 방법
		response.setContentType("text/html;charset=utf-8");
		// browser에 상세내용을 보여줌
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		
		out.println("<h1>게시판</h1>");
		out.printf("제목 : %s<p>", title);
		out.printf("작성자 : %s<p>", writer);
		out.printf("작성일 : %s<p>", date);
		out.printf("내용<br><pre>%s</pre>", content); // <pre> : 바뀐폼 그대로 보여줌
		
		out.println("</body></html>");
		out.close();
	}

}
