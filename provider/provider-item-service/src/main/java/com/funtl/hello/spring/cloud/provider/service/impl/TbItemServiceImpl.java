package com.funtl.hello.spring.cloud.provider.service.impl;

import com.funtl.hello.spring.cloud.provider.domain.TbItem;
import com.funtl.hello.spring.cloud.provider.mapper.TbItemMapper;
import com.funtl.hello.spring.cloud.provider.service.TbItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TbItemServiceImpl implements TbItemService {

    @Resource
    private TbItemMapper tbItemMapper;
}
