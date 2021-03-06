package com.janus.myweb.sys.enums;

import com.janus.myapp.frame.core.enums.BaseEnum;

public enum EnumDictionaryType implements BaseEnum {
	DIR("目录"), DATA("数据");

	private String label;

	private EnumDictionaryType(String label) {
		this.label = label;
	}

	@Override
	public String getLabel() {
		return label;
	}
}
