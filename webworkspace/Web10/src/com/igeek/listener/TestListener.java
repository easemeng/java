package com.igeek.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 
 * 使用最多的 Listener 监听 application 对象的创建与销毁
 * 
 * 可以在当前的web应用被加载的时候做初始化操作
 * 
 * 比如 1. 创建数据库连接池 	2. 创建springIOC容器 	3. 读取当前web应用的初始化参数
 * 
 * 跟当前监听器类似的	(这三个域对象是监听生命周期的)
 * 	ServletContextListener	监听	ServletContext	对象的创建与销毁
 * 	ServletRequestListener	监听	ServletRequest	对象的创建与销毁
 * 	HttpSessionListener		监听	HttpSession		对象的创建与销毁
 * 
 * 	session的生命周期回顾
 * 	1. 首先session的创建，第一次访问jsp或者servlet的时候(jsp中 session="false" 没有设置,servlet中没有使用request.getSession(false),
 * 		但是使用了request.getSession()或者request.getSession(true))的时候会创建一个session对象
 * 	2. session的销毁，session的过期	直接调用session的invalidate方法，当前web应用被卸载(session可以被持久化，可以在服务器中查看session信息的文件)
 * 	3. 关闭浏览器，并不意味着session被销毁，，可以通过JSESSIONID找到服务器中的session对象
 * 		http://localhost:8080/web10/index.jsp;JSESSIONID=值 
 * 		这种写法称为 URL 重写	(前面拼接的是请求的路径);JSESSIONID=值
 * 
 * application对象的生命周期贯穿于web应用
 *
 */

public class TestListener implements HttpSessionListener, ServletContextListener, ServletRequestListener {

    public void sessionCreated(HttpSessionEvent arg0)  { 
         
    }

    public void requestDestroyed(ServletRequestEvent arg0)  { 
         
    }

    public void requestInitialized(ServletRequestEvent arg0)  { 
         
    }

    public void sessionDestroyed(HttpSessionEvent arg0)  { 
         
    }

    public void contextDestroyed(ServletContextEvent sce)  { 
         
    	System.out.println("appliction对象被销毁");
    	ServletContext servletContext = sce.getServletContext();
    	
    }

    public void contextInitialized(ServletContextEvent arg0)  { 
         
    	// 重新编译之后 就会发现监听器 被销毁然后又重新创建
    	System.out.println("application对象被重新创建了");
    	
    }
	
}
