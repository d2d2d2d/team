package com.douzone.team.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.douzone.team.service.MainService;


@Controller
public class MainController {
	
	@Autowired
	MainService mainService;
	
	@RequestMapping({"","/main"})
	public String index(Model model) {
		return "main/index";
	}
	
	

}
