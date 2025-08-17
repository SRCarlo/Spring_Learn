package com.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("login")
	public String getLoginPage() {
		return "login";
	}

	@RequestMapping("index")
	public String getLoginPage(HttpServletRequest request, Model m) {
		String uname = request.getParameter("uname");
		@SuppressWarnings("unused")
		String upwd = request.getParameter("upwd");
		String msg;
		if (uname.equals("Naoe")) {
			msg = "Hi " + uname + ",Welcome to Home Page";
			m.addAttribute("msg", msg);
			return "home";
		}
		msg = "Invalid username or password";
		m.addAttribute("msg", msg);
		return "login";
	}

	@RequestMapping("home")
	public String getHomePage() {
		return "home";
	}

	@RequestMapping("product")
	public String getProductPage() {
		return "product";
	}

	@RequestMapping("service")
	public String getServicePage() {
		return "service";
	}

	@RequestMapping("contact")
	public String getContactPage() {
		return "contact";
	}

	@RequestMapping("abt")
	public String getAbtPage() {
		return "abt";
	}

}