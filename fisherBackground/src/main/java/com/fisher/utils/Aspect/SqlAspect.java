package com.fisher.utils.Aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fisher.mapper.UserMapper;

@Aspect
@Component
public class SqlAspect {
    
	@Autowired
	private UserMapper userMapper;
    /**
     * 使用空方法定义切点表达式
     */
    @Pointcut("execution(com.fisher.service..*")
    public void declareJointPointExpression() {
        
    }
    @Before("@annotation(updateCharset)")
    public void doBefore(JoinPoint joinPoint,UpdateCharset updateCharset)
    {
    	System.out.println("切面开始");
    	userMapper.setCharsetToUtf8mb4();
    }
}
