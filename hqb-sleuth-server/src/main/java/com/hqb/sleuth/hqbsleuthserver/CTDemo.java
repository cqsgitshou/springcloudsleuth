package com.hqb.sleuth.hqbsleuthserver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CTDemo {
	
	private static final Logger logger = LoggerFactory.getLogger(CTDemo.class);
	 
	@RequestMapping(value = "ct/test", method = RequestMethod.GET)
	@ResponseBody
	public String countDownlatch(HttpServletRequest request, HttpServletResponse response) {
		logger.info("success");
		return "succ";
	}
	
}
