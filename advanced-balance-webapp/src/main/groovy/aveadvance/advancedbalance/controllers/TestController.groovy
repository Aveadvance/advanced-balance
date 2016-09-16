package aveadvance.advancedbalance.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class TestController {
	
	@RequestMapping("/")
	@ResponseBody String testController() {
		"Hello, world!"
	}
	
}
