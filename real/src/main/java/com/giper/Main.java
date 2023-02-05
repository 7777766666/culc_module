package com.giper;


import com.giper.ex.CustomException;

import com.giper.ex.ExceptionHandler;

import static com.giper.ex.ExceptionHandler.handleException;
import static com.giper.logic.Culc.culc777;

public class Main {


    public static void main(String[] args) {

        int a = 28;
        int b = 0;

        try {
            System.out.println(culc777(a, b));
            if (a<b){
                throw new RuntimeException("Дятел");
            }
        } catch (ArithmeticException ex) {
            handleException(ex);
        }
    }


}