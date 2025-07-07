package chap2_4.collection.list;
/*
 *
 *       List (JSON 배열에 대응)
 *           1. 순서가 있는 데이터 구조
 *           2. 중복데이터 저장을 허용
 *
 *             종류 : 배열리스트, 연결리스트
 *
 *           배열리스트: 데이터들이 일렬로 붙어있는 구조
 *
 *               장점 :
 *                   - 전체 탐색에 좋다.
 *                   - 인덱스로 관리되어 한번에 참조가 가능
 *
 *               단점 :
 *                   - 데이터의 추가, 삭제, 삽입 알고리즘이 비효율적임
 *
 *               사용경우 :
 *                       - 값이 불변이거나 읽기전용이면 좋음
 *
 *
 *           연결리스트 : 데이터들의 주소값이 연쇄적으로 연결된 형태로 저장된 구조
 *                       ex) 1 -> 2 -> 3 -> 4
 *
 *               장점 :
 *                   - 데이터 삽입 및 삭제가 효율적이다
 *
 *               단점 :
 *                   - 탐색에 좋지않다. 타고타고 가야함..
 *
 *               사용경우 :
 *                       - 값이 자주 추가되거나 바뀌는 데이터에 사용
 * */

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        // List 는 ArrayList, LinkedList, Vector 등이 상속받아서
        // 이렇게 다형성으로 표현이 가능
        List<String> hobbies = new ArrayList<>();

                hobbies.add("취미1");
                hobbies.add("취미2");
                hobbies.add("취미3");
                hobbies.add("취미4");
                hobbies.add("취미5");

                System.out.println(hobbies);

                // 데이터 개수 확인 length

            int size = hobbies.size();
            System.out.println("size = " + size);

            // 인덱스찾기

        int index = hobbies.indexOf("취미2");
        System.out.println("index = " + index);

        // 요소수정

        hobbies.set(1,"디자인");
        System.out.println(hobbies);

        // 요소 참조

        String hobby = hobbies.get(1);
        System.out.println("hobby = " + hobby);

        // 리스트 순회 (반복문 처리)

        System.out.println("======================");


        for (int i = 0; i < hobbies.size(); i++) {
            System.out.println(hobbies.get(i));
        }


        // Iterable 인터페이스를 상속받으면 사용이 가능함
        // List가 Iterable을 상속받기 때문에 여기서 사용가능
        for (String h : hobbies) {
            System.out.println(h);

        }
        System.out.println("======================");
        System.out.println("======================");
        hobbies.forEach(h -> System.out.println(h));

        // 전체 삭제

        hobbies.clear(); // 전체 제거

        System.out.println(hobbies.isEmpty());// boolean 타입 리턴


        // 리스트에 초기값 넣고 시작하기
        System.out.println("======================");

        List<Integer> numbers = List.of(1,3,5,7,9);// 불변리스트 이 배열을 조정이 불가능
        List<Integer> numbers2 = new ArrayList<>(List.of(1,3,5,7,9));// 이렇게 하면 수정이 가능


        numbers2.remove(1);

        System.out.println("numbers2 = " + numbers2);

    }
}
