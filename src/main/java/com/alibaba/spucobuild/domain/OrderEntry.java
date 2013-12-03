package com.alibaba.spucobuild.domain;

/// <summary>
/// 子订单信息
/// </summary>
public class OrderEntry {
	// / <summary>
	// / 订单明细编号
	// / </summary>
	public long id;
	// / <summary>
	// / 商品编号
	// / </summary>
	public long sourceId;
	// / <summary>
	// / 产品信息
	// / </summary>
	public OfferModel offerModel;
	// / <summary>
	// / 商品图片
	// / </summary>
	public String productPic;
	// / <summary>
	// / 商品名称
	// / </summary>
	public String productName;
	// / <summary>
	// / 订单明细单价，单位,分
	// / </summary>
	public long price;
	// / <summary>
	// / 商品数量
	// / </summary>
	public double quantity;
	// / <summary>
	// / 订单明细折扣
	// / </summary>
	public long entryDiscount;
	// / <summary>
	// / 订单明细状态，取值范围同订单status
	// / </summary>
	public String entryStatus;
	// / <summary>
	// / 订单明细货到付款状态，取值范围同订单codStatus
	// / </summary>
	public int entryCodStatus;
	// / <summary>
	// / 产品图片/快照图片
	// / </summary>
	public OfferSnapshotImageUrlList offerSnapshotImageUrlList;
	// / <summary>
	// / 退款单ID
	// / </summary>
	public long refundId;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getSourceId() {
		return sourceId;
	}
	public void setSourceId(long sourceId) {
		this.sourceId = sourceId;
	}
	public OfferModel getOfferModel() {
		return offerModel;
	}
	public void setOfferModel(OfferModel offerModel) {
		this.offerModel = offerModel;
	}
	public String getProductPic() {
		return productPic;
	}
	public void setProductPic(String productPic) {
		this.productPic = productPic;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public long getEntryDiscount() {
		return entryDiscount;
	}
	public void setEntryDiscount(long entryDiscount) {
		this.entryDiscount = entryDiscount;
	}
	public String getEntryStatus() {
		return entryStatus;
	}
	public void setEntryStatus(String entryStatus) {
		this.entryStatus = entryStatus;
	}
	public int getEntryCodStatus() {
		return entryCodStatus;
	}
	public void setEntryCodStatus(int entryCodStatus) {
		this.entryCodStatus = entryCodStatus;
	}
	public OfferSnapshotImageUrlList getOfferSnapshotImageUrlList() {
		return offerSnapshotImageUrlList;
	}
	public void setOfferSnapshotImageUrlList(
			OfferSnapshotImageUrlList offerSnapshotImageUrlList) {
		this.offerSnapshotImageUrlList = offerSnapshotImageUrlList;
	}
	public long getRefundId() {
		return refundId;
	}
	public void setRefundId(long refundId) {
		this.refundId = refundId;
	}

}
