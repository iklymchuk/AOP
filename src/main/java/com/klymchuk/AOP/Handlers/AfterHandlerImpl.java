package com.klymchuk.AOP.Handlers;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author iklymchuk
 *
 */

public class AfterHandlerImpl extends AfterHandler {

	@Override
	public void handlerAfter(Object proxy, Method method, Object[] args) {
	    System.out.println("Current method is:" + method.getName() + Arrays.toString(args));
	    System.out.println("<<< Handling after method >>>");
	}
}