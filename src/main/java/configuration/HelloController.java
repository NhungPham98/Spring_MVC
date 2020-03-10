package configuration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	public  HelloController() {
		System.out.println("start bean");

	}
	@RequestMapping("/login")
	public String Login() {
		return "login";
	}
}
