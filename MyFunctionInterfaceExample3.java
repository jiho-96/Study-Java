// 리턴값이 있는 람다식

package org.study.com.ldb;

public class MyFunctionInterfaceExample3 {
    public static void main(String[] args) {
        MyFunctionInterface3 fi;
        fi = (x, y)->{
            int result = x+y;
            return result;
        };
        System.out.println(fi.method(2, 5));
        fi=(x,y) ->{return x+y;};
        System.out.println(fi.method(2, 5));
        fi=(x,y) -> x+y;
        System.out.println(fi.method(2, 5));
        fi=(x,y) -> sum(x, y);
        System.out.println(fi.method(2, 5));
    }
    public static int sum(int x, int y){
        return (x+y);
    }
}
