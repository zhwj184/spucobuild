package com.alibaba.spucobuild.domain;

public class OrderMap {
	// / <summary>
	// / 订单ID
	// / </summary>
	public long id;
	// / <summary>
	// / 支付宝交易号
	// / </summary>
	public String alipayTradeId;
	// / <summary>
	// / 卖家支付宝ID
	// / </summary>
	public String sellerAlipayId;
	// / <summary>
	// / 卖家公司名
	// / </summary>
	public String sellerCompanyName;
	// / <summary>
	// / 卖家会员登录名，即会员id
	// / </summary>
	public String sellerMemberId;
	// / <summary>
	// / 卖家电话
	// / </summary>
	public String sellerPhone;
	// / <summary>
	// / 卖家手机号
	// / </summary>
	public String sellerMobile;
	// / <summary>
	// / 卖家邮箱
	// / </summary>
	public String sellerEmail;
	// / <summary>
	// / 买家会员登录名，即会员id
	// / </summary>
	public String buyerMemberId;
	// / <summary>
	// / 买家公司名
	// / </summary>
	public String buyerCompanyName;
	// / <summary>
	// / 买家登录ID，旺旺id号，loginId 5-25
	// / </summary>
	public String buyerLoginId;
	// / <summary>
	// / 买家联系地址国家名称 64
	// / </summary>
	public String buyerComapnyAddressCountry;
	// / <summary>
	// / 买家联系地址省份名称 128
	// / </summary>
	public String buyerComapnyAddressProvince;
	// / <summary>
	// / 买家联系地址城市名称 128
	// / </summary>
	public String buyerComapnyAddressCity;
	// / <summary>
	// / 买家联系地址街道地址 256
	// / </summary>
	public String buyerComapnyAddressStreet;
	// / <summary>
	// / 买家公司注册地 128
	// / </summary>
	public String buyerFoundedPlace;
	// / <summary>
	// / 买家支付宝ID
	// / </summary>
	public String buyerAlipayId;
	// / <summary>
	// / 买家电话
	// / </summary>
	public String buyerPhone;
	// / <summary>
	// / 买家手机号
	// / </summary>
	public String buyerMobile;
	// / <summary>
	// / 买家email
	// / </summary>
	public String buyerEmail;
	// / <summary>
	// / 1：支付宝担保交易 4：即时到帐交易
	// / </summary>
	public int tradeType;
	// / <summary>
	// / 合法取值列举如下： 担保交易共有5个状态，分别是： waitbuyerpay waitsellersend waitbuyerreceive
	// success cancel 即时到账交易共有4个状态，分别是： waitbuyerpay waitsellersend success
	// cancel
	// / </summary>
	public String status;
	// / <summary>
	// / 买家下单时间，即订单创建时间
	// / </summary>
	public String gmtCreate;
	// / <summary>
	// / 买家付款时间
	// / </summary>
	public String gmtPayment;
	// / <summary>
	// / 卖家发货时间
	// / </summary>
	public String gmtGoodsSend;
	// / <summary>
	// / 交易完成时间
	// / </summary>
	public String gmtCompleted;
	// / <summary>
	// / 交易最后修改时间
	// / </summary>
	public String gmtModified;
	// / <summary>
	// / 产品总金额
	// / </summary>
	public long sumProductPayment;
	// / <summary>
	// / 运费
	// / </summary>
	public long carriage;
	// / <summary>
	// / 订单优惠金额
	// / </summary>
	public long discount;
	// / <summary>
	// / 订单付款总额
	// / </summary>
	public long sumPayment;
	// / <summary>
	// / 买家留言
	// / </summary>
	public String buyerFeedback;
	// / <summary>
	// / 退款金额，单位分
	// / </summary>
	public long refundPayment;
	// / <summary>
	// /
	// 退款状态，取值范围,waitselleragree(等待卖家同意),refundsuccess(退款成功),refundclose(退款关闭),waitbuyermodify(待买家修改),waitbuyersend(等待买家退货),waitsellerreceive(等待卖家确认收货)
	// / </summary>
	public String refundStatus;
	// / <summary>
	// / 订单关闭原因
	// / </summary>
	public String closeReason;
	// / <summary>
	// / 买家评价状态，取值范围,4(已评论),5(未评论),6(不需要评论)
	// / </summary>
	public int buyerRateStatus;
	// / <summary>
	// / 卖家评价状态，取值范围,4(已评论),5(未评论),6(不需要评论)
	// / </summary>
	public int sellerRateStatus;
	// / <summary>
	// / 子订单列表
	// / </summary>
	public OrderEntryList orderEntryList;

