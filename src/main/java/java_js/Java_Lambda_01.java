package java_js;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Java_Lambda_01 {
    public static void main(String[] args) {
        // Lambda Study -> 메서드릃 간단히 표현
        // 매개변수가 하나인 경우 괄로 생략이 가능 (타입이 없을 경우)
        // 블록 안의 문장이 하나뿐 일 떄, 괋호{} 생략가능 세미콜론 생략
        // 람다식은 익명 함수가 아니라 익명 객체이다.!
        // 람다식을 다루기 위한 참조변수가 필요하다. 참조변수의 타입은?? Obejct obj
        // 타입 obj = (a,b) -> a > b ? a : b
        // 익명객체 객체의 선언과 생성을 동시에...!  (a,b) -> a > b ? a : b

        /*
        (a,b) -> a > b ? a : b;
        (a,b) -> a > b ? a : b;
        (String name, int t) -> System.out.println("aa");
        (x) -> x * x;
        () -> Math.random()
        */

        // Object obj = (a,b) -> a > b ? a : b      //람다식. 익명객체
        /*// Object obj = new Object() {
            int max( int a, int b ) {
                return a > b ? a : b ;
            }
        };*/
        // int value = obj.max((3,5);                  // 함수형 인터페이스

        /*MyFunction f = new MyFunction() {
            public int max (int a, int b) {
                return a > b ? a : b;
            }
        };*/

        // 람다식을 다루기 위한 참조벼수의 타입은 함수형 인터페이스로 한다.
        MyFunction f = (a,b) -> a > b ? a : b;

        int value = f.max(3,5);
        System.out.println("value :::::::: " + value);

        // 함수형 인퍼에이스 example
        /*List<String> list = Arrays.asList("anc", "aaa", "bbb", "kakao", "hey");

        Collections.sort(list, new Comparator<String>() {
           public int compare(String s1, String s2) {
               return s2.compareTo(s1);
            }
        });*/

        //Collections.sort(list, (s1,s2 -> s2.compareTo(s1));



    }

    /*@FunctionalInterface
    interface Comparator<T> {
        int compare(T o1, T o2);
    }

    @FunctionalInterface
    interface MyFunction2 myMethod() {
        return () -> {};
    }*/

    //  함수형 인터페이스는 하나의 추상 메서드만 가져야 한다.
    @FunctionalInterface
    interface MyFunction {
        // public abstract int max(int a, int b);
        int max(int a, int b);
    }
}
