package comcom.Bean;

import org.springframework.stereotype.Controller;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Controller
@Entity
@Table(name = "Products001")
public class Product {
	@Id
	@Column(name = "Product Id", length = 10)
	int pid;
	@Column(name = "Product Name", length = 20)
	String pname;
	@Column(name = "Product Quantity", length = 30)
	int pqty;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int pid, String pname, int pqty) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pqty = pqty;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPqty() {
		return pqty;
	}

	public void setPqty(int pqty) {
		this.pqty = pqty;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pqty=" + pqty + "]";
	}

}
