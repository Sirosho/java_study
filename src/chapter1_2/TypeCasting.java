package chapter1_2;

public class TypeCasting {
    public static void main(String[] args) {


        // java는 타입이 다른 데이터의 연산을 지원하지 않음 ex)) 숫자 + 문자열

        byte a = 100;
        int b = a; // 원래는 타입이 달라서 대입연산이 안되지만 이 경우는 암묵적으로 형변환이 됨 (byte: 1 -> int: 4)
        // 메모리 크기가 작은것에서 큰것으로 가기때문에 가능

        int c = 1000;
        //byte d = c; // int: 4 -> byte: 1 이건 안됨. 큰것에서 작은것으로는 암묵적으로 안바꿔줌

        /*
         *
         * var c
         *  0 0000000 00000000 00000011 11101000  숫자 10000 int
         *                              | 요기만 |
         *
         * var d
         * 1 1101000 이렇게만 가져감
         *
         * */


        byte d = (byte) c; // 명시적 형변환 - 메모리에 안맞게 바꾸면 데이터 손실이 발생할 수 있음


        int k = 50; // 4byte
        double j = k; // 8byte
        // 가능


        double m = 5.567;// 8byte
        int n = (int) m; // 4byte 데이터 손실을 피할 수 없음


        System.out.println("n = " + n);

        // 암묵적(묵시적) 형 변환 -> upcasting (promotion)
        // 명시적 형 변환 -> downcasting


        // 타입이 다른 데이터끼리의 연산은
        // 암묵적 형변환에 의해 작은 데이터가 큰 데이터로 변환됨
        int v = 91;
        double z = 6.6;
        // 이 둘의 연산은 double 형으로 암묵적 형변환된다.
        double result = v + z; // double + int

        int result2 = 'A' + v; // char + int

        System.out.println("result2 = " + result2); // char의 아스키코드 숫자를 더하게 됨

        int h =5;
//        int result3 = 27/h;
//        System.out.println("result3 = " + result3); //int 끼리의 나눗셈

        double result3 = 27.0/h;
        System.out.println("result3 = " + result3); // 한쪽을 double로 바꾸면 double형 계산


        // int 보다 작은 데이터(char,short,byte)들은
        // 연산결과가 무조건 int다
        // 연산 결과가 해당 데이터들보다 커질 수 있기 때문
        byte b1 = 100;
        byte b2 = 70;
        int result4 = b1 + b2;

    }
}
