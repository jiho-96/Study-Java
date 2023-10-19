//매개변수와 리턴값이 없는 람다식

package org.study.com.ldb;

public class MyFunctionInterfaceExample1 {
    public static void main(String[] args) {
        MyFunctionInterface1 fi;
        fi = () ->{
            String str = "method call";
            System.out.println(str);
        };
        fi.method();
        fi=()->{
            System.out.println("method call2");};
        fi=()-> System.out.println("method call3");
        fi.method();
    }
}
