package com.xubin.kafka.test;

public class TestMain {
    public static void main(String[] args) {
        Test test=(x)->System.out.println(x);
        test.println("s");
    }
}
interface Test{
   void println(String str);
}
