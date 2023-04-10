import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"addition","additionofnumbers"})
public class addconfig {

	@Bean
	public InternalResourceViewResolver viewresolver() {
		
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		
		vr.setPrefix("/WEB-INF/");
		vr.setSuffix(".jsp");
		return vr;
	}
}
