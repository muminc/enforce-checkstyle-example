package com.choudhury.codecoverage;

import org.junit.Assert;
import org.junit.Test;

public class HelloTest {
    @Test
    public void testHello() throws Exception{
        Hello hello=new Hello();
        Assert.assertEquals("Hello",hello.sayHello("en"));
    }
}
