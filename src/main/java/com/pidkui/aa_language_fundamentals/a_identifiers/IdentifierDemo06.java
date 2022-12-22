package com.pidkui.aa_language_fundamentals.a_identifiers;

/*
All pre-defined class name and interfaces name can be used as Java identifiers.

Even though it is valid, but it is not a good programming practice,
because it reduces readability and creates confusion.
 */

public class IdentifierDemo06 {
    public static void main(String[] args) {
        // String is pre-defined class name
        int String = 888;
        System.out.println(String);

        // Runnable is pre-defined interface name
        int Runnable = 999;
        System.out.println(Runnable);
    }
}
