package chapter1_2.array;

import java.util.Arrays;

public class ArrayInsert {

    public static void main(String[] args) {

        int[] numbers = {10, 50, 90, 100, 150};

        int targetIndex = 2;
        int newNumber = 70;
        /*
         * [ 10,50,90,100,150 ]
         *
         * 우선 사이즈가 1개 큰 새 배열부터 생성
         * [ 10,50,90,100,150,0 ]
         *
         * [ 10,50,0,90,100,150 ]
         *
          */

        // 1. 사이즈가 1칸 큰 배열 생성
        int[] temp = new int[numbers.length+1];
        // 2. 기존 데이터 새 배열로 복사
        for (int i = 0; i < numbers.length; i++) {
                temp[i]= numbers[i];
        }

        for (int i = temp.length-1; i >targetIndex; i--) {
            temp[i] = temp[i - 1];
        }

        temp[targetIndex] = newNumber;

        System.out.println(Arrays.toString(temp));

    }
}
