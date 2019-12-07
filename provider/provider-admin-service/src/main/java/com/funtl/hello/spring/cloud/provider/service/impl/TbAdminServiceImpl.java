package com.funtl.hello.spring.cloud.provider.service.impl;

import com.funtl.hello.spring.cloud.provider.mapper.TbAdminMapper;
import com.funtl.hello.spring.cloud.provider.service.TbAdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TbAdminServiceImpl implements TbAdminService {

    @Resource
    private TbAdminMapper tbAdminMapper;

}
