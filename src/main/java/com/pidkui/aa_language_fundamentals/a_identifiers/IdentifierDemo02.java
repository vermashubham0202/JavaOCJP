package com.pidkui.aa_language_fundamentals.a_identifiers;

/*
    While defining identifiers we need to follow some set of rules, to make them valid identifiers.

    Rules for defining Java identifiers:
    - we can use alphabets: a to z, A to Z
    - we can use numbers: 0 to 9
    - we can use $ and _
    These are the only allowed characters for Java identifiers.

    If you are going to use any other character for identifier, you will get compile time error.

    - Identifiers can't start with a digit.
 */

public class IdentifierDemo02 {
    public static void main(String[] args) {
        int total_number;   // valid identifier
//        int total#;     // invalid
        int total123;   // valid
//        int 123total;   // invalid
    }
}
