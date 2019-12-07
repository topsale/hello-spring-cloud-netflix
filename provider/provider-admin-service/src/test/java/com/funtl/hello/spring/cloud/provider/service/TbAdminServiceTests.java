package com.funtl.hello.spring.cloud.provider.service;

import com.funtl.hello.spring.cloud.provider.domain.TbAdmin;
import com.funtl.hello.spring.cloud.provider.mapper.TbAdminMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@SpringBootTest
@Transactional
@Rollback
public class TbAdminServiceTests {

    @Resource
    private TbAdminMapper tbAdminMapper;

    @Test
    public void testInsert() {
        TbAdmin tbAdmin = new TbAdmin();
        tbAdmin.setId(6000001);
        tbAdmin.setName("test");
        tbAdmin.setShardingId(0);
        tbAdminMapper.insert(tbAdmin);
    }
}
