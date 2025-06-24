package chapter1_2.array;

import java.util.Arrays;

public class ArrayPush {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40};



        int newNumber = 50;

        //numbers 배열의 맨 뒤에 newNumber를 추가 하고싶다.

        //1. 기존 배열 사이즈보다 한 칸 더 큰 배열 생성
        int[] tempArray = new int[numbers.length + 1];

        // 2. 원본배열의 값들을 새 배열로 복사
        for (int i = 0; i < numbers.length; i++) {
            tempArray[i] = numbers[i];
        }
        // 3. 마지막 인덱스에 새 값 저장
        tempArray[tempArray.length-1] = newNumber;

        // 4. 주소값 이전
        numbers = tempArray;
        tempArray = null;


        System.out.println("numbers:" + Arrays.toString(numbers));
        System.out.println("numbers:" + Arrays.toString(tempArray));
    }


    static void push (int[] arr,int newData){
        arr = Arrays.copyOf(arr,arr.length + 1);
        arr[arr.length-1] = newData;
    }




}
