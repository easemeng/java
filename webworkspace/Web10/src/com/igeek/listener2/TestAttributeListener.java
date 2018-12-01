package com.igeek.listener2;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Application Lifecycle Listener Implementation class TestAttributeListener
 * 
 * 感知属性变化的Listener
 * 	ServletContextAttributeListener 监听	application域中属性的变化
 * 	ServletRequestAttributeListener	监听	request域中属性的变化
 * 	HttpSessionAttributeListener	监听	session域中属性的变化
 * 
 * 	>getName():获取属性的名字
 * 	>getValue():获取属性的值
 * 
 * 这三个监听器都有这两个方法
 */

public class TestAttributeListener implements ServletContextAttributeListener, HttpSessionAttributeListener, ServletRequestAttributeListener {

    public TestAttributeListener() {
        
    }

    public void attributeAdded(ServletContextAttributeEvent arg0)  { 
         System.out.println(arg0.getName() + arg0.getValue());
    }

    public void attributeRemoved(ServletContextAttributeEvent arg0)  { 
         
    }

    public void attributeRemoved(ServletRequestAttributeEvent arg0)  { 
         
    }

    public void attributeAdded(ServletRequestAttributeEvent arg0)  { 
         
    }

    public void attributeReplaced(ServletRequestAttributeEvent arg0)  { 
         
    }

    public void attributeAdded(HttpSessionBindingEvent arg0)  { 
         
    }

    public void attributeRemoved(HttpSessionBindingEvent arg0)  { 
         
    }

    public void attributeReplaced(HttpSessionBindingEvent arg0)  { 
         
    }

    public void attributeReplaced(ServletContextAttributeEvent arg0)  { 
         
    }
	
}
