package casting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> myNums = new ArrayList<>();

//        widening: done automatically by the compiler
        int myNumber = 100;

        long myLongNumber = myNumber;


//        narrowing

        int firstNumber = 130;

        byte myByteNumber = (byte)firstNumber;

        System.out.println(myByteNumber);


//      OLD WAY:
////        boxing
//        Integer firstNumberObj = Integer.valueOf(firstNumber);
////        unboxing
//        int unboxedNum = firstNumberObj.intValue();


//    NEW WAYL:
//        autoboxing
        Integer firstNumberObj = firstNumber;
//        unboxing
        int unboxedNum = firstNumberObj;

//        turns string into number
        int myNum = Integer.parseInt("123");
        double doubleNum = Double.parseDouble("123");
        System.out.println(myNum);
        System.out.println(doubleNum);

//      turns number into a string

        String convertedNumber = Integer.toString(123);

        System.out.println(convertedNumber.getClass());

        System.out.println(Double.MIN_VALUE);

        Integer a = 10;
        Integer b = 20;

        System.out.println(b.compareTo(b));

        Integer[] myArr = new Integer[5];

        System.out.println(Arrays.toString(myArr));


        Object myObj = new Object();
        me((List<String>) myObj);


    }

    public static void me(List<String> s){

    }
}
