package com.mystudy.abstr;

public class SmartPhone1 extends Phone1{
    SmartPhone1(String owner){
        super(owner);
    }

    void internetSearch(){
        System.out.println("인터넷 검색을 합니다");
    }
}
