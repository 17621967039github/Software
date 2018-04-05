package com.mfxj.controller;


import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mfxj.pojo.Student;
import com.mfxj.service.StudentService;

@Controller
@SuppressWarnings(value="all")
@RequestMapping(value = "/student")
public class StudentController {
	@Resource
	private StudentService studentinfoservice;

	/**
	*查询1
	*/
	@RequestMapping("/find")
	public ModelAndView find(ModelAndView mode)
	{
		List<Student> slist=studentinfoservice.find();
        mode.addObject("slist",slist);
        mode.setViewName("/index");
        System.out.println(mode.getViewName());
		return mode;
	}

	@RequestMapping("/insert")
	public String insert(ModelAndView mode)
	{
        Student s = new Student();
        s.setName("李灿");
        s.setBornDate(new Date());
        int count = studentinfoservice.insert(s);
        System.out.println(count);
        System.out.println(s.getId());

		return "forward:find";
	}


	/*@RequestMapping("/add")
	public String add(ModelAndView mode)
	{
		System.out.println("添加进来了！");
		return "redirect:/index.jsp";
	}*/

	@RequestMapping("/add")
	public ModelAndView add(ModelAndView mode)
	{
		System.out.println("添加进来了！");
		mode.setViewName("main");
		return mode;
	}

}
