package com.company;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
//        public static void main(String[] args) 의 단축키는 "psvm" +tab

        Scanner sc = new Scanner(System.in);
//        System.out.println("a의 값 입력");
        int a = sc.nextInt();
//        System.out.println("b의 값 입력");
        int b = sc.nextInt();
//   System.out.println() 단축키는  "sout" + tab
        //별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.
        //n과 m은 각각 1000 이하인 자연수입니다.

//        if (a <= 1000 & b <=1000) {
//            for (int i=1 ; i<=b ; i++ ){
//                for (int j=1 ; j<=a ; j++){
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//
//        } else {
//            System.out.println("1000 이하인 자연수를 입력해 주세요.");
//        }
//
//        System.out.println(a+b);


        StringBuilder sb = new StringBuilder();
        // StringBuilder = String 과 문자열을 더할 때 새로운 객체를 생성하는 것이 아니라 기존의 데이터를 더하는 방식 으로 사용  (속도가 빠르면 사앧적으로 부하가 적다)
        // 람다 표현식
        // IntStream.range (0부터 ~ a 까지 숫자 세기)  , 차례대로 방출되는 intenger마다 실행하면 되는 명령을 forEach로 정의할 수 있다
        IntStream.range(0, a).forEach(s -> sb.append("*"));
        IntStream.range(0, b).forEach(s -> System.out.println(sb.toString()));



    }
}



