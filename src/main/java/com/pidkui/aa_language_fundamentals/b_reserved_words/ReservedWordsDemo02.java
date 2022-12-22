package com.pidkui.aa_language_fundamentals.b_reserved_words;

/*
=> Keywords for data types:
    - For data type there are 8 keywords:
        byte
        short
        int
        long
        float
        double
        boolean
        char

=> Keywords for flow control:
    - There are 11 keywords:
        if
        else
        switch
        case
        default
        while
        do
        for
        break
        continue
        return

=> Keywords for modifiers:
    - There are 11 modifiers keywords, but in total we have 12 modifiers:
    (because we don't write anything for 'default'. Eg. If we want to make a class default we don't write anything before its name.)
        public
        private
        protected
        static
        final
        abstract
        synchronized
        native
        strictfp        (from Java 1.2)
        transient
        volatile

=> Keywords for Exception handling:
    - There are 6 keywords:
        try
        catch
        finally
        throw
        throws
        assert      (from Java 1.4)

=> Class related keywords:
    - There are 6 keywords:
        class
        interface
        extends
        implements
        package
        import

=> Object related keywords:
    - There are 4 keywords:
        new
        instanceof
        super
        this

*******************************************************************************************
Note:
    'delete' keyword is not there in Java,
    because destruction of useless object is the responsibility of Garbage Collector (GC).
    So, we have only 'new' keyword in Java.
*******************************************************************************************

=> Return type keyword:
    - There is only 1 keyword:
        void

*********************************************************************************************
Note:
    In java return type of method is mandatory, otherwise you will get compile time error.
    In C method return type is optional, by default method return type is 'int' in C.


    public method1() {
        // valid in C
        // not valid in Java
    }
*********************************************************************************************

=> Unused keywords:
    - There are 2 unused keywords:
        goto
        const

(If you will try to use these keyword in Java, you will get compile time error.)

********************************************************************
Note:
    goto:
        'goto' keyword is in C language,
        but this keyword creates several problem in old languages.
        So, it is banned in Java.

    const:
        To define constant already 'final' keyword is there.

********************************************************************

=> Reserved literals:
    - There are 3 reserved literals:
        true        (for boolean)
        false       (for boolean)
        null        (default value for object reference)

=> enum keyword:
        enum    (from Java 1.5)

(We can use enum to define a group of named constants.)

 */

enum Month {
    JAN, FEB, MAR
}

public class ReservedWordsDemo02 {
}
