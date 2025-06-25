package chapter1_2.method;

public class MethodBasic {


    // 자바는 함수라는 개념이 없고 메서드가있음 객체지향이기때문..
    // 메서드: 객체가 가진 기능 ex) JS 배열의 push,pop 같은 특정 형태에서만 사용할수있는 속성
    // 메서드를 정의할 수 있는 위치는 클래스 내부, 메서드 외부
    public static void main(String[] args) {

        int add = add(20, 30);
        System.out.println(add);

        int result2 = addAll(new int[]{1, 2, 3, 4});
        System.out.println(result2);
    }

    // 2개의 정수를 받아서 더해서 반환
    //자바는 파라미터 앞에 데이터 형을 명시
    // 매서드 이름 앞에 return되는 데이터 형 명시
    static int add(int n1, int n2) {
        return n1 + n2;
    }

    int add2(byte n1, byte n2) {
        return n1 + n2;
    }

    // return이 없는경우 void
    void bar() {
        System.out.println("hello!!");
    }

    // n개의 정수를 전달 받아서 싹 더해서 리턴
    // 배열로 받아서 처리 int... 으로하면 알아서 배열로 묶어줌
    static int addAll(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }


    // 배열 2개를 전달받을 때
    static void ticky(int[] nums1, int[] nums2) {
        ticky(new int[]{1, 2, 3}, new int[]{4, 5, 6});
    }

    // 여러개를 리턴하고 싶을때

    int[] multiReturn(int n1, int n2) {
        return new int[]{n1 + n2, n1 - n2};
    }

}


// 매서드에서의 return; (그냥 쌩리턴)은 void에서만 가능
// void 형태가 아닌데 리턴할게 없다면 return null; 해야함