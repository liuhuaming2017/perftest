package com.service.perftestliuhuaming.controller;

import org.apache.servicecomb.serviceregistry.RegistryUtils;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class PerftestliuhuamingDelegate {
    Logger logger = LoggerFactory.getLogger(PerftestliuhuamingDelegate.class);
    public String helloworld(String name){
        // Do Some Magic Here!        
        //System.out.println("test");
        //logger.info("call PerftestliuhuamingDelegate");
        return RegistryUtils.getPublishAddress() + "-" + name;
    }
}
