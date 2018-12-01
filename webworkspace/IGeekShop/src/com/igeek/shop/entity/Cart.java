package com.igeek.shop.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Cart implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Map<String,CartItem> cartItems = new HashMap<String,CartItem>();
	
	private double totlePrice;

	public Cart() {
		super();
	}

	public Cart(Map<String, CartItem> cartItems, double totlePrice) {
		super();
		this.cartItems = cartItems;
		this.totlePrice = totlePrice;
	}

	public Map<String, CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(Map<String, CartItem> cartItems) {
		this.cartItems = cartItems;
	}

	public double getTotlePrice() {
		return totlePrice;
	}

	public void setTotlePrice(double totlePrice) {
		this.totlePrice = totlePrice;
	}

	@Override
	public String toString() {
		return "Cart [cartItems=" + cartItems + ", totlePrice=" + totlePrice + "]";
	}

}
