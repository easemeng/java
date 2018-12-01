package com.igeek.shop.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;

import com.google.gson.Gson;
import com.igeek.common.utils.PaymentUtil;
import com.igeek.common.utils.StringUtils;
import com.igeek.shop.entity.Cart;
import com.igeek.shop.entity.CartItem;
import com.igeek.shop.entity.Category;
import com.igeek.shop.entity.Order;
import com.igeek.shop.entity.OrderItem;
import com.igeek.shop.entity.PageBean;
import com.igeek.shop.entity.Product;
import com.igeek.shop.entity.User;
import com.igeek.shop.service.ProductRelateService;
import com.igeek.shop.service.ProductRelateServiceImpl;

public class ProductRelatedServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ProductRelateService service = new ProductRelateServiceImpl();
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String state = request.getParameter("state");
		if(state.equals("categoryPage")){
			this.getCategoryList(request,response);
		}else if(state.equals("productCgPage")){
			this.productCgPage(request,response);
		}else if(state.equals("particulars")){
			this.productParticulars(request,response);
		}else if(state.equals("addCart")){
			this.createCart(request,response);
		}else if(state.equals("delCartProduct")){
			this.delCartProduct(request,response);
		}else if(state.equals("emptyCart")){
			this.emptyCart(request,response);
		}else if(state.equals("submitOrder")){
			this.submitOrder(request,response);
		}else if(state.equals("myOrder")){
			this.myOrder(request,response);
		}else if(state.equals("delOrder")){
			this.delOrder(request,response);
		}else if(state.equals("payment")){
			this.payment(request,response);
		}else if(state.equals("confirmPayment")){
			this.confirmPayment(request,response);
		}else if(state.equals("waitingForDelivery")){
			this.waitingForDelivery(request,response);
		}else if(state.equals("index")){
			this.index(request,response);
		}
		
	}
	
	private void index(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// ��ȡ����������Ʒ
		List<Product> hotProductList = service.findHotProductList();
		List<Product> newProductList = service.findNewProductList();
		List<Category> CategoryList = service.findCategoryList();

		// �����ݴ�ŵ�request����
		request.setAttribute("hotProductList", hotProductList);
		request.setAttribute("newProductList", newProductList);
		request.setAttribute("CategoryList", CategoryList);

		// ��������ת
		request.getRequestDispatcher("/index.jsp").forward(request, response);

	}

	private void waitingForDelivery(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();

		User user = (User) session.getAttribute("user");
		if (user == null) {
			response.sendRedirect(request.getContextPath() + "/login.jsp");
			return;
		}

		List<Order> orderList = service.findPaymentOrders(user.getUid());
		if (orderList != null) {
			for (Order order : orderList) {
				List<Map<String, Object>> orderItemMap = service.findOrderItem(order.getOid());

				for (Map<String, Object> map : orderItemMap) {

					try {
						OrderItem orderItem = new OrderItem();
						BeanUtils.populate(orderItem, map);
						Product product = new Product();
						BeanUtils.populate(product, map);
						orderItem.setProduct(product);
						order.getOrderItems().add(orderItem);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
		
		request.setAttribute("orderList", orderList);
		request.getRequestDispatcher("/order_list.jsp").forward(request, response);
		
	}

	private void confirmPayment(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		Order order = (Order) session.getAttribute("order");

		try {
			BeanUtils.populate(order, request.getParameterMap());
			service.confirmOrder(order);
/*
			// ֧������
			String orderid = order.getOid();
			// String money = order.getTotal() + "";
			String money = "0.01";
			// ����
			String pd_FrpId = request.getParameter("pd_FrpId");
			// ����֧����˾��Ҫ��Щ����
			String p0_Cmd = "Buy";
			String p1_MerId = ResourceBundle.getBundle("merchantInfo").getString("p1_MerId");
			String p2_Order = orderid;
			String p3_Amt = money;
			String p4_Cur = "CNY";
			String p5_Pid = "";
			String p6_Pcat = "";
			String p7_Pdesc = "";
			// ֧���ɹ��ص���ַ------������֧����˾����ʡ��û�����
			// ������֧�����Է�����ַ
			String p8_Url = ResourceBundle.getBundle("merchantInfo").getString("callback");
			String p9_SAF = "";
			String pa_MP = "";
			String pr_NeedResponse = "1";
			// ����hmac ��Ҫ��Կ
			String keyValue = ResourceBundle.getBundle("merchantInfo").getString("keyValue");
			String hmac = PaymentUtil.buildHmac(p0_Cmd, p1_MerId, p2_Order, p3_Amt, p4_Cur, p5_Pid, p6_Pcat, p7_Pdesc,
					p8_Url, p9_SAF, pa_MP, pd_FrpId, pr_NeedResponse, keyValue);
			String url = "https://www.yeepay.com/app-merchant-proxy/node?pd_FrpId=" + pd_FrpId + "&p0_Cmd=" + p0_Cmd
					+ "&p1_MerId=" + p1_MerId + "&p2_Order=" + p2_Order + "&p3_Amt=" + p3_Amt + "&p4_Cur=" + p4_Cur
					+ "&p5_Pid=" + p5_Pid + "&p6_Pcat=" + p6_Pcat + "&p7_Pdesc=" + p7_Pdesc + "&p8_Url=" + p8_Url
					+ "&p9_SAF=" + p9_SAF + "&pa_MP=" + pa_MP + "&pr_NeedResponse=" + pr_NeedResponse + "&hmac=" + hmac;
			// �ض��򵽵�����ƽ̨
			response.sendRedirect(url);
*/
			service.updateOrderState(order.getOid());
		} catch (Exception e) {
			e.printStackTrace();
		}

		waitingForDelivery(request, response);
	}

	private void payment(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();

		User user = (User) session.getAttribute("user");
		if (user == null) {
			response.sendRedirect(request.getContextPath() + "/login.jsp");
			return;
		}

		String oid = request.getParameter("oid");
		
		Order order = service.findOneOrders(oid);
		
		List<Map<String, Object>> orderItemMap = service.findOrderItem(oid);

		for (Map<String, Object> map : orderItemMap) {

			try {
				OrderItem orderItem = new OrderItem();
				BeanUtils.populate(orderItem, map);
				Product product = new Product();
				BeanUtils.populate(product, map);
				orderItem.setProduct(product);
				order.getOrderItems().add(orderItem);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		session.setAttribute("order", order);
		request.setAttribute("order", order);
		request.getRequestDispatcher("/order_pay.jsp").forward(request, response);
		
	}

	private void delOrder(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();

		User user = (User) session.getAttribute("user");
		if (user == null) {
			response.sendRedirect(request.getContextPath() + "/login.jsp");
			return;
		}

		
		String oid = request.getParameter("oid");
		service.delOrderItem(oid);
		service.delOrder(oid);
		myOrder(request,response);

	}

	private void myOrder(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		User user = (User) session.getAttribute("user");
		if (user == null) {
			response.sendRedirect(request.getContextPath() + "/login.jsp");
			return;
		}

		List<Order> orderList = service.findOrders(user.getUid());
		if (orderList != null) {
			for (Order order : orderList) {
				List<Map<String, Object>> orderItemMap = service.findOrderItem(order.getOid());

				for (Map<String, Object> map : orderItemMap) {

					try {
						OrderItem orderItem = new OrderItem();
						BeanUtils.populate(orderItem, map);
						Product product = new Product();
						BeanUtils.populate(product, map);
						orderItem.setProduct(product);
						order.getOrderItems().add(orderItem);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
		
		request.setAttribute("orderList", orderList);
		request.getRequestDispatcher("/order_list.jsp").forward(request, response);
	}

	private void submitOrder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		if(user == null){
			response.sendRedirect(request.getContextPath() + "/login.jsp");
			return;
		}
		
		Order order = new Order();
		
		order.setOid(StringUtils.getUUID());
		order.setOrdertime(new Date());
		
		Cart cart = (Cart) session.getAttribute("cart");
		order.setTotal(cart.getTotlePrice());
		
		order.setUser(user);
		
		Map<String,CartItem> cartItem = cart.getCartItems();
		
		// entrySet() ���ش˵�ͼ�а�����ӳ���Set��ͼ�� 
		for(Entry<String, CartItem> entry : cartItem.entrySet()){
			
			CartItem cartItems = entry.getValue();
			
			OrderItem orderItem = new OrderItem();
			orderItem.setItemid(StringUtils.getUUID());
			orderItem.setCount(cartItems.getQuantity());
			orderItem.setSubtotal(cartItems.getSubTotal());
			orderItem.setProduct(cartItems.getProduct());
			orderItem.setOrder(order);
			
			order.getOrderItems().add(orderItem);
			
		}
		
		service.submitOrders(order);
		
		List<OrderItem> orderItem = order.getOrderItems();
		for (OrderItem orderItem2 : orderItem) {
			service.submitOrderItems(orderItem2);
		}	
		
		session.removeAttribute("cart");
		session.setAttribute("order", order);
		
		response.sendRedirect(request.getContextPath() + "/order_info.jsp");
		
	}

	private void emptyCart(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		session.removeAttribute("cart");
		response.sendRedirect(request.getContextPath() + "/cart.jsp");
		
	}

	private void delCartProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pid = request.getParameter("pid");
		
		HttpSession session = request.getSession();
		Cart cart = (Cart) session.getAttribute("cart");
		
		double st = cart.getCartItems().get(pid).getSubTotal();
		cart.setTotlePrice(cart.getTotlePrice()-st);
		cart.getCartItems().remove(pid);
		
		if(cart.getTotlePrice() == 0){
			session.removeAttribute("cart");
		}else{
			session.setAttribute("cart", cart);
		}
		
		response.sendRedirect(request.getContextPath() + "/cart.jsp");
		
	}

	private void createCart(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pid = request.getParameter("pid");
		String qty = request.getParameter("quantity");
		
		// ����һ����Ʒ����Ϊ1
		int quantity = 1;
		// �ж�ȡ������Ʒ���Ƿ�Ϊ��
		if(qty != null){
			// ��Ϊ�� ǿתΪint���� ��ֵ����Ʒ����
			quantity = Integer.parseInt(qty);
			// �жϴ�ʱ����Ʒ�����Ƿ�С�ڵ���0
			if(quantity <= 0){
				// ����Ʒ����С�ڵ���0 �� ���� ��תʧ��ҳ�� ����������
				request.setAttribute("error", "���������ֵ" + quantity + "�Ƿ�����˶Ժ����ύ");
				request.getRequestDispatcher("/error.jsp").forward(request, response);
				return;
			}
		}
		// ���ݴ����pid��ѯ��Ʒ����ϸ��Ϣ
		Product product = service.getOneProduct(pid);
		// �����ĳ����ƷС��	��Ʒ�۸�*����
		double price = product.getShop_price() * quantity;
		
		// CartItem cartItem = new CartItem(product,quantity,price);
		// ����ƷС�� ��ֵ���µļ۸�
		double newPrice = price;
		
		HttpSession session = request.getSession();
		// ��session����ȡ��һ�����ﳵcart����
		Cart cart = (Cart) session.getAttribute("cart");
		// �ж�ȡ����cart����Ϊ�� �򴴽�һ���µ�cart����
		if(cart == null){
			cart = new Cart();
		}
		// ȡ��cart�����е�Map����CartItems
		Map<String,CartItem> cartItems = cart.getCartItems();
		// �жϼ����е����еļ��Ƿ�������ε����pid
		if(cartItems.containsKey(pid)){
			// ������ ��ȡ����valueֵ �����е�����ȡ��
			int oldQuantity = cartItems.get(pid).getQuantity();
			// �µ���Ʒ����Ϊ	ԭ�е�+���ڵ�
			quantity += oldQuantity;
			// �������µ���Ʒ�۸�
			newPrice = product.getShop_price() * quantity;
		}
		
		// ����Ʒ��Ϣ �������� ��ƷС�Ƽ۸� ����cartItem ������
		CartItem cartItem = new CartItem(product,quantity,newPrice);
		// ����Ʒpid����װ�õ�cartItem���� �Լ�ֵ�Ե���ʽ����cart��
		cart.getCartItems().put(pid, cartItem);
		
		cart.setTotlePrice(cart.getTotlePrice() + price);
		
		session.setAttribute("cart", cart);
		
/*		request.setAttribute("product",product );
		request.setAttribute("quantity",quantity );
		request.setAttribute("price",price );		
		request.getRequestDispatcher("/cart.jsp").forward(request, response);*/
		
		response.sendRedirect(request.getContextPath() + "/cart.jsp");
		
	}

	private void productParticulars(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pid = request.getParameter("pid");
		String currentPageNumber = request.getParameter("currentPageNumber");
		
		Product product = service.getOneProduct(pid);
		String cid = product.getCid();
		Category category = service.getOneCategory(cid);
		
		/**
		 * д�����¼ ˼·
		 * 	ÿ�ε����Ʒ (ÿ�ε����Ʒ������뵱ǰ����) �����¼һ��cookie���ͻ��� ��cookie��idΪpids
		 * 	pidsӦ����һ��ƴ�ӹ���	3-2-1 ˳����ҵ���
		 */
		
		// �������Ʒ�����ǰ��ҳ��ȡ������Ʒid��ֵ��pids
		String pids = pid;
		// ����һ��Cookie���� ���մ�����ͷ�л�õ�cookie
		Cookie[] cookies = request.getCookies();
		// �ж�ȡ����cookie�Ƿ�Ϊ�� �Ƿ���ֵ
		if(cookies != null && cookies.length > 0){
			// ������Ϊ�յ�cookie
			for (Cookie cookie : cookies) {
				// �ж� cookie���Ƿ��� ����Ϊ pids ��ֵ ����� ����ִ��
				if(cookie.getName().equals("pids")){
					// ȡ��cookie�� pids��Ӧ��valueֵ 
					pids = cookie.getValue();
					// ����һ��String���� ���մ�cookie��ȡ����ֵ(ȥ���м��-)
					String[] ids = pids.split("-");
					// ��ȡ��ֵ������ת��Ϊ����(ע:ͨ��Arrays.asList(String[]) ת����ļ��� �������޸Ĳ��� ֻ�ܲ鿴)
					List<String> idsList = Arrays.asList(ids);	// ��ǰ���鲻�����޸Ĳ���
					// ������ת��ΪLinkedList����(����ӷ���ΪString)
					LinkedList<String> idsList2 = new LinkedList<String>(idsList);
					// �ж� �õ��ļ������Ƿ��� ��ǰ�������Ʒ��pid ����� �Ƚ����Ƴ� Ȼ������ӵ����ϵĵ�һλ
					if(idsList2.contains(pid)){
						idsList2.remove(pid);
					}
					// ����ǰ��Ʒ��pid��ӵ����ϵĵ�һλ
					idsList2.addFirst(pid);
					// ����һ��û���ַ����ַ���������
					StringBuffer sbf = new StringBuffer();
					// ѭ���������� ��ѯ��󲻳���7������ ����ѯ�������ݲ��뵽 �������� ��Ҫ����֮ǰȥ����-
					for(int i = 0; i < idsList2.size() && i < 7; i++){
						sbf.append(idsList2.get(i));
						sbf.append("-");
					}
					// ����һ���µ��ַ��� ���а����������е�ǰ�������ַ��������� (Ҫȥ�����һ���������-)
					String sb = sbf.substring(0,sbf.length() - 1);
					// ���ش�˳���е����ݵ��ַ���
					pids = sb.toString();
				}
			}
		}
		// ����һ���µ�cookie ��ƴ�Ӵ����� pid ����cookie��
		Cookie c = new Cookie("pids",pids);
		// ��cookie��ӵ���Ӧ��
		response.addCookie(c);
		
/*		
		HttpSession session = request.getSession();
		LinkedList<String> pidList = (LinkedList<String>) session.getAttribute("historyPidList");
		
		if(pidList != null && pidList.size() > 0){
			if(pidList.contains(pid)){
				pidList.remove(pid);
			}
		}
		if(pidList == null){
			pidList = new LinkedList<String>();
		}
		pidList.addFirst(pid);
		session.setAttribute("historyPidList", pidList);
		*/
		request.setAttribute("currentPageNumber", currentPageNumber);
		request.setAttribute("category", category);
		request.setAttribute("product", product);
		request.getRequestDispatcher("/product_info.jsp").forward(request, response);
		
	}

	private void productCgPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String page = request.getParameter("page");
		int currentPageNumber = Integer.parseInt(page);
		String cid = request.getParameter("cid");
		Category category = service.getOneCategory(cid);
		request.setAttribute("category", category);
		long totalPageDataNumber = service.getProductNumberByCid(cid);
		PageBean pageBean = service.getPageBeanByCategory(currentPageNumber,12,totalPageDataNumber,cid);
	
		
		// ����һ����ʷ��¼����historyList
		List<Product> historyList = new ArrayList<Product>();
		// ����һ��Cookie���� ��������ͷ�е�cookie
		Cookie[] cookies = request.getCookies();
		// �ж�cookie���Ƿ�Ϊ��
		if(cookies != null && cookies.length > 0){
			// ��������ֵ��cookie
			for (Cookie cookie : cookies) {
				// �ж��Ƿ��� NameΪ pids ��ֵ
				if(cookie.getName().equals("pids")){
					// ȡ�� pids ��Ӧ ��value
					String values = cookie.getValue();
					// ����һ��String���� ���մ�cookie��ȡ����ֵ(ȥ���м��-)
					String[] pids = values.split("-");
					// ����������pids����	ʹ��ÿ����ѯ����pid��ѯ����Ʒ��Ϣ ����ѯ������Ʒ����ѭ����ӵ�historyList
					for (String pid : pids) {
						Product pro = service.getOneProduct(pid);
						historyList.add(pro);
					}
				}
			}
		}
		// ��historyList���� ���뵽�������� ����ǰ��ҳ��ʹ�� 
		request.setAttribute("historyList", historyList); 
/*
		HttpSession session = request.getSession();
		LinkedList<String> pidList = (LinkedList<String>) session.getAttribute("historyPidList");
		List<Product> historyList = new ArrayList<Product>();
		if(pidList != null){
			for (String pid : pidList) {
				Product pro = service.getOneProduct(pid);
				historyList.add(pro);
			}
		}
		request.setAttribute("historyList", historyList); 
		
	*/	request.setAttribute("pageBean", pageBean);
		request.getRequestDispatcher("/product_list.jsp").forward(request, response);
		
	}

	protected void getCategoryList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Category> categoryList = service.findCategoryList();
		// ��Ҫ��categoryListת��json
		Gson gson = new Gson();
		// 	.tojson() ���� ת����json��ʽ
		String json = gson.toJson(categoryList);
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().write(json);
		
	}

}
