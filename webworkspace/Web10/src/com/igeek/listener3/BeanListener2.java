package com.igeek.listener3;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

/**
 * 
 * HttpSessionActivationListener
 * 	1) 监听实现了该接口和Serializable 接口的java类的对象随session 钝化和活化事件
 * 	>活化:从磁盘中读取session对象
 * 	>钝化:向磁盘中写入session对象
 * 	>session对象存储在Tomcat服务器的work\Catalina\localhost\contextPath目录下
 * 		SESSION.SER
 * 	2) 该监听器不需要在 web.xml 文件中进行配置
 * 	3) // 在活化之后被调用 public void sessionDidActivate(HttpSessionEvent se)
 * 		// 在钝化之前被调用 sessionWillPassivate(HttpSessionEvent se)
 * 
 *	HttpSessionEvent:getSession()
 */
public class BeanListener2 implements HttpSessionActivationListener {

    public BeanListener2() {
        // TODO Auto-generated constructor stub
    }

    public void sessionDidActivate(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    	System.out.println("从硬盘写入到内存中");
    }


    public void sessionWillPassivate(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    	System.out.println("从内存中写入到硬盘中");
    }
	
}
