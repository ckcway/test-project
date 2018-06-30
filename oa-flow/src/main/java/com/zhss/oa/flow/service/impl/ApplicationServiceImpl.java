package com.zhss.oa.flow.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhss.oa.flow.mapper.ApplicationMapper;
import com.zhss.oa.flow.model.Application;
import com.zhss.oa.flow.service.ApplicationService;

@Service("applicationService") 
public class ApplicationServiceImpl implements ApplicationService {

	@Autowired
	private ApplicationMapper applicationMapper;
	
	public void create(Application app) {
		System.out.println("I am zhangsan aaa");
		applicationMapper.create(app); 
		System.out.println("I am zhangsan aaa 456");
	}

	public void delete(Long id) {
		applicationMapper.delete(id); 
	}

	public Application findById(Long id) {
		return applicationMapper.findById(id);
	}
	
}
