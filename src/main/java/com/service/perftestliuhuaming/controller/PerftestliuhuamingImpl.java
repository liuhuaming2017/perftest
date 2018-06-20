package com.service.perftestliuhuaming.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-06-20T07:50:07.339Z")

@RestSchema(schemaId = "perftestliuhuaming")
@RequestMapping(path = "/perf-test-liuhuaming", produces = MediaType.APPLICATION_JSON)
public class PerftestliuhuamingImpl {

    @Autowired
    private PerftestliuhuamingDelegate userPerftestliuhuamingDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userPerftestliuhuamingDelegate.helloworld(name);
    }

}
