package org.example.exceptionEx;

import java.io.IOException;

public class exceptionExample {

    public void foo() throws Exception, IOException {
        try {
            //standard code
        }catch (NullPointerException   e){
            //code for point where we take exception
        }finally {
            //final code this
        }
    }

    public static void foo2() {
        String str = "abc"; // Initializing a String with non-numeric characters
        try {
            int num = Integer.parseInt(str); // Attempting to parse a non-numeric string to an integer
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Error: Unable to parse the string as an integer.");
            // Additional error handling code can be added here
        }
    }
}
