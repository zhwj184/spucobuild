package com.alibaba.spucobuild.domain;

public class OrderModel {
	// / <summary>
	// / 结果处理状态码 -1：签名错误 0：结果解析出错 1 正确
	// / </summary>
	public int retCode;

	// / <summary>
	// / 消息id，这里用订单id作为消息id，根据订单id来去重
	// / </summary>
	public long message_id;
	

	// / <summary>
	// / 订单信息
	// / </summary>
	public OrderMap orderMap;

	public int getRetCode() {
		return retCode;
	}

	public void setRetCode(int retCode) {
		this.retCode = retCode;
	}

	public long getMessage_id() {
		return message_id;
	}

	public void setMessage_id(long message_id) {
		this.message_id = message_id;
	}

	public OrderMap getOrderMap() {
		return orderMap;
	}

	public void setOrderMap(OrderMap orderMap) {
		this.orderMap = orderMap;
	}

}
