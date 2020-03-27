package org.hb0712.classroom.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Sample {

	@RequestMapping(value = "login.aspx")
	public String login(){
		return "login";
	}

	@RequestMapping(value = "index.aspx")
	public String index(){
		return "index";
	}
}
