package com.training;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionBindingEvent;

@WebListener
public class MyWebListener implements HttpSessionAttributeListener {
	public MyWebListener() {
	}

	@Override
	public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {
		System.out.println("Attribute has been added");
		String attributeName = httpSessionBindingEvent.getName();
		Object attributeValue = httpSessionBindingEvent.getValue();
		System.out.println("Attribute Name ::" + attributeName);
		System.out.println("Attribute Value ::" + attributeValue.toString());
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {
		System.out.println("Attribute has been Removed");
		String attributeName = httpSessionBindingEvent.getName();
		Object attributeValue = httpSessionBindingEvent.getValue();
		System.out.println("Attribute Name ::" + attributeName);
		System.out.println("Attribute Value ::" + attributeValue.toString());
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {
		System.out.println("Attribute has been Replaced");
		String attributeName = httpSessionBindingEvent.getName();
		Object attributeValue = httpSessionBindingEvent.getValue();
		System.out.println("Attribute Name ::" + attributeName);
		System.out.println("Attribute Value ::" + attributeValue.toString());
	}
}
