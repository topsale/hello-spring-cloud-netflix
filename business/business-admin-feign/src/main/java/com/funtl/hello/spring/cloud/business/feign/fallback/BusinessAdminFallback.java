package com.funtl.hello.spring.cloud.business.feign.fallback;

import com.funtl.hello.spring.cloud.business.feign.BusinessAdminFeign;
import org.springframework.stereotype.Component;

@Component
public class BusinessAdminFallback implements BusinessAdminFeign {
    @Override
    public String sayHi() {
        return "请求失败了，请重试...";
    }
}
