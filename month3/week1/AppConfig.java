package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/*The @Configuration is a class-level 
annotation indicating that an object is a
source of bean definitions.*/
@Configuration

/*The @EnableWebMvc enables default Spring MVC
configuration and provides the functionality
equivalent to mvc:annotation-driven/ element
in XML based configuration.*/
@EnableWebMvc

/*The @ComponentScan scans the stereotype 
annotations (@Controller, @Service, etc...) 
in a package specified by basePackages 
attribute.*/
@ComponentScan(basePackages = {"config"})

public class AppConfig {

	@Bean
	public InternalResourceViewResolver  resolver() {
		InternalResourceViewResolver  resolver = new InternalResourceViewResolver();
		resolver.setViewClass(JstlView.class);
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
		
	}
	
}
