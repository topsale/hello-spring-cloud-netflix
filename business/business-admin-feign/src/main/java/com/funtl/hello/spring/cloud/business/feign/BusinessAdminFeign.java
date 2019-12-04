package com.funtl.hello.spring.cloud.business.feign;

import com.funtl.hello.spring.cloud.business.feign.fallback.BusinessAdminFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "provider-admin", fallback = BusinessAdminFallback.class)
public interface BusinessAdminFeign {

    @GetMapping(value = "hi")
    String sayHi();

}
