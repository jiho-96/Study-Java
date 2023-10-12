package com.mystudy.abstr;

public class PhoneExample1 {
    public static void main(String[] args) {
        SmartPhone1 smartPhone1 = new SmartPhone1("홍길동");

        smartPhone1.trunOn();
        smartPhone1.internetSearch();
        smartPhone1.trunOff();
    }
}
