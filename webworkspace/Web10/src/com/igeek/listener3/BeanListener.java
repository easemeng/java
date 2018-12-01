package com.igeek.listener3;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * Application Lifecycle Listener implementation class BeanListener
 * 
 * ��������ļ����� �ӿ�:
 * 		HttpSessionBindingListener	�󶨵� (ʵ��������ӿڵ�JavaBean������Ը�֪���Լ����󶨵�session�кʹ�session��ɾ�����¼�)
 * 		HttpSessionActivationListener
 * 			��������JavaBean�����˽��Լ���session���е���Щ״̬
 * 			ע��:ʵ���������ӿڵ��಻��Ҫ��web.xml�н���ע��
 * 				(�൱�� �������������ǰ󶨵��������ϵ�	����Ҫ��web.xml��ע��)
 * 
 * 		getSession()
 * 		getValue()
 * 		getName()
 *
 *	��Ҫ��תһ��jspҳ��	Ȼ�󽫵�ǰ�������뵽session��	���ɴ���valueBound	�������session���Ƴ����ɴ���valueUnbound����
 */
public class BeanListener implements HttpSessionBindingListener {


    public BeanListener() {
        // TODO Auto-generated constructor stub
    }


    public void valueBound(HttpSessionBindingEvent hbe)  { 
         
    	// �����󱻰󶨵�session�е�ʱ�� ����õ�ǰ����
    	HttpSession session = hbe.getSession(); // ��ȡsession����
    	Object object = hbe.getValue(); // ��ȡ���뵽session�еĶ�����
    	System.out.println(object == this); // ��ȡ�����ֵ����	��ʵ����this...��ǰ��Ķ���
    	String name = hbe.getName(); // ��ȡsession�еĶ����nameֵ(name:value�Զ��е�nameֵ)
    }

    public void valueUnbound(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    	// �������session�н���󶨵��õ�ǰ����
    }
	
}
