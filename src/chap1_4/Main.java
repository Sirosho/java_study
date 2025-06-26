package chap1_4;

// 패키지이름을 매번 안적어도 됨

import chap1_4.cake.Apple;
import chap1_4.cake.Banana;
// 이렇게 같은 패키지에서 클래스를 다 가져욜때는
//import chap1_4.cake.*; 이렇게 하면됨


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 이름이 겹치는경우 객체 앞에 경로까지 적어줘야함
//         chap1_4.cake.Apple juiceApple = new chap1_4.cake.Apple();

        // 서로 다른 패키지의 같은 클래스 이름의 클래스를 모두 쓰고싶을때
        // 전부 import하면 오류남 이렇게 풀네임을 적어줘야함
        chap1_4.juice.Apple juiceApple = new chap1_4.juice.Apple();
         Apple cakeApple = new Apple();

         Scanner sc = new Scanner(System.in);

         // 다른 패키지에서 다른 패키지의 클래스를 사용할 때는 import문이 필수
        Banana banana = new Banana();

    }
}
