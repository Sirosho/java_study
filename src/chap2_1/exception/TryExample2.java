package chap2_1.exception;

import java.util.Scanner;

public class TryExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = 0;// 문자열을 정수로 변환 인텔리제이는 static을 이탤릭체로 바꿔줌
        int n2 = 0;// 문자열을 정수로 변환


        while (true) {
            try {
                System.out.print("정수1: ");
                String str1 = sc.nextLine();// 정수를 문자열로 입력
                n1 = Integer.parseInt(str1);


                System.out.print("정수2: ");
                String str2 = sc.nextLine();// 정수를 문자열로 입력
                n2 = Integer.parseInt(str2);
                System.out.println("n1 / n2 = " + (n1 / n2));
                break;
            } catch (NumberFormatException e) { //정수만 걸러줌
                //catch는 이렇게 여러개를 배치가능
                // Exception이 최상위에 있는 클래스임 모르겠으면 일단 이거 쓰면됨
                // 자식 클래스는 에러 종류별로있음
//                System.out.println(e.getMessage()); // 에러메세지를 단순하게 보여줌
//                e.printStackTrace();// 예외처리 안했을 떄 뜨던 빨간메시지를 보여줌 디버깅용
                System.out.println("정수로만 입력하세요!");
            } catch (ArithmeticException e) { // 수식이 잘못된걸 걸러줌
                System.out.println("0으로 나눌 수 없습니다.");
            } catch (Exception e) { // 이렇게 마지막 catch문에는 그냥 Exception으로
                                   // 다른 catch 문들의 조건에 해당하지않는 에러를 걸러줘야함
                System.out.println("알 수 없는 에러 발생! 조치 후 점검하겠습니다.");
            }
        }


    }
}
