package com.klymchuk.AOP.testUserAOP;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.klymchuk.AOP.Appartment.Appartment;
import com.klymchuk.AOP.Appartment.AppartmentImpl;
import com.klymchuk.AOP.Handlers.AbstractHandler;
import com.klymchuk.AOP.Handlers.AfterHandler;
import com.klymchuk.AOP.Handlers.AfterHandlerImpl;
import com.klymchuk.AOP.Handlers.BeforeHandler;
import com.klymchuk.AOP.Handlers.BeforeHandlerImpl;
import com.klymchuk.AOP.Handlers.ProxyFactory;
import com.klymchuk.AOP.User.User;
import com.klymchuk.AOP.User.UserImpl;

public class TestAOP {
	
	UserImpl userImpl;
	AppartmentImpl appartImpl;
	List<AbstractHandler> handlers;
	
	@Before
	public void setUp() {
		userImpl = new UserImpl();
		appartImpl = new AppartmentImpl(userImpl);
		
		BeforeHandler before = new BeforeHandlerImpl();
		AfterHandler after = new AfterHandlerImpl();
		
		handlers = new ArrayList<AbstractHandler>();
			handlers.add(before);
			handlers.add(after);
	}
	
	@Test
	public void testAOP() {
		User userProxy = (User) ProxyFactory.getProxy(userImpl, handlers);
		String initialUser = userProxy.userForApplication("TestUser");
		System.out.println("User for app is: " + initialUser);
	
	Appartment appartProxy = (Appartment) ProxyFactory.getProxy(appartImpl, handlers);
		String initialAppartment = appartProxy.userAppartment(initialUser);
		System.out.println("This is appartment for: " + initialAppartment);
	}
}
