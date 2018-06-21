package com.service.perftestliuhuaming.controller;

import org.apache.servicecomb.serviceregistry.RegistryUtils;
import org.springframework.stereotype.Component;
import org.slf4j.LoggerFactory;
import org.slf4j.LoggerFactory;

@Component
public class PerftestliuhuamingDelegate {

    public String helloworld(String name){
        // Do Some Magic Here!
        Logger logger = LoggerFactory.getLogger(PerftestliuhuamingDelegate.class);
        System.out.println("test");
        logger.info(RegistryUtils.getPublishAddress());
        return RegistryUtils.getPublishAddress() + "-" + name;
    }
}
