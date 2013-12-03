package com.alibaba.spucobuild.domain;

import java.util.Map;

public class OfferModel {
	// / <summary>
	// / 商品ID
	// / </summary>
	public long offerId;
	// / <summary>
	// / 是否为私密offer的标志位。true：私密产品 false：普通产品
	// / </summary>
	public Boolean isPrivate;
	// / <summary>
	// / 私密属性列举。该字段列举此产品里面的所有私密字段。描述格式如下：私密字段1：私密字段2：私密字段n（‘:’为属性分隔符）
	// 比如此产品的价格跟图片为私密，则privateProperties值为price:image
	// / </summary>
	public String privateProperties;
	// / <summary>
	// / 商品详情地址
	// / </summary>
	public String detailsUrl;
	// / <summary>
	// / 商品类型。Sale：供应信息，Buy：求购信息
	// / </summary>
	public String type;
	// / <summary>
	// / 贸易类型。1：产品，2：加工，3：代理，4：合作，5：商务服务
	// / </summary>
	public String tradeType;
	// / <summary>
	// / 所属叶子类目ID
	// / </summary>
	public int postCategryId;
	// / <summary>
	// / 状态。auditing：审核中；online：已上网；FailAudited：审核未通过；outdated：已过期；member
	// delete(d)：用户删除；delete：审核删除
	// / </summary>
	public String offerStatus;
	// / <summary>
	// / 卖家会员ID
	// / </summary>
	public String memberId;
	// / <summary>
	// / 商品标题
	// / </summary>
	public String subject;
	// / <summary>
	// / 详情说明
	// / </summary>
	public String details;
	// / <summary>
	// / 商品信息质量星级( 取值为1到5)。1：一星；2：二星；3：三星；4：四星；5：五星
	// / </summary>
	public String qualityLevel;

	// / <summary>
	// / 商品图片列表
	// / </summary>
	public ImageList imageList;

	// / <summary>
	// / 商品属性信息
	// / </summary>
	public ProductFeatureList productFeatureList;

