//Controller Class
package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloGeek {

	@RequestMapping("/")
	
	public String display() {
		return "hello";
	}
}
