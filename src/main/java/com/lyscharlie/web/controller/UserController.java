package com.lyscharlie.web.controller;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lyscharlie.biz.user.entity.LysUserDO;
import com.lyscharlie.biz.user.service.LysUserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private LysUserService lysUserService;

	@RequestMapping("login.htm")
	public String login() {
		return "user/login";
	}

	@PostMapping("doLogin.htm")
	public ModelAndView doLogin(@RequestParam("userName") String userName, @RequestParam("password") String password) {
		ModelAndView view = new ModelAndView();

		LysUserDO user = this.lysUserService.getOne(new QueryWrapper<LysUserDO>().lambda().eq(LysUserDO::getUserName, userName));

		if (null == user || !user.getPassword().equals(DigestUtils.md5Hex(password))) {
			view.setViewName("user/login");
			view.addObject("message", "用户不存在或密码错误");
		} else {
			view.setViewName("index");
			view.addObject("userName", user.getUserName());
		}

		return view;
	}
}
