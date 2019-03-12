package com.dolnikova;

import java.lang.reflect.Method;

//2. Создать класс с несколькими методами.
//        Вызвать метод по имени заданном как строка используя рефлексию

public class Main {

    public static void main(String[] args) {

        MyTestClass test = new MyTestClass(5);

        try {
            Method method = test.getClass().getDeclaredMethod("square");
            method.setAccessible(true);
            System.out.println(method.invoke(test));
            method.setAccessible(false);
        } catch (Exception e){
            System.out.println(" There is no method with this name. ");
        }

    }
}
