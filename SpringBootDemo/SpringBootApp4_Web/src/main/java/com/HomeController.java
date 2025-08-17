package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("home")
	public String getHomePage() {
		return "home";

	}

	@RequestMapping("service")
	public String getServicePage() {
		return "service";

	}

	@RequestMapping("product")
	public String getProductPage() {
		return "product";

	}

}
