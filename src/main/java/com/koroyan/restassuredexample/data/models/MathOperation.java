package com.koroyan.restassuredexample.data.models;

public class MathOperation {
    private final int arg1;
    private final int arg2;



    public MathOperation(int arg1, int arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
    }


    public int addResult(){
        return arg1+arg2;
    }

    public int divideResult(){
        return arg1/arg2;
    }

    public int getArg1() {
        return arg1;
    }

    public int getArg2() {
        return arg2;
    }


}
