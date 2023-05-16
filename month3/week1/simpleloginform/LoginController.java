package LoginPackages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@RequestMapping("/login")
	public ModelAndView loginaccess(@RequestParam("l1") String name, @RequestParam("l2") String pass) {
		String msg;
		if (name != null && !name.equals("") && name.equals("uttej") && pass != null && !pass.equals("")
				&& pass.equals("hello123")) {
			msg = "Welcome" + name + ".";
			return new ModelAndView("welcome", "message", msg);
		} else {
			msg = "Wrong Username or password.";
			return new ModelAndView("errorPage", "message", msg);
		}
	}

	@RequestMapping("/")
	public String loginform() {
		return "login";
	}
	
	 
}
