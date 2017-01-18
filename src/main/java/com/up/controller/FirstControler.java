package com.up.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="first")
public class FirstControler {
	private static Log logger = LogFactory.getLog(FirstControler.class);
	@RequestMapping(value="in")
	public @ResponseBody String jumpToIndex(@RequestBody String req,
			HttpServletResponse response) throws IOException{	
	    logger.info(req);
		return "demaxiyan";
	}
} 
