package com.alibaba.spucobuild.domain;

public class OrderEntryList {
	// / <summary>
	// / 子订单列表
	// / </summary>
	private OrderEntry[] orderEntry;

	public OrderEntry[] getOrderEntry() {
		return orderEntry;
	}

	public void setOrderEntry(OrderEntry[] orderEntry) {
		this.orderEntry = orderEntry;
	}
}
