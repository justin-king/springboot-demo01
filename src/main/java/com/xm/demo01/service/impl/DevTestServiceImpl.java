package com.xm.demo01.service.impl;

import com.xm.demo01.service.TestService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class DevTestServiceImpl implements TestService {
    @Override
    public String toSend() {
        return "该接口为--dev--环境";
    }
}
