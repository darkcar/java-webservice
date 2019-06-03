package com.frank.test;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import com.frank.service.impl.HelloService;

public class Server {
	public static void main(String[] args) {
		// Factory 
		JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
		
		// Set Address
		factoryBean.setAddress("http://localhost:8888/ws/hello");
		
		// Set Service class
		factoryBean.setServiceBean(new HelloService());
		
		// Release Service 
		factoryBean.create();
		
		// End
		System.out.println("End!!!");
	}
}
