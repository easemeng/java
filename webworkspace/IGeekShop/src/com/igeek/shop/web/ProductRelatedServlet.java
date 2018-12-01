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

		// 获取最新最热商品
		List<Product> hotProductList = service.findHotProductList();
		List<Product> newProductList = service.findNewProductList();
		List<Category> CategoryList = service.findCategoryList();

		// 将数据存放到request域中
		request.setAttribute("hotProductList", hotProductList);
		request.setAttribute("newProductList", newProductList);
		request.setAttribute("CategoryList", CategoryList);

		// 服务器跳转
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
			// 支付功能
			String orderid = order.getOid();
			// String money = order.getTotal() + "";
			String money = "0.01";
			// 银行
			String pd_FrpId = request.getParameter("pd_FrpId");
			// 发给支付公司需要哪些数据
			String p0_Cmd = "Buy";
			String p1_MerId = ResourceBundle.getBundle("merchantInfo").getString("p1_MerId");
			String p2_Order = orderid;
			String p3_Amt = money;
			String p4_Cur = "CNY";
			String p5_Pid = "";
			String p6_Pcat = "";
			String p7_Pdesc = "";
			// 支付成功回调地址------第三方支付公司会访问、用户访问
			// 第三方支付可以访问网址
			String p8_Url = ResourceBundle.getBundle("merchantInfo").getString("callback");
			String p9_SAF = "";
			String pa_MP = "";
			String pr_NeedResponse = "1";
			// 加密hmac 需要秘钥
			String keyValue = ResourceBundle.getBundle("merchantInfo").getString("keyValue");
			String hmac = PaymentUtil.buildHmac(p0_Cmd, p1_MerId, p2_Order, p3_Amt, p4_Cur, p5_Pid, p6_Pcat, p7_Pdesc,
					p8_Url, p9_SAF, pa_MP, pd_FrpId, pr_NeedResponse, keyValue);
			String url = "https://www.yeepay.com/app-merchant-proxy/node?pd_FrpId=" + pd_FrpId + "&p0_Cmd=" + p0_Cmd
					+ "&p1_MerId=" + p1_MerId + "&p2_Order=" + p2_Order + "&p3_Amt=" + p3_Amt + "&p4_Cur=" + p4_Cur
					+ "&p5_Pid=" + p5_Pid + "&p6_Pcat=" + p6_Pcat + "&p7_Pdesc=" + p7_Pdesc + "&p8_Url=" + p8_Url
					+ "&p9_SAF=" + p9_SAF + "&pa_MP=" + pa_MP + "&pr_NeedResponse=" + pr_NeedResponse + "&hmac=" + hmac;
			// 重定向到第三方平台
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
		
		// entrySet() 返回此地图中包含的映射的Set视图。 
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
		
		// 设置一个商品总数为1
		int quantity = 1;
		// 判断取到的商品数是否为空
		if(qty != null){
			// 不为空 强转为int类型 赋值到商品总数
			quantity = Integer.parseInt(qty);
			// 判断此时的商品总数是否小于等于0
			if(quantity <= 0){
				// 若商品总数小于等于0 则 报错 跳转失败页面 并跳出方法
				request.setAttribute("error", "您输入的数值" + quantity + "非法，请核对后再提交");
				request.getRequestDispatcher("/error.jsp").forward(request, response);
				return;
			}
		}
		// 根据传入的pid查询商品的详细信息
		Product product = service.getOneProduct(pid);
		// 计算出某种商品小计	商品价格*数量
		double price = product.getShop_price() * quantity;
		
		// CartItem cartItem = new CartItem(product,quantity,price);
		// 将商品小计 赋值给新的价格
		double newPrice = price;
		
		HttpSession session = request.getSession();
		// 从session域中取到一个购物车cart对象
		Cart cart = (Cart) session.getAttribute("cart");
		// 判断取到的cart对象为空 则创建一个新的cart对象
		if(cart == null){
			cart = new Cart();
		}
		// 取到cart对象中的Map集合CartItems
		Map<String,CartItem> cartItems = cart.getCartItems();
		// 判断集合中的已有的键是否包含本次点击的pid
		if(cartItems.containsKey(pid)){
			// 若含有 则取出其value值 将其中的数量取出
			int oldQuantity = cartItems.get(pid).getQuantity();
			// 新的商品数量为	原有的+现在的
			quantity += oldQuantity;
			// 计算获得新的商品价格
			newPrice = product.getShop_price() * quantity;
		}
		
		// 将商品信息 购买数量 商品小计价格 放入cartItem 对象中
		CartItem cartItem = new CartItem(product,quantity,newPrice);
		// 将商品pid及封装好的cartItem对象 以键值对的形式放入cart中
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
		 * 写浏览记录 思路
		 * 	每次点击商品 (每次点击商品都会进入当前方法) 都会记录一个cookie给客户端 该cookie的id为pids
		 * 	pids应该是一个拼接过程	3-2-1 顺序从右到左
		 */
		
		// 将点击商品详情后前端页面取到的商品id赋值给pids
		String pids = pid;
		// 创建一个Cookie数组 接收从请求头中获得的cookie
		Cookie[] cookies = request.getCookies();
		// 判断取到的cookie是否为空 是否含有值
		if(cookies != null && cookies.length > 0){
			// 遍历不为空的cookie
			for (Cookie cookie : cookies) {
				// 判断 cookie中是否含有 名字为 pids 的值 如果有 继续执行
				if(cookie.getName().equals("pids")){
					// 取到cookie中 pids对应的value值 
					pids = cookie.getValue();
					// 创建一个String数组 接收从cookie中取到的值(去掉中间的-)
					String[] ids = pids.split("-");
					// 将取到值的数组转换为集合(注:通过Arrays.asList(String[]) 转化后的集合 不能做修改操作 只能查看)
					List<String> idsList = Arrays.asList(ids);	// 当前数组不能做修改操作
					// 将集合转换为LinkedList集合(可添加泛型为String)
					LinkedList<String> idsList2 = new LinkedList<String>(idsList);
					// 判断 拿到的集合中是否含有 当前点击的商品的pid 如果有 先将其移除 然后再添加到集合的第一位
					if(idsList2.contains(pid)){
						idsList2.remove(pid);
					}
					// 将当前商品的pid添加到集合的第一位
					idsList2.addFirst(pid);
					// 构造一个没有字符的字符串缓冲区
					StringBuffer sbf = new StringBuffer();
					// 循环遍历集合 查询最大不超过7个数据 将查询到的数据插入到 缓冲区中 还要加入之前去掉的-
					for(int i = 0; i < idsList2.size() && i < 7; i++){
						sbf.append(idsList2.get(i));
						sbf.append("-");
					}
					// 返回一个新的字符串 其中包含此序列中当前包含的字符的子序列 (要去掉最后一个多出来的-)
					String sb = sbf.substring(0,sbf.length() - 1);
					// 返回此顺序中的数据的字符串
					pids = sb.toString();
				}
			}
		}
		// 创建一个新的cookie 将拼接处理后的 pid 放入cookie中
		Cookie c = new Cookie("pids",pids);
		// 将cookie添加到响应中
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
	
		
		// 创建一个历史记录集合historyList
		List<Product> historyList = new ArrayList<Product>();
		// 创建一个Cookie数组 接收请求头中的cookie
		Cookie[] cookies = request.getCookies();
		// 判断cookie中是否为空
		if(cookies != null && cookies.length > 0){
			// 遍历含有值的cookie
			for (Cookie cookie : cookies) {
				// 判断是否有 Name为 pids 的值
				if(cookie.getName().equals("pids")){
					// 取到 pids 对应 的value
					String values = cookie.getValue();
					// 创建一个String数组 接收从cookie中取到的值(去掉中间的-)
					String[] pids = values.split("-");
					// 遍历处理后的pids数组	使用每个查询到的pid查询到商品信息 将查询到的商品对象循环添加到historyList
					for (String pid : pids) {
						Product pro = service.getOneProduct(pid);
						historyList.add(pro);
					}
				}
			}
		}
		// 将historyList集合 放入到请求域中 方便前端页面使用 
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
		// 需要将categoryList转成json
		Gson gson = new Gson();
		// 	.tojson() 方法 转换成json格式
		String json = gson.toJson(categoryList);
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().write(json);
		
	}

}
