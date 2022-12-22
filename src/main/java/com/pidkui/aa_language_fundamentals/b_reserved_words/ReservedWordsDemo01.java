package com.pidkui.aa_language_fundamentals.b_reserved_words;

/*
In Java there are some reserved words to represent some meaning-ful functionality.
In Java there are '53' reserved words.

In 53 reserved words:
                - 50 keywords are there
                            - 48 used keywords  (if, else, ....)
                            - 2 un-used keywords    (goto, const)
                - and 3 reserved literals   (true, false, null)

Difference b/w keywords and literals:
    If the reserved word is associated with functionality then it is called keyword,
    and if reserved word is only to represent some value then it is called literals.
 */

public class ReservedWordsDemo01 {
    public static void main(String[] args) {
        // all reserved literals should be in small letters
//        boolean b1 = TRUE;     // should be in small letters
        boolean b2 = true;

        // null is used only for default value for object reference, not for primitive
        Integer i = null;
//        int j = null;     // compile time error
    }
}
