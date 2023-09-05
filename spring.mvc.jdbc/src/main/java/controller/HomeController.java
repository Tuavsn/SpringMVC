package controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import model.Student;
import dao.StudentDao;

public class HomeController {
	@RequestMapping(value="/")
	public ModelAndView listContact(ModelAndView model) throws IOException{
	    List<Student> listContact = StudentDao.studentList();
	    model.addObject("listContact", listContact);
	    model.setViewName("home");
	 
	    return model;
	}
}
