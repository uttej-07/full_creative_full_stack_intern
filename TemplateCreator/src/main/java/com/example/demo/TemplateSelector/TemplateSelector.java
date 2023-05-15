package com.example.demo.TemplateSelector;

import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TemplateSelector {

	@PostMapping(value = "/templateselector", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String templateselector(@RequestBody Map<String, Object> templatename) {

		String selectedValue = (String) templatename.get("template");
	     return selectedValue;
	}

	@RequestMapping("/")
	public String display() {
		return "index";
	}

}
