package chap2_4.collection.set;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {

        /*
        *       Set (집합)
        *           1. 중복을 허용하지 않는다.
        *           ex)  (1,2,3) + (3,4,5) = (1,2,3,4,5)
        *           2. 순서를 보장하지 않는다. (해시)
        *
        *       List 는 순서대로 데이터 정리를 해야함
        *
        *       Set은 순서를 보장하지 않아 막 넣어도 됨
        *           List보다 빠르다.
        *
        *
        * */

        Set<String> set = new HashSet<>();

        set.add("떡볶이");
        set.add("김말이");
        boolean flag1 = set.add("김밥"); // boolean 타입 리턴 중복이 없으면 추가되며 ture 있으면 false
        set.add("단무지");
        boolean flag2 = set.add("김밥");

        System.out.println(set); // [김밥, 김말이, 단무지, 떡볶이] 중복은 알아서 걸러줌 순서도 멋대로
        System.out.println("flag1 = " + flag1); // true
        System.out.println("flag2 = " + flag2); // false

        // 요소 삭제 : set은 순서가 없기 때문에 인덱스도 없음
        set.remove("단무지");
        System.out.println(set);

        // 인덱스가 없어서 기본 for문은 불가능
        // iter for문은 가능

        // 실무에서 set의 용도는 리스트 같은 자료구조의 중복제거 용도

        List<Integer> numbers = List.of(3, 3, 1, 2, 3, 4, 5, 6, 7, 8, 1, 1, 2, 6, 7, 8);
        System.out.println(numbers);

        // set으로 변환

        Set<Integer> numSet = new HashSet<>(numbers); //중복을 없애줌!
        System.out.println("numSet = " + numSet);


        // list로 다시 변환

        ArrayList<Integer> numbers2 = new ArrayList<>(numSet);

        System.out.println("numbers2 = " + numbers2);

        // equals와 hashcode를 오버라이딩 하는 이유
        System.out.println("======================");


        Person p1 = new Person("김철수", "850516");
        Person p2 = new Person("박영희", "850516");
        Person p3 = new Person("김철수", "850516");

        Set<Person> personSet = new HashSet<>();
        personSet.add(p1);
        personSet.add(p2);
        personSet.add(p3);

        System.out.println(personSet);
        System.out.println("p1 == p3 ? " + (p1.equals(p3)));

    }



}
    class Person{
        String name;
        String ssn;

        public Person(String name, String ssn) {
            this.name = name;
            this.ssn = ssn;


        }


        @Override
        public boolean equals(Object o) {
            if (!(o instanceof Person person)) return false;
            return Objects.equals(name, person.name) && Objects.equals(ssn, person.ssn);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, ssn);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", ssn='" + ssn + '\'' +
                    '}';
        }


    }
