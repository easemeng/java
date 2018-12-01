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
 * ʹ������ Listener ���� application ����Ĵ���������
 * 
 * �����ڵ�ǰ��webӦ�ñ����ص�ʱ������ʼ������
 * 
 * ���� 1. �������ݿ����ӳ� 	2. ����springIOC���� 	3. ��ȡ��ǰwebӦ�õĳ�ʼ������
 * 
 * ����ǰ���������Ƶ�	(������������Ǽ����������ڵ�)
 * 	ServletContextListener	����	ServletContext	����Ĵ���������
 * 	ServletRequestListener	����	ServletRequest	����Ĵ���������
 * 	HttpSessionListener		����	HttpSession		����Ĵ���������
 * 
 * 	session���������ڻع�
 * 	1. ����session�Ĵ�������һ�η���jsp����servlet��ʱ��(jsp�� session="false" û������,servlet��û��ʹ��request.getSession(false),
 * 		����ʹ����request.getSession()����request.getSession(true))��ʱ��ᴴ��һ��session����
 * 	2. session�����٣�session�Ĺ���	ֱ�ӵ���session��invalidate��������ǰwebӦ�ñ�ж��(session���Ա��־û��������ڷ������в鿴session��Ϣ���ļ�)
 * 	3. �ر��������������ζ��session�����٣�������ͨ��JSESSIONID�ҵ��������е�session����
 * 		http://localhost:8080/web10/index.jsp;JSESSIONID=ֵ 
 * 		����д����Ϊ URL ��д	(ǰ��ƴ�ӵ��������·��);JSESSIONID=ֵ
 * 
 * application������������ڹᴩ��webӦ��
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
         
    	System.out.println("appliction��������");
    	ServletContext servletContext = sce.getServletContext();
    	
    }

    public void contextInitialized(ServletContextEvent arg0)  { 
         
    	// ���±���֮�� �ͻᷢ�ּ����� ������Ȼ�������´���
    	System.out.println("application�������´�����");
    	
    }
	
}
