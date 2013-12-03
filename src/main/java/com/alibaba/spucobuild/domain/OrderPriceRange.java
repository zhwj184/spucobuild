package com.alibaba.spucobuild.domain;

public class OrderPriceRange {
	// / <summary>
	// / 起始数量。商品批发价格区间的最低起批量
	// / </summary>
	public int beginAmount;

	// / <summary>
	// / 终止数量。商品批发价格区间的最高起批量
	// / </summary>
	public int endAmount;

	// / <summary>
	// / 价格。商品批发价格
	// / </summary>
	public double price;

	public int getBeginAmount() {
		return beginAmount;
	}

	public void setBeginAmount(int beginAmount) {
		this.beginAmount = beginAmount;
	}

	public int getEndAmount() {
		return endAmount;
	}

	public void setEndAmount(int endAmount) {
		this.endAmount = endAmount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
