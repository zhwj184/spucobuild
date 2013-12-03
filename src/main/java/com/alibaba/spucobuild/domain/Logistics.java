package com.alibaba.spucobuild.domain;

/// <summary>
/// 物流信息
/// </summary>
public class Logistics {
	// / <summary>
	// / 物流编号
	// / </summary>
	public long logisticsId;
	// / <summary>
	// / 发货联系人
	// / </summary>
	public String fromContact;
	// / <summary>
	// / 发货联系手机
	// / </summary>
	public String fromMobile;
	// / <summary>
	// / 发货联系电话
	// / </summary>
	public String fromPhone;
	// / <summary>
	// / 发货省编码
	// / </summary>
	public String fromProvince;
	// / <summary>
	// / 发货市编码
	// / </summary>
	public String fromCity;
	// / <summary>
	// / 发货区编码
	// / </summary>
	public String fromArea;
	// / <summary>
	// / 发货街道地址
	// / </summary>
	public String fromAddress;
	// / <summary>
	// / 发货地址邮编
	// / </summary>
	public String fromPost;
	// / <summary>
	// / 收货联系人
	// / </summary>
	public String toContact;
	// / <summary>
	// / 收货联系手机
	// / </summary>
	public String toMobile;
	// / <summary>
	// / 收货联系电话
	// / </summary>
	public String toPhone;
	// / <summary>
	// / 收货省编码
	// / </summary>
	public String toProvince;
	// / <summary>
	// / 收货市编码
	// / </summary>
	public String toCity;
	// / <summary>
	// / 收货区编码
	// / </summary>
	public String toArea;
	// / <summary>
	// / 收货街道地址
	// / </summary>
	public String toAddress;
	// / <summary>
	// / 收货地址邮编
	// / </summary>
	public String toPost;
	// / <summary>
	// / 物流公司编号
	// / </summary>
	public String logisticsCompanyNo;
	// / <summary>
	// / 快递公司名
	// / </summary>
	public String logisticsCompanyName;
	// / <summary>
	// / 物流公司运单号
	// / </summary>
	public String logisticsBillNo;
	// / <summary>
	// / 物流单号
	// / </summary>
	public String logisticsOrderNo;
	// / <summary>
	// / 发货状态，取值范围,waitsend(等待发货),alreadysend(已发货)
	// / </summary>
	public String status;
	// / <summary>
	// / 发货时间
	// / </summary>
	public String gmtSend;

	public long getLogisticsId() {
		return logisticsId;
	}

	public void setLogisticsId(long logisticsId) {
		this.logisticsId = logisticsId;
	}

	public String getFromContact() {
		return fromContact;
	}

	public void setFromContact(String fromContact) {
		this.fromContact = fromContact;
	}

	public String getFromMobile() {
		return fromMobile;
	}

	public void setFromMobile(String fromMobile) {
		this.fromMobile = fromMobile;
	}

	public String getFromPhone() {
		return fromPhone;
	}

	public void setFromPhone(String fromPhone) {
		this.fromPhone = fromPhone;
	}

	public String getFromProvince() {
		return fromProvince;
	}

	public void setFromProvince(String fromProvince) {
		this.fromProvince = fromProvince;
	}

	public String getFromCity() {
		return fromCity;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	public String getFromArea() {
		return fromArea;
	}

	public void setFromArea(String fromArea) {
		this.fromArea = fromArea;
	}

	public String getFromAddress() {
		return fromAddress;
	}

	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	public String getFromPost() {
		return fromPost;
	}

	public void setFromPost(String fromPost) {
		this.fromPost = fromPost;
	}

	public String getToContact() {
		return toContact;
	}

	public void setToContact(String toContact) {
		this.toContact = toContact;
	}

	public String getToMobile() {
		return toMobile;
	}

	public void setToMobile(String toMobile) {
		this.toMobile = toMobile;
	}

	public String getToPhone() {
		return toPhone;
	}

	public void setToPhone(String toPhone) {
		this.toPhone = toPhone;
	}

	public String getToProvince() {
		return toProvince;
	}

	public void setToProvince(String toProvince) {
		this.toProvince = toProvince;
	}

	public String getToCity() {
		return toCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}

	public String getToArea() {
		return toArea;
	}

	public void setToArea(String toArea) {
		this.toArea = toArea;
	}

	public String getToAddress() {
		return toAddress;
	}

	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}

	public String getToPost() {
		return toPost;
	}

	public void setToPost(String toPost) {
		this.toPost = toPost;
	}

	public String getLogisticsCompanyNo() {
		return logisticsCompanyNo;
	}

	public void setLogisticsCompanyNo(String logisticsCompanyNo) {
		this.logisticsCompanyNo = logisticsCompanyNo;
	}

	public String getLogisticsCompanyName() {
		return logisticsCompanyName;
	}

	public void setLogisticsCompanyName(String logisticsCompanyName) {
		this.logisticsCompanyName = logisticsCompanyName;
	}

	public String getLogisticsBillNo() {
		return logisticsBillNo;
	}

	public void setLogisticsBillNo(String logisticsBillNo) {
		this.logisticsBillNo = logisticsBillNo;
	}

	public String getLogisticsOrderNo() {
		return logisticsOrderNo;
	}

	public void setLogisticsOrderNo(String logisticsOrderNo) {
		this.logisticsOrderNo = logisticsOrderNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getGmtSend() {
		return gmtSend;
	}

	public void setGmtSend(String gmtSend) {
		this.gmtSend = gmtSend;
	}

}
