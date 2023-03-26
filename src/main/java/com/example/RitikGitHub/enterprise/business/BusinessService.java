package com.example.RitikGitHub.enterprise.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.RitikGitHub.enterprise.data.DataService;

@Component
public class BusinessService{
	@Autowired
	private DataService dataService;
	public long calculateSum() {
		List<Integer>data = dataService.getData();
		return data.stream().reduce(Integer::sum).get();
	}
}
