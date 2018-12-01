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
 * ��֪���Ա仯��Listener
 * 	ServletContextAttributeListener ����	application�������Եı仯
 * 	ServletRequestAttributeListener	����	request�������Եı仯
 * 	HttpSessionAttributeListener	����	session�������Եı仯
 * 
 * 	>getName():��ȡ���Ե�����
 * 	>getValue():��ȡ���Ե�ֵ
 * 
 * ��������������������������
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
