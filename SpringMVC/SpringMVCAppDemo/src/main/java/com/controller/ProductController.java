package com.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.model.*;
import com.dao.*;
import java.util.*;

@Controller
public class ProductController {
	@Autowired
	ProductDaoInterface pdao;

	public void setPdao(ProductDaoInterface pdao) {
		this.pdao = pdao;
	}

	@RequestMapping("allprod")
	public String getAllProdPage(HttpServletRequest request, Model m) {
		ArrayList<Product> plist = pdao.showAllProduct();

		m.addAttribute("plist", plist);

		return "allprod";
	}
}