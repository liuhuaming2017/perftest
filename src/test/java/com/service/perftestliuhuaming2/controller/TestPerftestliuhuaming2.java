package com.service.perftestliuhuaming2.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestPerftestliuhuaming2 {

        Perftestliuhuaming2Delegate perftestliuhuaming2Delegate = new Perftestliuhuaming2Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = perftestliuhuaming2Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}