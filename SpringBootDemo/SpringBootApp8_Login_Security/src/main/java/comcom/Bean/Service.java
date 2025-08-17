package comcom.Bean;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name = "Service001")
public class Service {
	@Id
	@Column(name = "Service Id", length = 10)
	int sid;
	@Column(name = "Service Name", length = 20)
	String sname;
	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Service(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Service [sid=" + sid + ", sname=" + sname + "]";
	}

}
