package basic_p;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


/**
 * Servlet implementation class UploadReg
 */
@WebServlet("/UploadReg")
@MultipartConfig(maxFileSize = 1024*1024*20)

public class UploadReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadReg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	    
		
		// 1. 파라미터 값 가져오기
		String pname = request.getParameter("pname");
	    String pnum = request.getParameter("pnum");
	    String pday = request.getParameter("pday");
	    String paddr = request.getParameter("paddr");
	    
	    Part up1 = request.getPart("up1");
		
	    String fname = up1.getSubmittedFileName();
	    String dstPath = request.getServletContext().getRealPath("/upload");
	    
	    // 1. 폴더가 존재하는지 확인하고, 없으면 생성하기
	    java.io.File uploadDir = new java.io.File(dstPath);
	    if (!uploadDir.exists()) {
	        uploadDir.mkdirs(); // 폴더가 없으면 생성 (S가 붙은 mkdirs는 상위 폴더까지 생성함)
	        System.out.println("폴더를 생성했습니다: " + dstPath);
	    }
	    
	    // 2. 파일명 앞에 구분자(/) 추가 확인
	    String savePath = dstPath + java.io.File.separator + fname;
	    
	    // 3. 파일 복사 실행
	    Files.copy(up1.getInputStream(), Paths.get(savePath), StandardCopyOption.REPLACE_EXISTING);
	    
	    
	    
	    System.out.println("실제 업로드 경로: " + savePath);
	    
	    // 2. output.jsp에서 사용할 수 있도록 request 객체에 데이터 담기
	    request.setAttribute("pname", pname);
	    request.setAttribute("pnum", pnum);
	    request.setAttribute("pday", pday);
	    request.setAttribute("paddr", paddr);
	    
	    request.setAttribute("fname", fname);
	    request.setAttribute("imgUrl", "upload/" + fname);
		
	    

	    
	    
		//forwarding
		request.getRequestDispatcher("output.jsp").forward(request, response);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
