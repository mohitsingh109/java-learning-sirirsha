package com.javalearning.exceptions;

public class TestCheckedException {

    // App - f1() - f2() - f3() - f4()
    public static void f1() throws CustomCheckedException {
        f2();
    }

    public static void f2() throws CustomCheckedException {
        f3();
    }

    public static void f3() throws CustomCheckedException {
        f4();
    }

    public static void f4() throws CustomCheckedException {
        throw new CustomCheckedException("dummy");
    }

}
