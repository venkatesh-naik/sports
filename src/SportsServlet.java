import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.thor.dao.SportsDao;
import com.xworkz.thor.dao.SportsDaoImpl;
import com.xworkz.thor.dto.SportsDto;

@WebServlet(value="/")
public class SportsServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String sname=req.getParameter("sn");
		String stype=req.getParameter("st");
		String nop=req.getParameter("nop");
		String loc=req.getParameter("loc");
		String[] select=req.getParameterValues("check");
		
		
		
		PrintWriter out=resp.getWriter();
		out.println("sname is"+sname);
		out.println("stype is"+stype);
		out.println("snop is "+nop);
		out.println("sloc "+loc);
		for(int i=0;i<select.length;i++){
			out.println("i18N "+select[i]);
		}
		

		SportsDto dto= new SportsDto();
		dto.setI18n(select[0]);
		dto.setLocation(loc);
		dto.setNoofplayer(nop);
		dto.setSname(sname);
		dto.setStype(stype);
		System.out.println(dto);
		
		SportsDao dao= new SportsDaoImpl();
		dao.save(dto);
		
		
	
		out.flush();
		out.close();
		
		
	}

}
