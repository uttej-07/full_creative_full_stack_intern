package Controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import model.HelloWorld;

@Controller
public class HelloWorldController {

	@RequestMapping("/helloworld")
	public String handler(Model model) {
		HelloWorld hw = new HelloWorld();
		hw.setMessage("Hello World Example using Spring MVC");
		hw.setDateTime(LocalDateTime.now().toString());
		model.addAttribute("hw", hw);
		return "helloworld";
		
	}
}
