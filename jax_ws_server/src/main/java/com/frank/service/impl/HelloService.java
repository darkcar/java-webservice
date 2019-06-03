package com.frank.service.impl;

import com.frank.service.IHelloService;

/**
 * Implement HelloService
 * @author xwang
 *
 */
public class HelloService implements IHelloService {

	@Override
	public String sayHello(String name) {
		return name + ", Welcome to WebService";
	}

}
