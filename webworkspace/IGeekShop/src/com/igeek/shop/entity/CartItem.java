package com.igeek.shop.entity;

import java.io.Serializable;

public class CartItem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Product product;
	private int quantity;
	private double subTotal;
	
	public CartItem() {
		super();
	}

	public CartItem(Product product, int quantity, double subTotal) {
		super();
		this.product = product;
		this.quantity = quantity;
		this.subTotal = subTotal;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	@Override
	public String toString() {
		return "CartItem [product=" + product + ", quantity=" + quantity + ", subTotal=" + subTotal + "]";
	}

}
