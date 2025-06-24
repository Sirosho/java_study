package chapter1_2.array;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        String[] pets = {"멍멍이", "야옹이", "짹짹이"};
//        String[] petsCopy = pets; //배열 변수를 카피하면 배열의 포인터 주소만 카피됨


//        String[] petsCopy = new String[pets.length];// 1. 배열 객체 복사( 사실 length만 똑같이 새로만드는것 )
        // 2. 배열 값 복사
        /*for (int i = 0; i < pets.length; i++) {
            petsCopy[i] = pets[i];
        }
*/

        String[] petsCopy = Arrays.copyOf(pets,pets.length); // 위 과정을 한번에 하는 법


        System.out.println("원본주소" + pets);
        System.out.println("사본 주소:" + petsCopy);
        System.out.println("원본:" + Arrays.toString(pets));
        System.out.println("사본: "+Arrays.toString(petsCopy));


    }
}
