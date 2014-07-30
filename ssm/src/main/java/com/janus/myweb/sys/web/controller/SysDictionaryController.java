package com.janus.myweb.sys.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.janus.myapp.frame.core.service.BaseService;
import com.janus.myapp.frame.core.web.controller.impl.BaseControllerImpl;
import com.janus.myweb.sys.domain.SysDictionary;
import com.janus.myweb.sys.domain.query.SysDictionaryQuery;
import com.janus.myweb.sys.service.SysDictionaryService;

@Controller
@RequestMapping("/sys/dictionary")
public class SysDictionaryController extends BaseControllerImpl<SysDictionary, SysDictionaryQuery> {
	@Autowired
	private SysDictionaryService sysDictionaryService;

	@Override
	protected BaseService<SysDictionary> getBaseService() {
		return sysDictionaryService;
	}

}
