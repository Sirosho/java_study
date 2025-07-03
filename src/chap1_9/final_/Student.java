package chap1_9.final_;

public class Student {

    public String name;// 학생명
    public final String ssn;//final 은 초기화를 해줘야 사용가능           // 주민번호
                                    // 생성자로 초기화하면 초기화를 안해줘도 괜찮음




    // 자바의 상수 (불변성: final , 유일성: static) 이 둘이 다있어야 상수로 볼수있음
    public static final String NATION;


    // static 전용 생성자 - 정적 초기화자 (static initializer)
    // static을 인스턴스 생성자에서 초기화하려고하면
    // 컴파일러는 사용자가 생성자를 호출하지않고 static 필드를 참조하는 상황을 방지하기위해
    // 에러발생시킴

    static{
        System.out.println("정적 초기화자 호출!"); // 스태틱 접근시 최초 1번 호출
        NATION="대한민국";
    }

    public Student(String name, String ssn){
        this.name = name;
        this.ssn = ssn;
    }




    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
