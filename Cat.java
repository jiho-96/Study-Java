package com.mystudy.ex01;

public class Cat extends Animal{
    //추상 메소드 재정의

    @Override
    public void sound() {
        System.out.println("야옹");
    }
}
