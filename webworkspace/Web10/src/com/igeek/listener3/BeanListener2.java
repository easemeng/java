package com.igeek.listener3;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

/**
 * 
 * HttpSessionActivationListener
 * 	1) ����ʵ���˸ýӿں�Serializable �ӿڵ�java��Ķ�����session �ۻ��ͻ�¼�
 * 	>�:�Ӵ����ж�ȡsession����
 * 	>�ۻ�:�������д��session����
 * 	>session����洢��Tomcat��������work\Catalina\localhost\contextPathĿ¼��
 * 		SESSION.SER
 * 	2) �ü���������Ҫ�� web.xml �ļ��н�������
 * 	3) // �ڻ֮�󱻵��� public void sessionDidActivate(HttpSessionEvent se)
 * 		// �ڶۻ�֮ǰ������ sessionWillPassivate(HttpSessionEvent se)
 * 
 *	HttpSessionEvent:getSession()
 */
public class BeanListener2 implements HttpSessionActivationListener {

    public BeanListener2() {
        // TODO Auto-generated constructor stub
    }

    public void sessionDidActivate(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    	System.out.println("��Ӳ��д�뵽�ڴ���");
    }


    public void sessionWillPassivate(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    	System.out.println("���ڴ���д�뵽Ӳ����");
    }
	
}
