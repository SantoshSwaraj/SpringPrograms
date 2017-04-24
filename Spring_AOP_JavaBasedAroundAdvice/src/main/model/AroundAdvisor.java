package main.model;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvisor implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		
		Object obj;
		System.out.println("Before proceed you can write the code you want to execute before actual logic");
		obj=methodInvocation.proceed();
		System.out.println("After proceed you can write the code you want to execute after actual logic");
		return obj;
	}

}
