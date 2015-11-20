package com.klymchuk.AOP.Handlers;

import java.lang.reflect.InvocationHandler;

/**
 * @author iklymchuk
 *
 */
public abstract class AbstractHandler implements InvocationHandler {
	
	private Object targetObject;

	public Object getTargetObject() {
		return targetObject;
	}

	public void setTargetObject(Object targetObject) {
		this.targetObject = targetObject;
	}
}
