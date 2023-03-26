package com.example.RitikGitHub.enterprise.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.RitikGitHub.enterprise.business.BusinessService;
@Component
public class MyWebController {
	@Autowired
	private BusinessService businessService;
	
public long returnValueFromBusinessService() {
	return businessService.calculateSum();
}
}
