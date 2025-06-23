package chapter1_2;

public class VarScope {

    public static void main(String[] args) {

        /*
        * java는 변수가 선언된 블록에서 생성되어
        * 블록이 종료되면 메모리에서 자동제거됨
        * */

        int x1 = 10;
        if(true){
            //int x1 = 20; JS에서는 이렇게 선언하는게 됐지만 여기선 안됨
        }//if block




    }//main block
}// class block
