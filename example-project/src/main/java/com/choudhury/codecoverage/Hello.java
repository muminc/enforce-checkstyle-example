package com.choudhury.codecoverage;

import java.util.ArrayList;

public class Hello {

    public Hello() {
        System.out.println("Constructor line covered");
    }

    public String sayHello(final String lang)
    {
        System.out.println("sayHello called");
        String message;
        if (lang.equals("en")) {
            message = "Hello";
        } else {
            message = "Bonjour";
        }
        System.out.println(message);
        return message;
    }
}
