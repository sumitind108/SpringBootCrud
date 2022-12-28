package com.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.bean.sub;
import com.springboot.repository.repo;

@Service
public class service {
	
	@Autowired
	public repo subRepo;
	
	public List<sub> getAllsub(){
		
		List<sub> subjects = new ArrayList<>();
		subRepo.findAll().forEach(subjects::add);
		return subjects;
		
	}

	public void addSub(sub subject) {
		
		subRepo.save(subject);
		
	}

	public void updateSub(String id, sub subject) {
		
		subRepo.save(subject);
		
		
	}

	public void deletesubject(String id) {
		
		
		subRepo.deleteById(id);
		
	}

}
