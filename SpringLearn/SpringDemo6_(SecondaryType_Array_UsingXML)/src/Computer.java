
public class Computer {
	String company;
	HardDisk hdd[];

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public HardDisk[] getHdd() {
		return hdd;
	}

	public void setHdd(HardDisk[] hdd) {
		this.hdd = hdd;
	}

	public void printData() {
		System.out.println("Company : " + company);
		for (int i = 0; i < hdd.length; i++)
			System.out.println("Hdd : " + hdd[i]);
	}

}
