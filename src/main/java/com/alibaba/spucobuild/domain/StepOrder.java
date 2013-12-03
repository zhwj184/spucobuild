package com.alibaba.spucobuild.domain;

/// <summary>
/// 分阶段付款信息
/// </summary>
public class StepOrder {
	// / <summary>
	// / 阶段id
	// / </summary>
	public long stepOrderId;
	// / <summary>
	// /
	// 阶段状态，取值范围：waitactivate(未开始),waitsellerpush(等待卖家推进),success(本阶段完成),cancel(本阶段终止),inactiveandcancel(本阶段未开始便终止),waitbuyerpay(等待买家付款),waitsellersend(等待卖家发货),waitbuyerreceive(等待买家确认收货),waitselleract(等待卖家操作),waitbuyerconfirmaction(等待买家确认操作)
	// / </summary>
	public String stepOrderStatus;
	// / <summary>
	// / 支付状态，取值范围,1(未付款),2(已付款),4(已退款),6(交易成功),8(交易未付款被关闭)
	// / </summary>
	public int stepPayStatus;
	// / <summary>
	// / 阶段序列
	// / </summary>
	public long stepNo;
	// / <summary>
	// / 是否最后一个阶段
	// / </summary>
	public Boolean lastStep;
	// / <summary>
	// / 是否已打款给卖家
	// / </summary>
	public Boolean hasDisbursed;
	// / <summary>
	// / 创建时需要付款的金额，不含运费
	// / </summary>
	public long payFee;
	// / <summary>
	// / 应付款（含运费）
	// / </summary>
	public long actualPayFee;
	// / <summary>
	// / 本阶段分摊的店铺优惠
	// / </summary>
	public long discountFee;
	// / <summary>
	// / 本阶段分摊的单品优惠
	// / </summary>
	public long itemDiscountFee;
	// / <summary>
	// / 本阶段分摊的单价
	// / </summary>
	public long price;
	// / <summary>
	// / 购买数量
	// / </summary>
	public long amount;
	// / <summary>
	// / 运费
	// / </summary>
	public long postFee;
	// / <summary>
	// / 修改价格修改的金额
	// / </summary>
	public long adjustFee;
	// / <summary>
	// / 创建时间
	// / </summary>
	public String gmtCreate;
	// / <summary>
	// / 修改时间
	// / </summary>
	public String gmtModified;
	// / <summary>
	// / 开始时间
	// / </summary>
	public String enterTime;
	// / <summary>
	// / 付款时间
	// / </summary>
	public String payTime;
	// / <summary>
	// / 卖家操作时间
	// / </summary>
	public String sellerActionTime;
	// / <summary>
	// / 本阶段结束时间
	// / </summary>
	public String endTime;
	// / <summary>
	// / 卖家操作留言路径
	// / </summary>
	public String messagePath;
	// / <summary>
	// / 卖家上传图片凭据路径
	// / </summary>
	public String picturePath;
	// / <summary>
	// / 卖家操作留言
	// / </summary>
	public String message;
	// / <summary>
	// / 使用的模板id
	// / </summary>
	public long templateId;
	// / <summary>
	// / 当前步骤的名称
	// / </summary>
	public String stepName;
	// / <summary>
	// / 卖家操作名称
	// / </summary>
	public String sellerActionName;
	// / <summary>
	// / 买家不付款的超时时间(秒)
	// / </summary>
	public long buyerPayTimeout;
	// / <summary>
	// / 买家不确认的超时时间
	// / </summary>
	public long buyerConfirmTimeout;
	// / <summary>
	// / 是否需要物流
	// / </summary>
	public Boolean needLogistics;
	// / <summary>
	// / 是否需要卖家操作和买家确认
	// / </summary>
	public Boolean needSellerAction;
	// / <summary>
	// / 阶段结束是否打款
	// / </summary>
	public Boolean transferAfterConfirm;
	// / <summary>
	// / 是否需要卖家推进
	// / </summary>
	public Boolean needSellerCallNext;
	// / <summary>
	// / 是否允许即时到帐
	// / </summary>
	public Boolean instantPay;
	public long getStepOrderId() {
		return stepOrderId;
	}
	public void setStepOrderId(long stepOrderId) {
		this.stepOrderId = stepOrderId;
	}
	public String getStepOrderStatus() {
		return stepOrderStatus;
	}
	public void setStepOrderStatus(String stepOrderStatus) {
		this.stepOrderStatus = stepOrderStatus;
	}
	public int getStepPayStatus() {
		return stepPayStatus;
	}
	public void setStepPayStatus(int stepPayStatus) {
		this.stepPayStatus = stepPayStatus;
	}
	public long getStepNo() {
		return stepNo;
	}
	public void setStepNo(long stepNo) {
		this.stepNo = stepNo;
	}
	public Boolean getLastStep() {
		return lastStep;
	}
	public void setLastStep(Boolean lastStep) {
		this.lastStep = lastStep;
	}
	public Boolean getHasDisbursed() {
		return hasDisbursed;
	}
	public void setHasDisbursed(Boolean hasDisbursed) {
		this.hasDisbursed = hasDisbursed;
	}
	public long getPayFee() {
		return payFee;
	}
	public void setPayFee(long payFee) {
		this.payFee = payFee;
	}
	public long getActualPayFee() {
		return actualPayFee;
	}
	public void setActualPayFee(long actualPayFee) {
		this.actualPayFee = actualPayFee;
	}
	public long getDiscountFee() {
		return discountFee;
	}
	public void setDiscountFee(long discountFee) {
		this.discountFee = discountFee;
	}
	public long getItemDiscountFee() {
		return itemDiscountFee;
	}
	public void setItemDiscountFee(long itemDiscountFee) {
		this.itemDiscountFee = itemDiscountFee;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public long getPostFee() {
		return postFee;
	}
	public void setPostFee(long postFee) {
		this.postFee = postFee;
	}
	public long getAdjustFee() {
		return adjustFee;
	}
	public void setAdjustFee(long adjustFee) {
		this.adjustFee = adjustFee;
	}
	public String getGmtCreate() {
		return gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public String getGmtModified() {
		return gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}
	public String getEnterTime() {
		return enterTime;
	}
	public void setEnterTime(String enterTime) {
		this.enterTime = enterTime;
	}
	public String getPayTime() {
		return payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}
	public String getSellerActionTime() {
		return sellerActionTime;
	}
	public void setSellerActionTime(String sellerActionTime) {
		this.sellerActionTime = sellerActionTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getMessagePath() {
		return messagePath;
	}
	public void setMessagePath(String messagePath) {
		this.messagePath = messagePath;
	}
	public String getPicturePath() {
		return picturePath;
	}
	public void setPicturePath(String picturePath) {
		this.picturePath = picturePath;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public long getTemplateId() {
		return templateId;
	}
	public void setTemplateId(long templateId) {
		this.templateId = templateId;
	}
	public String getStepName() {
		return stepName;
	}
	public void setStepName(String stepName) {
		this.stepName = stepName;
	}
	public String getSellerActionName() {
		return sellerActionName;
	}
	public void setSellerActionName(String sellerActionName) {
		this.sellerActionName = sellerActionName;
	}
	public long getBuyerPayTimeout() {
		return buyerPayTimeout;
	}
	public void setBuyerPayTimeout(long buyerPayTimeout) {
		this.buyerPayTimeout = buyerPayTimeout;
	}
	public long getBuyerConfirmTimeout() {
		return buyerConfirmTimeout;
	}
	public void setBuyerConfirmTimeout(long buyerConfirmTimeout) {
		this.buyerConfirmTimeout = buyerConfirmTimeout;
	}
	public Boolean getNeedLogistics() {
		return needLogistics;
	}
	public void setNeedLogistics(Boolean needLogistics) {
		this.needLogistics = needLogistics;
	}
	public Boolean getNeedSellerAction() {
		return needSellerAction;
	}
	public void setNeedSellerAction(Boolean needSellerAction) {
		this.needSellerAction = needSellerAction;
	}
	public Boolean getTransferAfterConfirm() {
		return transferAfterConfirm;
	}
	public void setTransferAfterConfirm(Boolean transferAfterConfirm) {
		this.transferAfterConfirm = transferAfterConfirm;
	}
	public Boolean getNeedSellerCallNext() {
		return needSellerCallNext;
	}
	public void setNeedSellerCallNext(Boolean needSellerCallNext) {
		this.needSellerCallNext = needSellerCallNext;
	}
	public Boolean getInstantPay() {
		return instantPay;
	}
	public void setInstantPay(Boolean instantPay) {
		this.instantPay = instantPay;
	}

}
