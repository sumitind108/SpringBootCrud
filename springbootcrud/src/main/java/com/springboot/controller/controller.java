package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.bean.sub;
import com.springboot.service.service;

@RestController
public class controller {
	
	@Autowired
	private service subservice;
	
	@RequestMapping("/subjects")
	public List<sub> getAllsub(){
		return subservice.getAllsub();
	}
	
	@RequestMapping(method = RequestMethod.POST, value= "/subjects")
	public void addsub(@RequestBody sub subject) {
		subservice.addSub(subject);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value= "/subjects/{id}")
	public void updatesub(@PathVariable String id, @RequestBody sub subject) {
		subservice.updateSub(id,subject);
	}
	
	
	public void Deletesub(@PathVariable String id) {
		subservice.deletesubject(id);
	}
	
	
	
	
	
	
	
	

}
