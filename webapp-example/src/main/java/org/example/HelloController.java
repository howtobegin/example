package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	@RequestMapping()
	public String hello(@RequestParam(required = false) String message, Model model) {
		model.addAttribute("message", message);
		return "hello";
	}
}
