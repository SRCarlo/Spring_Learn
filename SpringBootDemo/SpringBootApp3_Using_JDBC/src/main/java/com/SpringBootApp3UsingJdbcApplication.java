package com;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bean.Product;
import com.dao.ProductDAOImpl;
import com.dao.ProductDAOInterface;

@SpringBootApplication
public class SpringBootApp3UsingJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringBootApp3UsingJdbcApplication.class, args);
		ProductDAOInterface pdao = (ProductDAOImpl) ac.getBean("pdao");

		Scanner sc = new Scanner(System.in);
		int ch = 0;
		do {
			System.out.println("--------------------Welcome ---------------------");
			System.out.println("\n1.Add Product");
			System.out.println("2.Update Product");
			System.out.println("3.Delete Product");
			System.out.println("4.Search Product");
			System.out.println("5.Show All Products");
			System.out.println("\nEnter Your Choice : ");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter Product Details : ");
				System.out.println("Product Id : ");
				int pid = sc.nextInt();

				System.out.println("Product Name : ");
				String pname = sc.next();

				System.out.println("Product Qty : ");
				int pqty = sc.nextInt();

				System.out.println("Product Price : ");
				int pprice = sc.nextInt();

				Product p = new Product(pid, pname, pqty, pprice);
				int i = pdao.saveProduct(p);

				if (i > 0) {
					System.out.println("Product Record Inserted Successfully..!");
					System.out.println("________________________________________________________________________\n");
				} else {
					System.out.println("Product Record Denied..");
					System.out.println("________________________________________________________________________\n");
				}
				break;

			// ----------------------------------------------------------------------------------------------------------------------------------

			case 2:
				System.out.println("Enter Product Id to be update :");
				System.out.println("Product Id : ");
				pid = sc.nextInt();

				System.out.println("Product Name : ");
				pname = sc.next();

				System.out.println("Product Qty : ");
				pqty = sc.nextInt();

				System.out.println("Product Price : ");
				pprice = sc.nextInt();

				Product p1 = new Product(pid, pname, pqty, pprice);
				i = pdao.updateProduct(p1);

				if (i > 0) {
					System.out.println("Product Records Updated Successfully..!");
					System.out.println("________________________________________________________________________\n");
				} else {
					System.out.println("Product Update Denied..");
					System.out.println("________________________________________________________________________\n");
				}

				break;

			// ----------------------------------------------------------------------------------------------------------------------------------
			case 3:
				System.out.println("Enter the Product Id to be Deleted:");
				pid = sc.nextInt();

				p = new Product();
				p.setPid(pid);

				i = pdao.deleteProduct(p);
				if (i > 0) {
					System.out.println("Product Records Deleted Successfully..!");
					System.out.println("________________________________________________________________________\n");
				} else {
					System.out.println("Product Delete Denied..");
					System.out.println("________________________________________________________________________\n");
				}
				break;

			// ----------------------------------------------------------------------------------------------------------------------------------

			case 4:
				System.out.println("Enter Product Id to Search the Product : ");
				pid = sc.nextInt();
				pdao.showProductById(pid);
				System.out.println("________________________________________________________________________\n");
				break;

			// ----------------------------------------------------------------------------------------------------------------------------------
			case 5:
				System.out.println("All Products Lists : ");
				pdao.showAllProduct();
				System.out.println("________________________________________________________________________\n");
				break;

			// ----------------------------------------------------------------------------------------------------------------------------------
			default:
				System.err.println("Wrong Choice......!");
				break;

			}
		} while (ch != 6);
		sc.close();
	}

}
