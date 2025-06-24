package chapter1_2.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz02 {
    public static void main(String[] args) {

        // 1. 수정 타겟의 이름을 입력받는다.
        // 2. 해당 이름이 있는지 탐색해본다.
        // 3. 탐색에 성공하면 해당 이름의 인덱스를 알아온다.
        // 4. 탐색에 실패하면 실패한 증거를 확보한다.
        // 5. 성공했을 시 수정을 원하는 새로운 이름을 입력받는다.
        // 6. 찾은 인덱스를 통해 새로운 이름으로 수정한다.
        // 7. 위 내용을 수정이 정확히 완료될때까지 반복한다.

        Scanner scanner = new Scanner(System.in);
        String[] idol = new String[]{"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};


            int index = 0;
        while(true){

            System.out.println("수정할 멤버의 이름을 입력하세요." + index);
            String name = scanner.nextLine();


            while (true) {
                if(idol[index].equals(name)){
                    System.out.println(idol[index] + "의 별명을 변경합니다.");

                    break;
                }else if(index == idol.length-1){
                    System.out.println(name + "은(는) 없는 이름입니다.");
                index=0;
                break;
                }
                index++;
            }

            break;
        }

            System.out.println("적용할 별명을 입력하세요");
            System.out.print(">>");
            String newName = scanner.nextLine();

            idol[index] = newName;

            System.out.println("-변경완료!");
            System.out.println("변경 후 정보" + Arrays.toString(idol));

    }
}
