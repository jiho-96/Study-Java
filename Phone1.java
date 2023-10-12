package com.mystudy.abstr;

public abstract class Phone1 {

    String owner;

    public Phone1(String owner) {
        this.owner = owner;
    }
    void trunOn() {
        System.out.println("폰 전원을 켭니다");
    }
    void trunOff() {
        System.out.println("폰 전원을 끕니다");
    }
}
