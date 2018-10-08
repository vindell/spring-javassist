package org.springframework.javassist.registry;

import java.io.IOException;

import org.springframework.beans.factory.config.BeanDefinition;

public interface DynamicControllerRegistry extends DynamicBeanDefinitionRegistry {

	/**
     * 动态注册SpringMVC Controller到Spring上下文
     * @param controllerClass			: The class type of controller 
     */
	public void registerController(Class<?> controllerClass);
	
    /**
     * 动态注册SpringMVC Controller到Spring上下文
     * @param controllerClass	: The class type of controller
     * @param scope				: scope value
     */
    public void registerController(Class<?> controllerClass, String scope); 
    
    /**
     * 动态注册SpringMVC Controller到Spring上下文
     * @param controllerClass	: The class type of controller
     * @param scope				: scope value
     * @param lazyInit			: lazyInit value
     */
    public void registerController(Class<?> controllerClass, String scope, boolean lazyInit); 
    
    /**
     * 动态注册SpringMVC Controller到Spring上下文
     * @param controllerClass	: The class type of controller
     * @param scope				: scope value
     * @param lazyInit			: lazyInit value
     * @param autowireCandidate	: autowireCandidate value
     */
    public void registerController(Class<?> controllerClass, String scope, boolean lazyInit,boolean autowireCandidate); 
	
    /**
     * 动态注册SpringMVC Controller到Spring上下文
     * @param beanName			: The name of bean 
     * @param controllerClass	: The class type of controller
     */
	public void registerController(String beanName, Class<?> controllerClass);
	
    /**
     * 动态注册SpringMVC Controller到Spring上下文
     * @param beanName			: The name of bean 
     * @param controllerClass	: The class type of controller
     * @param scope				: scope value
     */
    public void registerController(String beanName, Class<?> controllerClass, String scope); 
    
    /**
     * 动态注册SpringMVC Controller到Spring上下文
     * @param beanName			: The name of bean 
     * @param controllerClass	: The class type of controller
     * @param scope				: scope value
     * @param lazyInit			: lazyInit value
     */
    public void registerController(String beanName,Class<?> controllerClass, String scope, boolean lazyInit); 
    
    /**
     * 动态注册SpringMVC Controller到Spring上下文
     * @param beanName			: The name of bean 
     * @param controllerClass	: The class type of controller
     * @param scope				: scope value
     * @param lazyInit			: lazyInit value
     * @param autowireCandidate	: autowireCandidate value
     */
    public void registerController(String beanName,Class<?> controllerClass, String scope, boolean lazyInit,boolean autowireCandidate); 

    /**
     * 动态注册SpringMVC Controller到Spring上下文
     * @param beanName			: The name of bean 
     * @param beanDefinition	: {@link BeanDefinition beanDefinition} instance
     */
    public void registerController(String beanName, BeanDefinition beanDefinition);
    
    /**
     * 动态从Spring上下文删除SpringMVC Controller
     * @param controllerBeanName		: The name of controller 
     * @throws IOException if io error
     */
    public void removeController(String controllerBeanName) throws IOException;
    
	/**
     * 动态注册Groovy Controller到Spring上下文
     * @param scriptLocation		: The location of groovy script
     * @throws IOException if io error 
     */
	public void registerGroovyController(String scriptLocation) throws IOException;
	
	/**
     * 动态从Spring上下文删除Groovy Controller
     * @param scriptLocation		: The location of groovy script 
     * @param controllerBeanName		: The name of controller 
     * @throws IOException if io error
     */
	public void removeGroovyController(String scriptLocation,String controllerBeanName) throws IOException;
	
}