package chap1_3;

import java.util.Scanner;

public class StringCompare {

    public static void main(String[] args) {

        String str1 = "김철수";// 알아서 스트링 객체를만듬
        String str2 = "김철수";// 리터럴로 만들어진 객체가 있으면 찾아서 주소를 같이 씀
        String str3 = new String("김철수"); // 명시적으로 string 객체를 만듬

        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str1 == str3 : " + (str1 == str3));

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);


        System.out.println("===============================");
        Scanner sc = new Scanner(System.in);

        String inputName = sc.nextLine(); // 함수를 통해 리턴된 string도 명시하여 생성한 string 객체로 만들어짐
        String myName = "홍길동";

        System.out.println("myName = " + myName);
        System.out.println("inputName = " + inputName);

        System.out.println("같은가? :" +(inputName.equals(myName)));


    }
}
