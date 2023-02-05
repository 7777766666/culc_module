package com.giper;


import com.giper.ex.CustomException;

import com.giper.ex.ExceptionHandler;
import com.giper.ex.LolException;

import static com.giper.ex.ExceptionHandler.handleException;
import static com.giper.logic.Culc.culc777;

public class Main {


    public static void main(String[] args) {

        int a = 28;
        int b = 200;

        try {
            System.out.println(culc777(a, b));
            if (a<b){
                throw new RuntimeException("Lol I would like do it!");
            }
        } catch (ArithmeticException ex) {
            handleException(ex);
        }
    }


}