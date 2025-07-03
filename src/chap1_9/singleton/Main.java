package chap1_9.singleton;

public class Main {
    public static void main(String[] args) {


        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        s1.a = 100;
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);


        // 하나의 객체를 반복 생성

    }
}
