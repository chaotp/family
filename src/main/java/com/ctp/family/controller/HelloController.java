package com.ctp.family.controller;

import com.netflix.discovery.DiscoveryClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * ClassName:16338
 * package:com.ctp.family.controller
 * Description:TODO
 *
 * @date:2020/3/7 - 11:00
 * @Author:chaotianpeng
 */
@RequestMapping("/helloController")
public class HelloController {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private DiscoveryClient discoveryClient;
    @GetMapping("/hello")
    public String hello(){
        logger.info("----------family 8088----------");
        return "family 8080";
    }
}
