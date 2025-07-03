package chap1_9.final_;

public class Main {
    public static void main(String[] args) {

        Student st1 = new Student("김철수","991123-1234567");


//        st1.ssn= "123123"; 이렇게 생성자로만 초기화하면 최초1회 이후에는 변경이 불가능


        System.out.println("st1 = " + st1);

        String nation = st1.NATION;


    }

}
