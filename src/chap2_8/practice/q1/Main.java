package chap2_8.practice.q1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = List.of(
                new Transaction(brian, 2021, 300),
                new Transaction(raoul, 2022, 1000),
                new Transaction(raoul, 2021, 400),
                new Transaction(mario, 2021, 710),
                new Transaction(mario, 2022, 700),
                new Transaction(alan, 2022, 950)
        );

        // 연습 1: 2021년에 발생한 모든 거래를 찾아 거래액 오름차 정렬(작은 값에서 큰 값).
        // List<Transaction>
        List<Transaction> tr2021 = transactions.stream()
                .filter(trs -> trs.getYear() == 2021)
                .sorted(comparing(Transaction::getValue))
                .collect(toList());

        tr2021.forEach(System.out::println);


        // 연습 2: 거래자가 근무하는 모든 도시이름을 중복 없이 나열하시오.
        // List<String>
        System.out.println("========================");

        List<String> cities = transactions.stream()
                .map(trs -> trs.getTrader().getCity())
                .distinct()
                .collect(toList());

        System.out.println("cities = " + cities);


        // 연습 3: Cambridge에 근무하는 모든 거래자(Trader)를 찾아
        // 거래자리스트로 이름순으로 오름차정렬.
        // List<Trader>
        System.out.println("========================");

        List<Trader> traders = transactions.stream()
                .filter(trs -> trs.getTrader().getCity().equalsIgnoreCase("cambridge"))
                .map(Transaction::getTrader)
                .sorted(comparing(Trader::getName))
                .distinct()
                .collect(toList());

        traders.forEach(System.out::println);


        // 연습 4: 모든 거래자의 이름을 리스트에 모아서
        // 알파벳순으로  오름차정렬하여 반환
        System.out.println("========================");

        List<String> nameList = transactions.stream()
                .map(trs -> trs.getTrader().getName())
                .distinct()
//                .sorted(Comparator.reverseOrder()) // 내림차
                .sorted()
                .collect(toList());

        System.out.println("nameList = " + nameList);


        // 연습 5: Milan에 거주하는 거래자가 한명이라도 있는지 여부 확인?
        System.out.println("========================");

        boolean flag1 = transactions.stream()
                .anyMatch(trs -> trs.getTrader().getCity().equalsIgnoreCase("milan"));

        System.out.println("flag1 = " + flag1);


        // 연습 6: Cambridge에 사는 거래자의 모든 거래액의 총합 출력.

        System.out.println("========================");
        int total = transactions.stream()
                .filter(trs -> trs.getTrader().getCity().equalsIgnoreCase("cambridge"))// 대소문자 무시 비교
                .mapToInt(Transaction::getValue)
                .sum();

        System.out.println("total = " + total);

        // 연습 7: 모든 거래에서 최고거래액은 얼마인가?

        //Optional : NPE(NullPointerException) 방지를 위한 자바의 노력)
        int max = transactions.stream()
                .mapToInt(Transaction::getValue)
                .max()// 최대값을 가져옴 OptionalInt로 반환
                .orElse(0);

        System.out.println("max = " + max);

        // 연습 8. 가장 작은 거래액을 가진 거래정보 탐색
        Transaction minTrs = transactions.stream()
                .min(comparing(Transaction::getValue))
                .orElse(null);


        // 연습 9. 거래액이 500 이상인 거래들만 필터링하고,
        // 해당 거래의 정보를 출력하시오.

        System.out.println("============================");

        transactions.stream()
                .filter(trs -> trs.getValue() >= 500)
                .forEach(System.out::println);


        // 연습 10. 모든 거래에서 가장 작은 거래액보다
        // 큰 거래액을 가진 거래의 평균을 계산하시오.
        // 출력값: 752.0
        System.out.println("============================");

        // 최소 거래액 찾기
        int minValue = transactions.stream()
                .mapToInt(Transaction::getValue)
                .min()
                .orElse(0);





        // 연습 11. "Cambridge"에서 거래하는 모든 거래자의 거래정보들을 연도별로 그룹화하여 출력하시오.

        Map<Integer, List<Transaction>> cambridge = transactions.stream()
                .filter(trs -> trs.getTrader().getCity().equalsIgnoreCase("cambridge"))
                .collect(Collectors.groupingBy(trs -> trs.getYear()));

        cambridge.forEach((key, value) -> {
            System.out.println("Year: " + key);
            value.forEach(v -> System.out.println(v.toString()));
        });







        /*
               출력예시

                Year: 2021
                {Trader: Brian in Cambridge, year: 2021, value: 300}
                {Trader: Raoul in Cambridge, year: 2021, value: 400}

                Year: 2022
                {Trader: Raoul in Cambridge, year: 2022, value: 1000}
                {Trader: Alan in Cambridge, year: 2022, value: 950}

                const data = {
                    2021: [
                        {
                            trader: {
                                city: '',
                                name: ''
                            },
                            year: 2021,
                            value: 300
                        },
                        {}
                    ],
                    2022: []
                }
         */




        // 연습 12. 모든 거래 중 가장 큰 거래액과 가장 작은 거래액의 차이를 계산하시오.
        // 출력 값 : 700
    }

}