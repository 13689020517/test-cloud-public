package com.test.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "SERVER-POWER",fallback =PowerfeignFallBack.class )
public interface PowerFeignClient {

    @RequestMapping("/getPower.do")
    public Object getPower();


    @RequestMapping("/getPowerLiset.do")
    public Object getPowerList();
}