	// / <summary>
	// / 是否支持网上交易。true：支持网上订购；false：不支持网上订购
	// / </summary>
	public Boolean isOfferSupportOnlineTrade;
	// / <summary>
	// / 支持的交易方式。当isOfferSupportOnlineTrade为true的时候本字段有效：Escrow:支付宝担保交易；
	// PreCharge：支付宝预存款交易；ForexPay：支付宝境外支付交易；多种交易方式间通过;分隔。
	// / </summary>
	public String tradingType;
	// / <summary>
	// / 是否支持混批。true：支持混批；false：不支持混批
	// / </summary>
	public Boolean isSupportMix;
	// / <summary>
	// / 计量单位
	// / </summary>
	public String unit;
	// / <summary>
	// / 交易币种
	// / </summary>
	public String priceUnit;
	// / <summary>
	// / 供货量
	// / </summary>
	public int amount;
	// / <summary>
	// / 可售数量
	// / </summary>
	public int amountOnSale;
	// / <summary>
	// / 已销售量
	// / </summary>
	public int saledCount;
	// / <summary>
	// / 建议零售价
	// / </summary>
	public double retailPrice;
	// / <summary>
	// / 单价
	// / </summary>
	public double unitPrice;
	// / <summary>
	// / 价格区间
	// / </summary>
	public PriceRangeList priceRangeList;
	// / <summary>
	// / 有效期(单位：天)
	// / </summary>
	public int termOfferProcess;
	// / <summary>
	// / 物流模板id
	// / </summary>
	public int freightTemplateId;
	// / <summary>
	// / 发货地址id
	// / </summary>
	public int sendGoodsId;
	// / <summary>
	// / 单位重量
	// / </summary>
	public int productUnitWeight;
	// / <summary>
	// / T:运费模板 D：运费说明 F：卖家承担运费
	// / </summary>
	public int freightType;
	// / <summary>
	// / 是否为SKU商品
	// / </summary>
	public Boolean isSkuOffer;
	// / <summary>
	// / 是否支持按照规格报价
	// / </summary>
	public Boolean isSkuTradeSupported;
	// / <summary>
	// / SKU规格属性信息{fid:value}当有多个值时用"#"联接
	// / </summary>
	public Map<Object, Object> skuArray;
	// / <summary>
	// / 创建日期
	// / </summary>
	public String gmtCreate;
	// / <summary>
	// / 最近修改时间
	// / </summary>
	public String gmtModified;
	// / <summary>
	// / 最近重发时间
	// / </summary>
	public String gmtLastRepost;
	// / <summary>
	// / 审核通过时间
	// / </summary>
	public String gmtApproved;
	// / <summary>
	// / 过期日期
	// / </summary>
	public String gmtExpire;
	public long getOfferId() {
		return offerId;
	}
	public void setOfferId(long offerId) {
		this.offerId = offerId;
	}
	public Boolean getIsPrivate() {
		return isPrivate;
	}
	public void setIsPrivate(Boolean isPrivate) {
		this.isPrivate = isPrivate;
	}
	public String getPrivateProperties() {
		return privateProperties;
	}
	public void setPrivateProperties(String privateProperties) {
		this.privateProperties = privateProperties;
	}
	public String getDetailsUrl() {
		return detailsUrl;
	}
	public void setDetailsUrl(String detailsUrl) {
		this.detailsUrl = detailsUrl;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTradeType() {
		return tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}
	public int getPostCategryId() {
		return postCategryId;
	}
	public void setPostCategryId(int postCategryId) {
		this.postCategryId = postCategryId;
	}
	public String getOfferStatus() {
		return offerStatus;
	}
	public void setOfferStatus(String offerStatus) {
		this.offerStatus = offerStatus;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getQualityLevel() {
		return qualityLevel;
	}
	public void setQualityLevel(String qualityLevel) {
		this.qualityLevel = qualityLevel;
	}
	public ImageList getImageList() {
		return imageList;
	}
	public void setImageList(ImageList imageList) {
		this.imageList = imageList;
	}
	public ProductFeatureList getProductFeatureList() {
		return productFeatureList;
	}
	public void setProductFeatureList(ProductFeatureList productFeatureList) {
		this.productFeatureList = productFeatureList;
	}
	public Boolean getIsOfferSupportOnlineTrade() {
		return isOfferSupportOnlineTrade;
	}
	public void setIsOfferSupportOnlineTrade(Boolean isOfferSupportOnlineTrade) {
		this.isOfferSupportOnlineTrade = isOfferSupportOnlineTrade;
	}
	public String getTradingType() {
		return tradingType;
	}
	public void setTradingType(String tradingType) {
		this.tradingType = tradingType;
	}
	public Boolean getIsSupportMix() {
		return isSupportMix;
	}
	public void setIsSupportMix(Boolean isSupportMix) {
		this.isSupportMix = isSupportMix;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getPriceUnit() {
		return priceUnit;
	}
	public void setPriceUnit(String priceUnit) {
		this.priceUnit = priceUnit;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getAmountOnSale() {
		return amountOnSale;
	}
	public void setAmountOnSale(int amountOnSale) {
		this.amountOnSale = amountOnSale;
	}
	public int getSaledCount() {
		return saledCount;
	}
	public void setSaledCount(int saledCount) {
		this.saledCount = saledCount;
	}
	public double getRetailPrice() {
		return retailPrice;
	}
	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public PriceRangeList getPriceRangeList() {
		return priceRangeList;
	}
	public void setPriceRangeList(PriceRangeList priceRangeList) {
		this.priceRangeList = priceRangeList;
	}
	public int getTermOfferProcess() {
		return termOfferProcess;
	}
	public void setTermOfferProcess(int termOfferProcess) {
		this.termOfferProcess = termOfferProcess;
	}
	public int getFreightTemplateId() {
		return freightTemplateId;
	}
	public void setFreightTemplateId(int freightTemplateId) {
		this.freightTemplateId = freightTemplateId;
	}
	public int getSendGoodsId() {
		return sendGoodsId;
	}
	public void setSendGoodsId(int sendGoodsId) {
		this.sendGoodsId = sendGoodsId;
	}
	public int getProductUnitWeight() {
		return productUnitWeight;
	}
	public void setProductUnitWeight(int productUnitWeight) {
		this.productUnitWeight = productUnitWeight;
	}
	public int getFreightType() {
		return freightType;
	}
	public void setFreightType(int freightType) {
		this.freightType = freightType;
	}
	public Boolean getIsSkuOffer() {
		return isSkuOffer;
	}
	public void setIsSkuOffer(Boolean isSkuOffer) {
		this.isSkuOffer = isSkuOffer;
	}
	public Boolean getIsSkuTradeSupported() {
		return isSkuTradeSupported;
	}
	public void setIsSkuTradeSupported(Boolean isSkuTradeSupported) {
		this.isSkuTradeSupported = isSkuTradeSupported;
	}
	public Map<Object, Object> getSkuArray() {
		return skuArray;
	}
	public void setSkuArray(Map<Object, Object> skuArray) {
		this.skuArray = skuArray;
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
	public String getGmtLastRepost() {
		return gmtLastRepost;
	}
	public void setGmtLastRepost(String gmtLastRepost) {
		this.gmtLastRepost = gmtLastRepost;
	}
	public String getGmtApproved() {
		return gmtApproved;
	}
	public void setGmtApproved(String gmtApproved) {
		this.gmtApproved = gmtApproved;
	}
	public String getGmtExpire() {
		return gmtExpire;
	}
	public void setGmtExpire(String gmtExpire) {
		this.gmtExpire = gmtExpire;
	}

}
