package main.model;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MethodBeforeAdvisor implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] arg, Object arg2)
			throws Throwable {
		System.out.println("Here you can write code that you want to execute before method execution");
	}
	
	
}
