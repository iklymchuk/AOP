package com.klymchuk.AOP.Handlers;

import java.lang.reflect.Method;

public abstract class BeforeHandler extends AbstractHandler {
	
	/**
	 * Handles before method execution.

	 * @param proxy
	 * @param method
	 * @param args
	 */
	public abstract void handlerBefore (Object proxy, Method method, Object[] args);

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		Object result = method.invoke(getTargetObject(), args);
		
		handlerBefore(proxy, method, args);
		
		return result;
		
	}

}
