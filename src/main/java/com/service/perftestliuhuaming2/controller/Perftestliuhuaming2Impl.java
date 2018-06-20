package com.service.perftestliuhuaming2.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-06-20T07:41:41.803Z")

@RestSchema(schemaId = "perftestliuhuaming2")
@RequestMapping(path = "/perf-test-liuhuaming2", produces = MediaType.APPLICATION_JSON)
public class Perftestliuhuaming2Impl {

    @Autowired
    private Perftestliuhuaming2Delegate userPerftestliuhuaming2Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userPerftestliuhuaming2Delegate.helloworld(name);
    }

}
