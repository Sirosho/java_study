package chapter1_2.array;

import java.util.Arrays; //Arrays 사용할때 필요함 자동완성시 생김

public class ArrayBasic {
    public static void main(String[] args) {


        // java에서 변수를 저장하는 메모리 영역(stack)은 매우 작음
        // 따라서 배열의 데이터는 stack이 아닌 heap 이라는 영역에 저장하고 배열에는 그 값의 주소만 저장

        // 배열의 특징
        // 배열 : 1. 동종모음 구조 (같은 타입끼리만 저장 가능)
        //        2. 생성시의 크기가 불변함 (값을 안넣으면 기본값 초기화)


        // Java에서의 배열작동
        // 1. 배열 변수를 선언
        // java 스타일 배연선언 데이터형 옆에 대괄호
        int[] numbers; // 4byte (X)
        //2. 배열을 생성 (힙에 데이터를 저장)

        numbers = new int[5];
        // 3. 배열을 초기화 (값 저장)
        numbers[0] = 50;
        numbers[1] = 77;
        numbers[2] = (int) 66.7;
        numbers[3] = numbers[0] * 2;
        numbers[4] = 99;
//        numbers[5] = 999; 배열의 랭스보다 큼 런타임에러!


//        System.out.println(numbers); //배열의 16진수 주소가 찍힘
        System.out.println(Arrays.toString(numbers));
        // 배열 길이 확인
        System.out.println(numbers.length);


        // 배열 순회

        System.out.println("=========================");


        for (int i = 0; i < numbers.length; i++) {
            System.out.println("데이터 = " + numbers[i]);
        }
        System.out.println("=========================");

        // enhanced for loop

        for (int n : numbers) {// JS의 for of문 과 같은 역할 여기서 iter로 사용 가능
            System.out.println("n = " + n);
        }


        //Arrays.stream(numbers).forEach(n ->System.out.println(n)); // forEach 쓰는 문법 나중에 또 배움


        System.out.println("==============================");

        // 배열 단축 생성 문법

//        String[] pets = new String[]{"멍멍이","야옹이","짹짹이"};

        // 변수를 선언할 때만 new Type[] 문 생략 가능
        String[] pets = {"멍멍이", "야옹이", "짹짹이"};

        System.out.println(Arrays.toString(pets));

        pets = new String[]{"ㅋㅋ", "ㅋㅋ", "잉잉"};// 이렇게 수정할때도 new String[] 문을 적어줘야함


        // 파라미터 전달 할때에는 생략불가능
        foo(new String[]{"하하", "호호"});



/*

# 배열의 기본 값
        자바의 배열은 생성되는 순간 해당 공간에 기본값들을 채워넣음
        정수형: 0
        실수형: 0.0
        논리형: false
        문자형: ''
        기타(String): null
        */

        byte[] bArr = new byte[3];
        System.out.println(Arrays.toString(bArr));

        double[] dArr = new double[3];
        System.out.println(Arrays.toString(dArr));

        boolean[] blArr = new boolean[3];
        System.out.println(Arrays.toString(blArr));

        char[] cArr = new char[3];
        System.out.println(Arrays.toString(cArr));

        // 기본타입 (정수, 실수, 논리, 문자-char)
        // 나머지는 참조타입 (주소를 저장하는 변수 - 포인터)
        // 참조타입들은 기본값이 null
        // 앞글자가 대문자면 기본타입이 아님
        String[] strArr = new String[3];
        System.out.println(Arrays.toString(strArr));



    }// end main

    static void foo(String[] sArr) {

    }

}
