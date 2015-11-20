package com.klymchuk.AOP.Handlers;

import java.lang.reflect.Method;

public abstract class AfterHandler extends AbstractHandler {

	/**
	 * Handles after method execution.
	 
	 * @param proxy
	 * @param method
	 * @param args
	 */
	public abstract void handlerAfter (Object proxy, Method method, Object[] args);
	
	public Object invoke (Object proxy, Method method, Object[] args) throws Throwable {
		
		Object result = method.invoke(getTargetObject(), args);
		handlerAfter(proxy, method, args);
		
		return result;
		
	}
	
}
