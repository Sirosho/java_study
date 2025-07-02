package chap1_9.static_;

import static chap1_9.static_.util.InputUtils.prompt;

public class Main {
    public static void main(String[] args) {


        Count c1 = new Count();

        c1.x++;
        c1.y++;


        Count c2 = new Count();

        Count.x++; //Static 변수에 접근할때는 클래스명.변수명으로 접근하는게 더 단순하다
        c2.y++;

        c2.x = 999;

        System.out.printf("c1.x = %d, c1.y = %d\n", c1.x, c1.y);
        System.out.printf("c2.x = %d, c2.y = %d\n", c2.x, c2.y);

        c1.m2();
        Count.m1();


        System.out.println("========================");

        Calculator sharpCalc = new Calculator();
        sharpCalc.customizeColor("노랑색");

        prompt("너 나이 써봐!");

    }

}
