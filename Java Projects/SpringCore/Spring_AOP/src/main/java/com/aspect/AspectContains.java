package com.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectContains {

	// Define pointcuts and advices here
	// For example, you can define a pointcut for methods in the Recharge class
	// and an advice that runs before or after those methods.

	// Example pointcut (to be implemented):
	// @Pointcut("execution(* com.entity.Recharge.*(..))")
	// public void rechargeMethods() {}

	// Example advice (to be implemented):
//	@Before("execution(* com.entity.Recharge.recharge(..))")
//	public void beforeRechargeMethod() {
//		System.out.println("Recharge Expiring soon... please recharge your account.");
//	}
//	// You can add more advices for other methods or pointcuts as needed.
//	// Example of an after advice (to be implemented):
//	 @After("execution(* com.entity.Recharge.recharge(..))")
//	 public void afterRechargeMethod() {
//	     System.out.println("Recharge method executed successfully.");
//	 }
	 
	 @Around("execution(* com.entity.Recharge.recharge(..))")
	 public void aroundRechargeMethod(ProceedingJoinPoint joinPoint) throws Throwable {
	     System.out.println("Before executing recharge method.");
	     joinPoint.proceed(); // Proceed with the original method execution
	     System.out.println("After executing recharge method.");
	 }
	
	
}
