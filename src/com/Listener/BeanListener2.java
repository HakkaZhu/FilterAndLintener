package com.Listener;

import java.io.Serializable;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

//监听对象的钝化和活化
public class BeanListener2 implements HttpSessionActivationListener,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1409446045691860596L;
	
	private int no;
	private String name;
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void sessionDidActivate(HttpSessionEvent se) {
		System.out.println("活化之后，BeanListener2对象将随着session的活化而活化");
	}

	@Override
	public void sessionWillPassivate(HttpSessionEvent se) {
		System.out.println("钝化之前：BeanListener2对象将随着session的钝化而钝化");
	}

}
