package com.frank.service;

import javax.jws.WebService;

/**
 * Public Service
 * @author xwang
 *
 */
// Add Annotation 
@WebService
public interface IHelloService {
	
	/**
	 * Function: say hello
	 */
	public String sayHello(String name);
}
