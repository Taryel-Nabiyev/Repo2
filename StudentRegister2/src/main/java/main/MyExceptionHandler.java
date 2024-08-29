package main;

import java.lang.Thread.UncaughtExceptionHandler;

public class MyExceptionHandler implements UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("Uncaught Exception was caught!");
    }

}
