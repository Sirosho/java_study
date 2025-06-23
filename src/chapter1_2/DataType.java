package chapter1_2;

public class DataType {

    public static void main(String[] args) {

        // Java는 클래스를 만들때 DataType 이런식으로 만들어야함
        // ctrl + Alt + v 데이터타입 맞춰주는 단축키
        // 정적 타이핑 언어 : 타입을 직접 지정해야함. JS는 알아서 맞춰주는 동적 타이핑 언어
        int age =20;// 정수
        double pi = 3.14; //실수
        char c = 'A'; //글자
        String greeting = "안뇽하세요"; //문자열
        boolean flag = true; // 논리

            // 정수타입 ( byte: 1, short: 2 ,int : 4 ,long : 8 )
            // 1byte == 8bit -> 10진수 정수 8 => (부호비트)0 0001000(이진수)
            // 영상이나 음악 데이터를 다룰때에는 byte가 아직 쓰임
            // -128 ~ 127
            // 2byte == 16bit ->10진수 정수 1000 => 1111101000
            // 부호비트 빼고 15bit -32768 ~ 32767
        
         // long 타입은 32비트 숫자 저장이 가능하지만, 이 숫자를 long에 저장하기 전에
        // 먼저 리터럴 에 저장을 하고 가져오는 방식이다.
        // 리터럴은 기본타입이 int 라서 4byte 밖에 저장을 못하므로 리터럴의 기본형을 바꿔주어 가져와야하므로 뒤에 L을 붙여준다.
        
        long x4 = 123123123123123123L;
        
        
        //실수타입
        float f1 = 3.123123131123F; // 4byte 실수는 double이 리터럴 기본타입이라서 F를 넣어줘야 float만큼 리터럴 메모리를 사용
        double f2 = 3.123123131231; // 8byte
        
        // 논리타입 
        
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = 10 < 5;
        //if(0,Nan,undefined) 등 Java에서는 트루디 펄시 사용이 불가능
        
        
        
        // 문자타입
        char a = 'A'; // 2byte 0 ~ 65535 음수 불가능
        char c2 = 97;
        System.out.println("c2 = " + c2); // 유니 코드 글자가 나옴

        char[] cArr =  {'h','e','l','l','o'};

        String str = new String(cArr);

        System.out.println("str = " + str);

        String str2 = "안녕하세요";

        // 자바 17부터 지원

//        String str3 = """
//                      안녕
//                      메롱
//                      잘가
//                      ㅋㅋㅋ
//                      """;

        // 동적 타이핑 지원 (java9) 알아서 타입 만들어줌
//        var z= 100;
//        var v= "gggg";
        // 안쓰는게 낫다


    }

}









