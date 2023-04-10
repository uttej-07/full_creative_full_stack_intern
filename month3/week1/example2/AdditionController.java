package addition;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import servicepackage.additionofnumbers;

@Controller
public class AdditionController {

	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int i,@RequestParam("t2") int j,HttpServletRequest request,HttpServletResponse response)
	{
//		int i = Integer.parseInt(request.getParameter("t1"));
//		int j = Integer.parseInt(request.getParameter("t2"));
		
		additionofnumbers an = new additionofnumbers();
		int k = an.add(i, j);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result",k);
		
	return mv;
	}
}
