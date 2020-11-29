package com.promtech.inventManageApi.util;

public enum MembershipLevel {

		SILVER(.05),
		GOLD(.10),
		DIAMOND(.15),
		PLATINUM(.20);
	
	private double discount;
	
	MembershipLevel(double discount) {
		this.setDiscount(discount);
			}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
}
