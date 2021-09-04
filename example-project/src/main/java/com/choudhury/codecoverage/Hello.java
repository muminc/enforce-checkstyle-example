package com.choudhury.codecoverage;

//below unused import should trigger checkstyle to fail build

import java.util.ArrayList;

public class Hello {

    public Hello() {
        System.out.println("Constructor line covered");
    }

    // left brace on the next line should cause checkstyle to fail build
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

    // below code would normally cause checkstyle fail - MultipleVariableDeclarations
    // to stop checkstyle failing our build for this, we can add a SuppressWarnings like below choice of the
    @SuppressWarnings("MultipleVariableDeclarations")
    //@SuppressWarnings("checkstyle:MultipleVariableDeclarations")  // prefixing with checkstyle: will work too
    public void exampleOfSuppression(){
        String hello="hello", goodBye="good-bye";
        System.out.println(hello + " and "+goodBye);
    }
}
