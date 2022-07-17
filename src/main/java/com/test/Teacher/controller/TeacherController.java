package com.test.Teacher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.Teacher.dao.TeacherDao;
import com.test.Teacher.entity.TeacherRecord;

@Controller
public class TeacherController {
    @Autowired
	private TeacherDao teacherdao;
    
    @RequestMapping("/about")
    public String homepage() {
    	System.out.println("WELCOME TO INDEX.HTML");
    	TeacherRecord record = new TeacherRecord(111, "Ashutosh", "Madhubani", "ashutoshjha249@gmail.com", 808827655);
    	this.teacherdao.save(record);
    	System.out.println("Sucessfully");
		 return "home";
    }
}
