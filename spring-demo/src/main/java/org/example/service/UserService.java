package org.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("org.example.service.UserService")
public class UserService {

	@Autowired
	private IndexService indexService;

	public String hello() {
		return "Good";
	}
}
