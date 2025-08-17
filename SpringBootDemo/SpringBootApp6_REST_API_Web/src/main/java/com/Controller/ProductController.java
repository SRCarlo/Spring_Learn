package com.Controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.ProductDaoImpl;
import com.model.Product;
@CrossOrigin("*") // Angular Rest API...
@RestController
public class ProductController {

	@Autowired
	ProductDaoImpl pdao;

	/*
	 * @RequestMapping(value = "/msg", method = RequestMethod.GET)
	 * 
	 * @ResponseBody public String getMsg() { return
	 * "Hello ...! Welcome To Rest API Cyber...."; }
	 */

	// http://localhost:8080/msg
	@GetMapping("msg")
	public String getMsg() {
		return "Hello ...! ,Welcome To REST API Cyber...";
	}

	// --------------------------------------------------------------------------------------------------------

	// http://localhost:8080/products
	@GetMapping("/products")
	public ArrayList<Product> getProducts() {
		return this.pdao.getProducts();
	}

	// --------------------------------------------------------------------------------------------------------
	// http://localhost:8080/product
	@PostMapping("/product")
	public Product addProduct(@RequestBody Product p) {
		return pdao.addProduct(p);
	}
	// --------------------------------------------------------------------------------------------------------

	// http://localhost:8080/product/101
	@GetMapping("/product/{pid}")
	public Product getProduct(@PathVariable("pid") Integer pid) {
		return pdao.getProduct(pid);
	}

	// --------------------------------------------------------------------------------------------------------
	// http://localhost:8080/product/101
	@DeleteMapping("/product/{pid}")
	public Product deleteProduct(@PathVariable("pid") Integer pid) {
		return this.pdao.deleteProduct(pid);
	}

	// --------------------------------------------------------------------------------------------------------
	// http://localhost:8080/product/101.....................................update
	  
	@PutMapping("/product/{pid}")
	public Product updateProduct(@PathVariable("pid") Integer pid, @RequestBody Product p) {
		return pdao.updateProduct(pid, p);
	}

	// --------------------------------------------------------------------------------------------------------
}
