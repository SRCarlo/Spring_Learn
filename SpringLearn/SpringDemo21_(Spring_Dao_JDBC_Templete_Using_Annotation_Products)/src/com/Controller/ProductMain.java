package com.Controller;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.Model.*;
import com.Config.ApplicationConfiguration;
import com.Dao.*;

public class ProductMain {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		ProductDaoInterface pdao = (ProductDaoImpl) ac.getBean("pdao");
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		do {
			System.out.println("\n1)Add Product");
			System.out.println("2)Update Product");
			System.out.println("3)Delete Product");
			System.out.println("4)Search Product");
			System.out.println("5)Show All Product");
			System.out.print("Enter your choice:");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter Product Details");
				System.out.print("Product Id:");
				int pid = sc.nextInt();
				System.out.print("Product Name:");
				String pname = sc.next();
				System.out.print("Product Qty:");
				int pqty = sc.nextInt();
				System.out.print("Product Price:");
				int pprice = sc.nextInt();
				Product p = new Product(pid, pname, pqty, pprice);
				int i = pdao.saveProduct(p);
				if (i > 0)
					System.out.println("Product Record Inserted Successfully..");
				else
					System.out.println("Product Record Denied..");
				break;
			case 2: // update
				System.out.print("Enter the Product Id to be update:");
				pid = sc.nextInt();
				System.out.print("Product Name:");
				pname = sc.next();
				System.out.print("Product Qty:");
				pqty = sc.nextInt();
				System.out.print("Product Price:");
				pprice = sc.nextInt();
				i = pdao.updateProduct(new Product(pid, pname, pqty, pprice));
				if (i > 0)
					System.out.println("Product Record Updated Successfully..");
				else
					System.out.println("Product Record Denied..");
				break;
			case 3:// delete
				System.out.print("Enter the Product Id to be delete:");
				pid = sc.nextInt();
				p = new Product();
				p.setPid(pid);
				i = pdao.deleteProduct(p);
				if (i > 0)
					System.out.println("Product Record Deleted Successfully..");
				else
					System.out.println("Product Record Denied..");
				break;
			case 4:
				System.out.println("Enter the Product Id to be Search:");
				pid = sc.nextInt();
				pdao.showProductById(pid);
				break;
			case 5:
				System.out.println("\nAll Products List:");
				pdao.showAllProduct();
				break;
			default:
				System.out.println("Wrong Choice..!!!");
				break;
			}// end switch
		} while (ch != 6);// end while
	}// end main
}// end class