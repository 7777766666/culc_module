package com.giper.ex;


public class ExceptionHandler extends RuntimeException {


    public static void handleException(Exception ex) {
        // Do something with the exception, such as logging it or sending an alert.
        System.err.println("!!!!Global exception handler: " + ex.getMessage());
    }





}
