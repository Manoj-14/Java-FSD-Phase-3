package com.example.OSLAOP.aop.spring;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundMethodInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object[] args = invocation.getArguments();
		String signature = invocation.getMethod().getName();
		Object result = invocation.proceed();
		System.out.println(
				"=====\n Method: " + signature + " was called with next arguments " + Arrays.toString(args) + "\n====");
		return result;
	}

}
