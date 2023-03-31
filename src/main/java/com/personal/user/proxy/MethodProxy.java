package com.personal.user.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="service-method")
public interface MethodProxy {
    @GetMapping("/api-method/v1/methods")
    public String retrieveExchangeValue();
}