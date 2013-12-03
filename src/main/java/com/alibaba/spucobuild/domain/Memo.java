package com.alibaba.spucobuild.domain;

/// <summary>
/// 备忘
/// </summary>
public class Memo {
	// / <summary>
	// / 所属会员
	// / </summary>
	public String memberId;
	// / <summary>
	// / 备注内容
	// / </summary>
	public String remark;
	// / <summary>
	// / 备注标识，目前有4种，展示使用
	// / </summary>
	public String remarkIcon;

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemarkIcon() {
		return remarkIcon;
	}

	public void setRemarkIcon(String remarkIcon) {
		this.remarkIcon = remarkIcon;
	}

}
