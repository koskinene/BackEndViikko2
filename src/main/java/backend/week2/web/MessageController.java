package backend.week2.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MessageController {
	
	@GetMapping("/hello")
	public String sayHello(@RequestParam(name="name") String nimi, 
			@RequestParam(name="age") int ika, 
			Model model) {
		model.addAttribute("nimi", nimi);
		model.addAttribute("ika", ika);
		return "hello";
	}

}
