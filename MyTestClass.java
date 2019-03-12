package com.dolnikova;

public class MyTestClass {

    private int num = 10;

    MyTestClass(int num){
        this.num = num;
    }

    private int square(){
        return (int)Math.pow(num, 2);
    }

    public String myStr(){
        String str = " num = " + this.num;
        return str;
    }
}
