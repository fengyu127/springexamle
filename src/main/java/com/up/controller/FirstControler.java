package com.up.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="first")
public class FirstControler {

	@RequestMapping(value="in")
	public @ResponseBody String jumpToIndex(@RequestBody String req,
			HttpServletResponse response) throws IOException{
		
		System.out.println(req);
		
	/*	String s=request.getParameter("first"); 
		String s2=request.getParameter("first");
		System.out.println(s+"  q  ");
		System.out.println(s2+"  q 2 ");
		String keys =request.get; 
		System.out.println(keys);*/
		return "demaxiyan";
	}
}
