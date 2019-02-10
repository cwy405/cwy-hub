package com.cfd.first.boot.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cfd.first.boot.util.Result;

@Controller
@ResponseBody
@RequestMapping("/test")
public class TestController {

	@RequestMapping(value="getUser/{userId}",method=RequestMethod.GET)
	public Result getUser(@PathVariable("userId") Integer userId) throws ServletException,IOException{
		
		Map<String,Object> map = new HashMap<>();
		map.put("userName", "Chen WeiYu");
		map.put("userId", userId);
		
		return Result.success().put("info",map);
	}
}
