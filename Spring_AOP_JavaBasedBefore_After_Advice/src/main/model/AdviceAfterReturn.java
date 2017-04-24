package main.model;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AdviceAfterReturn implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args,
			Object target) throws Throwable {
		
		System.out.println("Here you can write code that you want to execute after method execution");
	}

}
