package chap2_4.collection.map;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

    public static void main(String[] args) {



        /*
        *       Map (JSON 객체, 파이썬 딕셔너리 대응)
        *          1. Key와 value를 가진 엔트리 객체를 보관하는 자료구조
        *          2. key는 중복을 허용하지 않으며 value는 중복을 허용
        *          3. 순서를 보장하지않음
        *          4. Key는 String, Value는 Object 타입으로 업캐스팅되어 저장됨
        *             사용시에 맞는 타입으로 다운캐스팅해야함
        *
        *
        * */

        Map map = new HashMap(); //HashMap 표현체.

        /*
        *
        *   데이터 추가: put
        *       {
        *              "empName" : "김철수",
        *               "hireDate" : "2012 - 05 -13",
        *               "salary" : 50000000
        *
        *                   }
        *
        * */

        map.put("empName", "김철수"); // Key는 String, Value는 Object 타입으로 저장됨
        map.put("hireDate", LocalDate.of(2012,5,13));
        map.put("salary", 50000000);

        System.out.println(map); // JSON형태로 나옴
        System.out.println(map.size());// key의 갯수
        String empName = (String)map.get("empName"); // Object 타입으로 저장됐기때문에 다운캐스팅 해줌
        System.out.println(empName);

        // 중복된 키를 사용해서 데이터를 삽입 -> 수정
        map.put("empName", "박영희");
        System.out.println(map);

        // 수정 전에는 정확하게 데이터가 있는지 체크
        System.out.println(map.containsKey("empName"));//map.containsKey

        // map의 반복문 처리
        Set<String> keys = map.keySet();
        System.out.println(keys);
        for (String key : keys) {
            System.out.printf("[%s] : %s\n",key,map.get(key));
        }

    }
}
