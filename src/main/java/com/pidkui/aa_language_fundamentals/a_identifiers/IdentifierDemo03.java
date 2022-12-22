package com.pidkui.aa_language_fundamentals.a_identifiers;

/*
Java identifiers are case sensitive.
Java language is a case sensitive programming language.
 */

public class IdentifierDemo03 {
    public static void main(String[] args) {

        // all are different
        // we can differentiate with respect to case
        int number = 10;
        int Number = 20;
        int NUMBER = 30;

        System.out.println("number: " + number);
        System.out.println("Number: " + Number);
        System.out.println("NUMBER: " + NUMBER);
    }
}
