package com.klymchuk.AOP.Handlers;

import java.lang.reflect.Method;

/**
 * @author iklymchuk
 *
 */
public class BeforeHandlerImpl extends BeforeHandler {

	@Override
	public void handlerBefore(Object proxy, Method method, Object[] args) {
	    System.out.println("<<< ========new method========= >>>");
	}
}
