// 매개변수가 있는 람다식

package org.study.com.ldb;

public class MyFunctionInterfaceExample2 {
    public static void main(String[] args) {
        MyFunctionInterface2 fi;
        fi = (x) -> {
            int result = x*5;
            System.out.println(result);
        };
        fi.method(2);
        fi = (x) ->{
            System.out.println(x*5);};
        fi = x -> System.out.println(x*5);
        fi.method(2);
    }
}
