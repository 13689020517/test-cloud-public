package com.test.service;

import com.test.util.R;
import org.springframework.stereotype.Component;

@Component //一定要加！！！！！！！！！！！
public class PowerfeignFallBack implements PowerFeignClient {
    @Override
    public Object getPower() {
        return R.error("power服务暂时不可用");
    }

    @Override
    public Object getPowerList() {
        return R.error("getPowerList暂时不可用");
    }
}
