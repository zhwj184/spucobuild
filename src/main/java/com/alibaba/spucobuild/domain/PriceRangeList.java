package com.alibaba.spucobuild.domain;

public class PriceRangeList {
	// / <summary>
	// / 价格区间
	// / </summary>
	private OrderPriceRange[] priceRange;

	public OrderPriceRange[] getPriceRange() {
		return priceRange;
	}

	public void setPriceRange(OrderPriceRange[] priceRange) {
		this.priceRange = priceRange;
	}
}
