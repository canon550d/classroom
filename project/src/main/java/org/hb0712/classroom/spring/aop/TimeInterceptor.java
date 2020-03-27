package org.hb0712.classroom.spring.aop;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeInterceptor {
	private Long now;
	
    @Pointcut("execution(* org.hb0712.classroom.spring.web.Tools.*(..))")
    public void pointcut1() {
    }
    
    /**
     * 前置通知：在方法执行前执行的代码
     * @param joinPoint
     */
    @Before(value = "pointcut1()")
    public void beforeExecute(JoinPoint joinPoint){
        now = System.currentTimeMillis();
        System.out.println("start ："+now);
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        
        System.out.println(this.getClass().getSimpleName()+ " before execute:"+methodName+ " begin with "+args);
    }
    
    /**
     * 后置返回通知：在方法正常执行后执行的代码,可以获取到方法的返回值
     * @param joinPoint
     */
    @AfterReturning(value = "pointcut1()", returning="result")
    public void afterReturning(JoinPoint joinPoint, Object result){
        System.out.println("end ："+System.currentTimeMillis());
        Long used = System.currentTimeMillis()- this.now;
        now = System.currentTimeMillis();
        System.out.println("使用时间："+used +"\r\n--------------------------------");
        String methodName = joinPoint.getSignature().getName();
        //System.out.println(this.getClass().getSimpleName()+ " afterReturning execute:"+methodName+" end with result:"+result);
    }
    
}
