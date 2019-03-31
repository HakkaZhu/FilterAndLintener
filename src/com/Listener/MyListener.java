package com.Listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyListener implements ServletRequestListener,HttpSessionListener,ServletContextListener{
	//application对象的销毁
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("ServletContextListener对象的销毁"+sce);
	}

	//application对象的创建
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("ServletContextListener对象的创建"+sce);
		
	}

	//session对象的创建
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("HttpSessionListener对象的创建"+se);
		
	}

	//session对象的销毁
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("HttpSessionListener对象的销毁"+se);
		
	}

	//request对象的销毁
	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("ServletRequestListener对象的销毁"+sre);
		
	}

	//request对象的创建
	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("ServletRequestListener对象的创建"+sre);
		
	}

}