	// / <summary>
	// / 物流单列表
	// / </summary>
	public Logistics[] logisticsList;

	// / <summary>
	// / 发票
	// / </summary>
	public InvoiceModel invoiceModel;

	// / <summary>
	// / 买家备忘
	// / </summary>
	public Memo buyerMemo;

	// / <summary>
	// / 卖家备忘
	// / </summary>
	public Memo sellerMemo;
	// / <summary>
	// / 是否一次性付款
	// / </summary>
	public Boolean stepPayAll;
	// / <summary>
	// / 订单支付状态，取值范围：1(未付款),2(已付款),4(已退款),6(交易成功),8(交易未付款被关闭)
	// / </summary>
	public int payStatus;
	// / <summary>
	// / 订单物流状态，取值范围：1(未发货),2(已发货),3(已收货),4(已经退货),5(部分发货),8(还未创建物流订单)
	// / </summary>
	public int logisticsStatus;
	// / <summary>
	// / 分阶段协议地址URL
	// / </summary>
	public String stepAgreementPath;
	// / <summary>
	// / 分阶段付款列表
	// / </summary>
	public StepOrder[] stepOrderList;
	// / <summary>
	// / 交易的实付款
	// / </summary>
	public long codActualFeedCod;
	// / <summary>
	// / 是否COD订单并且清算成功
	// / </summary>
	public Boolean codAudit;
	// / <summary>
	// / 买家承担的服务费
	// / </summary>
	public long codBuyerFee;
	// / <summary>
	// / 买家承担的服务费初始值
	// / </summary>
	public long codBuyerInitFee;
	// / <summary>
	// / 服务费
	// / </summary>
	public long codFeecod;
	// / <summary>
	// / 三家分润
	// / </summary>
	public String codFeeDividendcod;
	// / <summary>
	// / 买家签收时间
	// / </summary>
	public String codGmtSign;
	// / <summary>
	// / cod服务费初始值
	// / </summary>
	public long codInitFee;
	// / <summary>
	// / 卖家承担的服务费
	// / </summary>
	public long codSellerFee;
	// / <summary>
	// /
	// COD物流状态，取值范围：0(初始值),20(接单),-20(不接单),2(接单超时),30(揽收成功),-30(揽收失败),3(揽收超时),100(签收成功),-100(签收失败),10(订单等候发送给物流公司),-1(用户取消物流订单)
	// / </summary>
	public int codStatus;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAlipayTradeId() {
		return alipayTradeId;
	}
	public void setAlipayTradeId(String alipayTradeId) {
		this.alipayTradeId = alipayTradeId;
	}
	public String getSellerAlipayId() {
		return sellerAlipayId;
	}
	public void setSellerAlipayId(String sellerAlipayId) {
		this.sellerAlipayId = sellerAlipayId;
	}
	public String getSellerCompanyName() {
		return sellerCompanyName;
	}
	public void setSellerCompanyName(String sellerCompanyName) {
		this.sellerCompanyName = sellerCompanyName;
	}
	public String getSellerMemberId() {
		return sellerMemberId;
	}
	public void setSellerMemberId(String sellerMemberId) {
		this.sellerMemberId = sellerMemberId;
	}
	public String getSellerPhone() {
		return sellerPhone;
	}
	public void setSellerPhone(String sellerPhone) {
		this.sellerPhone = sellerPhone;
	}
	public String getSellerMobile() {
		return sellerMobile;
	}
	public void setSellerMobile(String sellerMobile) {
		this.sellerMobile = sellerMobile;
	}
	public String getSellerEmail() {
		return sellerEmail;
	}
	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}
	public String getBuyerMemberId() {
		return buyerMemberId;
	}
	public void setBuyerMemberId(String buyerMemberId) {
		this.buyerMemberId = buyerMemberId;
	}
	public String getBuyerCompanyName() {
		return buyerCompanyName;
	}
	public void setBuyerCompanyName(String buyerCompanyName) {
		this.buyerCompanyName = buyerCompanyName;
	}
	public String getBuyerLoginId() {
		return buyerLoginId;
	}
	public void setBuyerLoginId(String buyerLoginId) {
		this.buyerLoginId = buyerLoginId;
	}
	public String getBuyerComapnyAddressCountry() {
		return buyerComapnyAddressCountry;
	}
	public void setBuyerComapnyAddressCountry(String buyerComapnyAddressCountry) {
		this.buyerComapnyAddressCountry = buyerComapnyAddressCountry;
	}
	public String getBuyerComapnyAddressProvince() {
		return buyerComapnyAddressProvince;
	}
	public void setBuyerComapnyAddressProvince(String buyerComapnyAddressProvince) {
		this.buyerComapnyAddressProvince = buyerComapnyAddressProvince;
	}
	public String getBuyerComapnyAddressCity() {
		return buyerComapnyAddressCity;
	}
	public void setBuyerComapnyAddressCity(String buyerComapnyAddressCity) {
		this.buyerComapnyAddressCity = buyerComapnyAddressCity;
	}
	public String getBuyerComapnyAddressStreet() {
		return buyerComapnyAddressStreet;
	}
	public void setBuyerComapnyAddressStreet(String buyerComapnyAddressStreet) {
		this.buyerComapnyAddressStreet = buyerComapnyAddressStreet;
	}
	public String getBuyerFoundedPlace() {
		return buyerFoundedPlace;
	}
	public void setBuyerFoundedPlace(String buyerFoundedPlace) {
		this.buyerFoundedPlace = buyerFoundedPlace;
	}
	public String getBuyerAlipayId() {
		return buyerAlipayId;
	}
	public void setBuyerAlipayId(String buyerAlipayId) {
		this.buyerAlipayId = buyerAlipayId;
	}
	public String getBuyerPhone() {
		return buyerPhone;
	}
	public void setBuyerPhone(String buyerPhone) {
		this.buyerPhone = buyerPhone;
	}
	public String getBuyerMobile() {
		return buyerMobile;
	}
	public void setBuyerMobile(String buyerMobile) {
		this.buyerMobile = buyerMobile;
	}
	public String getBuyerEmail() {
		return buyerEmail;
	}
	public void setBuyerEmail(String buyerEmail) {
		this.buyerEmail = buyerEmail;
	}
	public int getTradeType() {
		return tradeType;
	}
	public void setTradeType(int tradeType) {
		this.tradeType = tradeType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getGmtCreate() {
		return gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public String getGmtPayment() {
		return gmtPayment;
	}
	public void setGmtPayment(String gmtPayment) {
		this.gmtPayment = gmtPayment;
	}
	public String getGmtGoodsSend() {
		return gmtGoodsSend;
	}
	public void setGmtGoodsSend(String gmtGoodsSend) {
		this.gmtGoodsSend = gmtGoodsSend;
	}
	public String getGmtCompleted() {
		return gmtCompleted;
	}
	public void setGmtCompleted(String gmtCompleted) {
		this.gmtCompleted = gmtCompleted;
	}
	public String getGmtModified() {
		return gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}
	public long getSumProductPayment() {
		return sumProductPayment;
	}
	public void setSumProductPayment(long sumProductPayment) {
		this.sumProductPayment = sumProductPayment;
	}
	public long getCarriage() {
		return carriage;
	}
	public void setCarriage(long carriage) {
		this.carriage = carriage;
	}
	public long getDiscount() {
		return discount;
	}
	public void setDiscount(long discount) {
		this.discount = discount;
	}
	public long getSumPayment() {
		return sumPayment;
	}
	public void setSumPayment(long sumPayment) {
		this.sumPayment = sumPayment;
	}
	public String getBuyerFeedback() {
		return buyerFeedback;
	}
	public void setBuyerFeedback(String buyerFeedback) {
		this.buyerFeedback = buyerFeedback;
	}
	public long getRefundPayment() {
		return refundPayment;
	}
	public void setRefundPayment(long refundPayment) {
		this.refundPayment = refundPayment;
	}
	public String getRefundStatus() {
		return refundStatus;
	}
	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}
	public String getCloseReason() {
		return closeReason;
	}
	public void setCloseReason(String closeReason) {
		this.closeReason = closeReason;
	}
	public int getBuyerRateStatus() {
		return buyerRateStatus;
	}
	public void setBuyerRateStatus(int buyerRateStatus) {
		this.buyerRateStatus = buyerRateStatus;
	}
	public int getSellerRateStatus() {
		return sellerRateStatus;
	}
	public void setSellerRateStatus(int sellerRateStatus) {
		this.sellerRateStatus = sellerRateStatus;
	}
	public OrderEntryList getOrderEntryList() {
		return orderEntryList;
	}
	public void setOrderEntryList(OrderEntryList orderEntryList) {
		this.orderEntryList = orderEntryList;
	}
	public Logistics[] getLogisticsList() {
		return logisticsList;
	}
	public void setLogisticsList(Logistics[] logisticsList) {
		this.logisticsList = logisticsList;
	}
	public InvoiceModel getInvoiceModel() {
		return invoiceModel;
	}
	public void setInvoiceModel(InvoiceModel invoiceModel) {
		this.invoiceModel = invoiceModel;
	}
	public Memo getBuyerMemo() {
		return buyerMemo;
	}
	public void setBuyerMemo(Memo buyerMemo) {
		this.buyerMemo = buyerMemo;
	}
	public Memo getSellerMemo() {
		return sellerMemo;
	}
	public void setSellerMemo(Memo sellerMemo) {
		this.sellerMemo = sellerMemo;
	}
	public Boolean getStepPayAll() {
		return stepPayAll;
	}
	public void setStepPayAll(Boolean stepPayAll) {
		this.stepPayAll = stepPayAll;
	}
	public int getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(int payStatus) {
		this.payStatus = payStatus;
	}
	public int getLogisticsStatus() {
		return logisticsStatus;
	}
	public void setLogisticsStatus(int logisticsStatus) {
		this.logisticsStatus = logisticsStatus;
	}
	public String getStepAgreementPath() {
		return stepAgreementPath;
	}
	public void setStepAgreementPath(String stepAgreementPath) {
		this.stepAgreementPath = stepAgreementPath;
	}
	public StepOrder[] getStepOrderList() {
		return stepOrderList;
	}
	public void setStepOrderList(StepOrder[] stepOrderList) {
		this.stepOrderList = stepOrderList;
	}
	public long getCodActualFeedCod() {
		return codActualFeedCod;
	}
	public void setCodActualFeedCod(long codActualFeedCod) {
		this.codActualFeedCod = codActualFeedCod;
	}
	public Boolean getCodAudit() {
		return codAudit;
	}
	public void setCodAudit(Boolean codAudit) {
		this.codAudit = codAudit;
	}
	public long getCodBuyerFee() {
		return codBuyerFee;
	}
	public void setCodBuyerFee(long codBuyerFee) {
		this.codBuyerFee = codBuyerFee;
	}
	public long getCodBuyerInitFee() {
		return codBuyerInitFee;
	}
	public void setCodBuyerInitFee(long codBuyerInitFee) {
		this.codBuyerInitFee = codBuyerInitFee;
	}
	public long getCodFeecod() {
		return codFeecod;
	}
	public void setCodFeecod(long codFeecod) {
		this.codFeecod = codFeecod;
	}
	public String getCodFeeDividendcod() {
		return codFeeDividendcod;
	}
	public void setCodFeeDividendcod(String codFeeDividendcod) {
		this.codFeeDividendcod = codFeeDividendcod;
	}
	public String getCodGmtSign() {
		return codGmtSign;
	}
	public void setCodGmtSign(String codGmtSign) {
		this.codGmtSign = codGmtSign;
	}
	public long getCodInitFee() {
		return codInitFee;
	}
	public void setCodInitFee(long codInitFee) {
		this.codInitFee = codInitFee;
	}
	public long getCodSellerFee() {
		return codSellerFee;
	}
	public void setCodSellerFee(long codSellerFee) {
		this.codSellerFee = codSellerFee;
	}
	public int getCodStatus() {
		return codStatus;
	}
	public void setCodStatus(int codStatus) {
		this.codStatus = codStatus;
	}

}
