package com.Listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class ListenerAttribute implements ServletRequestAttributeListener,HttpSessionAttributeListener,ServletContextAttributeListener{

	@Override
	public void attributeAdded(ServletContextAttributeEvent scae) {
		String attrName = scae.getName();
		Object attribute = scae.getServletContext().getAttribute(attrName);
		System.out.println("ServletContext[增加]属性：属性名：" + attrName + ",属性值： "+attribute);
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent scae) {
		System.out.println("ServletContext【删除】属性==》"+scae);
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent scae) {
		String attrName = scae.getName();
		Object attribute = scae.getServletContext().getAttribute(attrName);
		System.out.println("ServletContext【替换】属性：属性名："+ attrName + ",属性值：" + attribute);
	}

	@Override
	public void attributeAdded(HttpSessionBindingEvent hsbe) {
		String attrName = hsbe.getName();
		Object attribute = hsbe.getSession().getAttribute(attrName);
		System.out.println("HttpSession[增加]属性：属性名：" + attrName + ",属性值： "+attribute);

	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent hsbe) {
		// TODO Auto-generated method stub
		System.out.println("HttpSession【删除】属性==》"+ hsbe);
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent hsbe) {
		String attrName = hsbe.getName();
		Object attribute = hsbe.getSession().getAttribute(attrName);
		System.out.println("HttpSession[替换]属性：属性名：" + attrName + ",属性值： "+attribute);

	}

	@Override
	public void attributeAdded(ServletRequestAttributeEvent srae) {
		String attrName = srae.getName();
		Object attribute = srae.getServletRequest().getAttribute(attrName);
		System.out.println("ServletRequest[增加]属性：属性名：" + attrName + ",属性值： "+attribute);

	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		// TODO Auto-generated method stub
		System.out.println("ServletRequest【删除】属性==》"+srae);
	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		String attrName = srae.getName();
		Object attribute = srae.getServletRequest().getAttribute(attrName);
		System.out.println("ServletRequest[替换]属性：属性名：" + attrName + ",属性值： "+attribute);

	}

}
