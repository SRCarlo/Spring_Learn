package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bean.Employee;
import com.dao.EmpRepository;

@Controller
public class EmpController {
	@Autowired
	EmpRepository erepo;

	@RequestMapping("index")
	public String getIndexPage() {
		return "index";
	}
	// ---------------------------------------------------------------------------------------------------------------------------------------------

	@RequestMapping("addEmpFrm")
	public String getAddEmpFrm() {
		return "addEmpFrm";
	}

	@RequestMapping("addemp")
	public String addEmp(Employee e) {
		erepo.save(e);
		return "index";
	}
	// ----------------------------------------------------------------------------------------------------------------------------------------------

	@RequestMapping("/showEmpByIdFrm")
	public String getShowEmpByIdFrm() {
		return "showEmpByIdFrm";
	}

	@RequestMapping("/empsearchById")
	@ResponseBody
	public Employee getEmp(@RequestParam("eid") int eid) {

		return erepo.findById(eid).orElse(null);
	}
	// ----------------------------------------------------------------------------------------------------------------------------------------------

	@RequestMapping("/showAllEmp")
	@ResponseBody
	public List<Employee> getEmployee() {
		return erepo.findAll();
	}
	// ----------------------------------------------------------------------------------------------------------------------------------------------

	@RequestMapping("/showEmpByNameFrm")
	public String getShowEmpByNameFrm() {
		return "showEmpByNameFrm";
	}

	@RequestMapping("/empsearchByName")
	@ResponseBody
	public List<Employee> getEmpsearchByName(@RequestParam("ename") String ename) {
		return erepo.findByEname(ename);
	}

	// -----------------------------------------------------------------------------------------------------------------------------------------------

	@RequestMapping("deleteEmpById")
	public String DeleteEmployee() {
		return "deleteEmpById";
	}

	@RequestMapping("deletedata")
	@ResponseBody
	public String getDeleteEmployee(@RequestParam("eid") int eid) {
		Employee emp = erepo.findById(eid).orElse(null);
		if (emp != null) {
			erepo.deleteById(eid);

		}
		return "Employee " + emp + " Delete Successfully";

	}

	// -----------------------------------------------------------------------------------------------------------------------------------------------

	@RequestMapping("updateEmp")
	public String UpdateEmp() {
		return "updateEmp";

	}

	@RequestMapping("updatedata")
	@ResponseBody
	public String UpdateEmp(@RequestParam("eid") int eid, @RequestParam("ename") String ename,
			@RequestParam("esal") int esal) {
		Employee employee = erepo.findById(eid).orElse(null);
		if (employee != null) {
			employee.setEname(ename);
			employee.setEsal(esal);
			erepo.save(employee);
			return "Employee " + employee + eid + "update Successfully!";
		} else {
			return "Employee" + eid + " Not Found !";
		}

	}
	// --------------------------------------------------------------------------------------------------------------------------------------------------
}
