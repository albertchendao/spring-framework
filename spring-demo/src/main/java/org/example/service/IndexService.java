package org.example.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("org.example.service.IndexService")
public class IndexService implements InitializingBean {

	@Autowired
	private UserService userService;

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
	}

	public String user() {
		return "User";
	}
}
