package com.abolfazlsadeghian.NumericDemo;

import org.w3c.dom.ls.LSOutput;

public class NumeriCDemo {
    private byte b;
    private short s;
    private int i;
    private long l;
    private float f;
    private double d;

    public static void main(String[] args) {
        NumeriCDemo nd = new NumeriCDemo();

        nd.b=0b1100;
        System.out.println("Byte binary value : "+ nd.b);

        nd.i=42; //decimal case

        nd.i=045; //octal case - base 8
        System.out.println("Int Octal value: "+ nd.i);

        nd.i= 0xcafe ;
        System.out.println("Int hexadecimal value : "+ nd.i);

        nd.i = 0b10101010101010101010101010101011;
        System.out.println("Int binary value : "+ nd.i);

        nd.i= 0b1010_1010_1010_1010_1010_1010_1010_1011;
        System.out.println("Int binary value: "+ nd.i);

        nd.l = 1000_0001; // equivalent to 1000_000L
        System.out.println("Long value "+ nd.l);

        nd.f=5;
        System.out.println("Integer value assinged to a float variable : "+ nd.f);

        nd.f=2.5f; // equvalent to nd.f=2.5f
        System.out.println("Decimal value assigned to a float variable : "+ nd.f);

        nd.d = 2.5d;//equivalent to nd.d = 2.5d;
        System.out.println("Decimal value assigned to a double variable : "+ nd.f);
    }
}
