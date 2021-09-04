package com.choudhury.codecoverage;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloTest {
    @Test
    public void testHello() throws Exception{
        Hello hello=new Hello();
        Assertions.assertEquals("Hello",hello.sayHello("en"));
    }
}
