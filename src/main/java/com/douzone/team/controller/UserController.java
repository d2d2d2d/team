package com.douzone.team.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.douzone.security.Auth;
import com.douzone.security.AuthUser;
import com.douzone.team.service.UserService;
import com.douzone.team.vo.UserVo;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String join(@ModelAttribute UserVo vo) {
		return "user/join";
	}

	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String join(@ModelAttribute @Valid UserVo vo, BindingResult result, Model model) {
		if(result.hasErrors()) {
//			List<ObjectError> list = result.getAllErrors();
//			for(ObjectError error:list) {
//				System.out.println(error);
//			}
			model.addAllAttributes(result.getModel());
			return "user/join";
		}
		userService.join(vo);
		return "redirect:/user/joinsuccess";
	}

	@RequestMapping("/joinsuccess")
	public String joinsucess() {
		return "user/joinsuccess";
	}

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login() {
		return "user/login";
	}

//	@Auth
//	@RequestMapping(value="/update", method=RequestMethod.GET)
//	public String update(@AuthUser UserVo authUser, Model model) {
//		Long no = authUser.getNo();
//		UserVo vo = userService.getUser(no);
//		model.addAttribute("vo", vo);
//		return "user/update";
//	}
//	@RequestMapping(value="/update", method=RequestMethod.POST)
//	public String update(@AuthUser UserVo authUser, UserVo userVo) {	//no넘기면 안되고 userVo에서 빼와야함. 사용자가 주는 값은 의심해야함.
//		userVo.setNo(authUser.getNo());
//		userService.updateUser(userVo);
//		authUser.setName(userVo.getName());
//		return "redirect:/";
//	}
	
	@RequestMapping(value="/auth", method=RequestMethod.POST)
	public void auth() {
		
	}
	
//	@RequestMapping(value="/logout", method=RequestMethod.GET)
//	public void logout() {
//		
//	}

	//	@ExceptionHandler(Exception.class)
	//	public String handleException() {
	//		return "error/exception";
	//	}

}