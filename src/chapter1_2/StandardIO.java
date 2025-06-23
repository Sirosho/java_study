package chapter1_2;

import java.io.IOException;
import java.util.Scanner;

public class StandardIO {
    public static void main(String[] args) throws IOException {

        //자바의 표준 출력

        System.out.print("안녕\n");
        System.out.println("메롱"); // println은 자동 줄바꿈 추가

        int month =6 ;
        int day = 6;

        System.out.println("오늘은" +month + "월" +day+"일입니다");
        System.out.printf("오늘은 %d월 %d일 입니다.",month,day);// 변수랑 문자열 조합해서 출력할때 사용 줄바꿈기능 없음
        /*
        *  %d: 10진수 정수
        *  %s: 문자열
        *  %c: 문자 하나
        *  %f: 실수
        * */
        System.out.printf("오늘은 %d월 %d일 입니다.\n",month,day);
        System.out.println("하하호호");

        // java 15부터 가능
        String message = "오늘은 %d월 %d일 입니다.".formatted(month,day);
        // java 5부터 가능
        String message2 = String.format("오늘은 %d월 %d일입니다.",month,day);


        // 표준 입력
//        int read = System.in.read();
//        System.out.println(read);

       Scanner scanner = new Scanner(System.in);

        System.out.print("이름: ");
       String name = scanner.nextLine();// scanner.nextLine() 은 입력한 한 줄을 문자열로 받아옴
        System.out.println(name);

        System.out.print("나이: ");
        int age = Integer.parseInt(scanner.nextLine()); // 정수값이 필요하면 이렇게 입력값을 정수로 변환
                                                        // .nextInt(); 도 있지만 버그가 있어서 안쓰는게 좋음
        System.out.println(age);

    }
}
