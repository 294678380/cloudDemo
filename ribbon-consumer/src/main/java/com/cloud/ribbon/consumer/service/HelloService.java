package com.cloud.ribbon.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate; //注入resttemplate
    public String sayHello(){
        //通过rest调用 调用provider服务
        return restTemplate.getForObject("http://ribbon-provider/hello?name=zhangtaifeng",String.class);
    }
}
