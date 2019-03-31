package com.Listener;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

//监听对象的绑定和解绑
public class BeanListener implements HttpSessionBindingListener {

	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		System.out.println("绑定bean对象，将对象增加到session域中，绑定的对象：" + this + ",sessionId :" + event.getSession().getId());
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		System.out.println("解绑bean对象，将对象从session域中移除，绑定的对象：" + this + ",sessionId :" + event.getSession().getId());
	}

}
