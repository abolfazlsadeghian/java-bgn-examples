package com.abolfazl.charlister;

public class CharLister {

    public static void main(String[] args) {
        for (int i = 0; i<65536; i++){
            char c = (char) i;
            System.out.println("c["+i+"]="+c);
        }
    }
}
