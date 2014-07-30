package com.janus.myweb.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.janus.myapp.frame.core.dao.BaseDao;
import com.janus.myapp.frame.core.service.impl.BaseServiceImpl;
import com.janus.myweb.sys.dao.SysDictionaryDao;
import com.janus.myweb.sys.domain.SysDictionary;
import com.janus.myweb.sys.service.SysDictionaryService;

@Service
public class SysDictionaryServiceImpl extends BaseServiceImpl<SysDictionary>
        implements SysDictionaryService {

    @Autowired
    private SysDictionaryDao sysDictionaryDao;

    @Override
    protected BaseDao<SysDictionary> getBaseDao() {
        return sysDictionaryDao;
    }

}