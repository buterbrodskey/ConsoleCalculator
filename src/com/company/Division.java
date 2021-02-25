package com.company;

public class Division extends Operation {
    @Override
    public int execute(int a, int b) {
        if (b==0) {
            throw new RuntimeException("Division by zero");
        }
        return a/b;
    }
}
