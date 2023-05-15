package com.example.demo;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.TemplateSelector.TemplateSelector;

@SpringBootTest
class TemplateCreatorApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void demo() {
		TemplateSelector ts = new TemplateSelector();
		Map<String,Object> tsm = new HashMap<>();
		tsm.put("template","Template1");
		ts.templateselector(tsm);
		assertEquals("Template1",tsm.get("template"));
	}
	
//	@Test
//	public void displaytest() {
//		TemplateSelector ts = new TemplateSelector();
//		assertEquals("index",ts.display());	
//	}
}
