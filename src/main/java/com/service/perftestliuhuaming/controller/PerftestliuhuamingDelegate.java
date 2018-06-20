package com.service.perftestliuhuaming.controller;

import org.apache.servicecomb.serviceregistry.RegistryUtils;
import org.springframework.stereotype.Component;


@Component
public class PerftestliuhuamingDelegate {

    public String helloworld(String name){
        // Do Some Magic Here!
        System.out.println("test");
        return RegistryUtils.getPublishAddress() + name;
    }
}
