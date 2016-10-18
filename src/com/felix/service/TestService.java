package com.felix.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felix.dao.TestDao;

@Service
public class TestService {
	
	@Autowired
	private TestDao testDao;
}
