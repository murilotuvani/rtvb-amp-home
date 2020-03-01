package br.com.rtvb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
public class RtvbAmpHomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(RtvbAmpHomeApplication.class, args);
	}
	
	@Controller
	class HelloController {
		@RequestMapping(value = { "/", "/index.html", "/index.htm" }, method = RequestMethod.GET)
		public ModelAndView home() {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("home");
			modelAndView.setStatus(HttpStatus.OK);
			return modelAndView;
		}
		
		@RequestMapping(value = { "/item" }, method = RequestMethod.GET)
		public ModelAndView item() {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("item");
			modelAndView.setStatus(HttpStatus.OK);
			return modelAndView;
		}
	}

}
