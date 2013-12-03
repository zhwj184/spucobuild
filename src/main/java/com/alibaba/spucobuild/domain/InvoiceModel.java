package com.alibaba.spucobuild.domain;

/// <summary>
/// 发票信息
/// </summary>
public class InvoiceModel {
	// / <summary>
	// / 发票主键
	// / </summary>
	public long invoiceId;
	// / <summary>
	// / 发票公司名称
	// / </summary>
	public String invoiceCompanyName;
	// / <summary>
	// / 纳税人识别号
	// / </summary>
	public String taxpayerIdentify;
	// / <summary>
	// / 公司开户行和帐号
	// / </summary>
	public String bankAndAccount;
	// / <summary>
	// / 发票收货地址
	// / </summary>
	public String receiveAddress;
	// / <summary>
	// / 发票收货人电话
	// / </summary>
	public String receivePhone;
	public long getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(long invoiceId) {
		this.invoiceId = invoiceId;
	}
	public String getInvoiceCompanyName() {
		return invoiceCompanyName;
	}
	public void setInvoiceCompanyName(String invoiceCompanyName) {
		this.invoiceCompanyName = invoiceCompanyName;
	}
	public String getTaxpayerIdentify() {
		return taxpayerIdentify;
	}
	public void setTaxpayerIdentify(String taxpayerIdentify) {
		this.taxpayerIdentify = taxpayerIdentify;
	}
	public String getBankAndAccount() {
		return bankAndAccount;
	}
	public void setBankAndAccount(String bankAndAccount) {
		this.bankAndAccount = bankAndAccount;
	}
	public String getReceiveAddress() {
		return receiveAddress;
	}
	public void setReceiveAddress(String receiveAddress) {
		this.receiveAddress = receiveAddress;
	}
	public String getReceivePhone() {
		return receivePhone;
	}
	public void setReceivePhone(String receivePhone) {
		this.receivePhone = receivePhone;
	}

}
