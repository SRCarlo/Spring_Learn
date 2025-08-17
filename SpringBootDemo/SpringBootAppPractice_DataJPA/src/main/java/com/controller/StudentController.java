package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bean.Student;
import com.dao.StudentRepository;

@Controller
public class StudentController {
	@Autowired
	StudentRepository Srepo;

	@RequestMapping("home")
	public String getIndexPage() {
		return "home";
	}

	@RequestMapping("addStud")
	public String getAddStudent() {
		return "addStud";
	}

	@RequestMapping("adddata")
	public String AddStud(Student s) {
		Srepo.save(s);
		return "home";
	}

	// ----------------------------------------------------------------------------------------------------------------------------
	@RequestMapping("/searchId")
	public String getSearchData() {
		return "searchId";

	}

	@RequestMapping("/searchid")
	@ResponseBody
	public Student getStudent(@RequestParam("sid") int sid) {
		return Srepo.findById(sid).orElse(null);
	}
	// ------------------------------------------------------------------------------------------------------------------------------

	@RequestMapping("/showData")
	@ResponseBody
	public List<Student> getShowData() {
		return Srepo.findAll();
	}

	// -------------------------------------------------------------------------------------------------------------------------------
	@RequestMapping("/searchName")
	public String getSearchDataName() {
		return "searchName";
	}

	@RequestMapping("/searchname")
	@ResponseBody
	public List<Student> getStudentSearch(@RequestParam("sname") String sname) {
		return Srepo.findBySname(sname);
	}

	// --------------------------------------------------------------------------------------------------------------------------------
	@RequestMapping("deleteData")
	public String DeleteStudent() {
		return "deleteData";
	}

	@RequestMapping("deletedata")
	@ResponseBody
	public String getDaleteStudent(@RequestParam("sid") int sid) {
		Student s = Srepo.findById(sid).orElse(null);
		if (s != null) {
			Srepo.deleteById(null);
		}
		return "Student " + s + "Delete Successfully...!";
	}

	// ---------------------------------------------------------------------------------------------------------------------------------------
	@RequestMapping("updateData")
	public String getUpdate() {
		return "updateData";
	}

	@RequestMapping("updatedata")
	@ResponseBody
	public String UpdateStudent(@RequestParam("sid") int sid, @RequestParam("sname") String sname,
			@RequestParam("percentage") double percentage, @RequestParam("std") int std) {

		Student stud = Srepo.findById(sid).orElse(null);
		if (stud != null) {
			stud.setSname(sname);
			stud.setPercentage(percentage);
			stud.setStd(std);
			return "Student" + stud + sid + "Update Successfully";
		} else {
			return "Student" + sid + "Not Found";
		}
	}

  // ---------------------------------------------------------------------------------------------------------------------------------------------	
}
