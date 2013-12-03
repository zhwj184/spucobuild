package com.alibaba.spucobuild.domain;

public class FeatureInfo {
	// / <summary>
	// / 属性ID。版本1不支持返回属性ID
	// / </summary>
	public int fid;

	// / <summary>
	// / 属性名称
	// / </summary>
	public String name;

	// / <summary>
	// / 属性值单位
	// / </summary>
	public String unit;

	// / <summary>
	// / 属性值
	// / </summary>
	public String value;

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}