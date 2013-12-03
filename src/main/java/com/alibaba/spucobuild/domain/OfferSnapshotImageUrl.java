package com.alibaba.spucobuild.domain;

/// <summary>
/// 产品图片/快照图片
/// </summary>
public class OfferSnapshotImageUrl {
	// / <summary>
	// / 大图图片：全路径
	// / </summary>
	public String imgUrl;
	// / <summary>
	// / 小图图片：全路径，目前动态生成小图规格：64x64
	// / </summary>
	public String midImgUrl;
	// / <summary>
	// / 中图图片：全路径，目前动态生成中图规格：150x150
	// / </summary>
	public String summImgUrl;
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getMidImgUrl() {
		return midImgUrl;
	}
	public void setMidImgUrl(String midImgUrl) {
		this.midImgUrl = midImgUrl;
	}
	public String getSummImgUrl() {
		return summImgUrl;
	}
	public void setSummImgUrl(String summImgUrl) {
		this.summImgUrl = summImgUrl;
	}

}
