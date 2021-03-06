package com.janus.myweb.sys.enums;

import com.janus.myapp.frame.core.enums.BaseEnum;

public enum EnumStatus implements BaseEnum {
	ON("启用"), OFF("注销");

	private EnumStatus(String label) {
		this.label = label;
	}

	private String label;

	@Override
	public String getLabel() {
		return this.label;
	}

}
