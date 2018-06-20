package com.service.perftestliuhuaming.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestPerftestliuhuaming {

        PerftestliuhuamingDelegate perftestliuhuamingDelegate = new PerftestliuhuamingDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = perftestliuhuamingDelegate.helloworld("hello");

        //assertEquals(expactReturnValue, returnValue);
    }

}
