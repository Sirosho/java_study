package chap2_3.arraylist;


import chap1_8.poly.drive.Car;
import chap1_8.poly.drive.Mustang;
import chap1_8.poly.drive.Sonata;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // 문자열 전용 배열

        MyArrayList<String> foods = new MyArrayList<>();
        foods.push("짜장면");
        foods.push("볶음밥");
        foods.push("라면");
        System.out.println(foods);
        // foods 배열에 데이터 몇개있어요?
        System.out.println(foods.size());
        // foods의 0 번 인덱스에 접근하고싶어요
        String firstFood = foods.get(0);
        System.out.println(firstFood);
        System.out.println("====================");
        String deleted = foods.remove(0);
        System.out.println(foods);

        int index = foods.indexOf("볶음밥");
        System.out.println(index);

        foods.clear();
        System.out.println(foods);

        System.out.println("====================");
        // 정수 전용 배열
        //          객체만 가능하게 만들어둠
        MyArrayList<Integer> numbers = new MyArrayList<>();
        numbers.push(1);
        numbers.push(2);
        numbers.push(3);
        numbers.push(4);


        System.out.println(numbers);
        System.out.println(numbers.contains(2));

        // 자동차 배열
        MyArrayList<Car> cars = new MyArrayList<>();
        cars.push(new Sonata());
        cars.push(new Mustang());


        // java에 디폴트로 있는 ArrayList 클래스
        ArrayList<String> hobbies = new ArrayList<>();
        hobbies.add("취미1");
        hobbies.add("취미2");
        hobbies.add("취미3");
        System.out.println(hobbies);


    }
}
