package com.leeyaonan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

/**
 * @Author leeyaonan
 * @Date 2020/4/28 0:36
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

	@RequestMapping("/handle01")
	public String handle01(String name, Map<String, Object> model) {
		System.out.println("处理业务逻辑中...");
		Date date = new Date();
		model.put("date", date);
		return "success";
	}
}
