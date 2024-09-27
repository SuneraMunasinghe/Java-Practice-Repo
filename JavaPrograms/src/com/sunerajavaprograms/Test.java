package com.sunerajavaprograms;

public class Test {
	 // static variable
    static int a = m1();
     
    // static block
    static {
        System.out.println("Inside static block");
    }
     
    // static method
    static int m1() {
        System.out.println("from m1");
        return 20;
    }
}
