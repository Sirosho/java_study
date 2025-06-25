package chap1_3;


// 실행용 클래스: 실제로 Dancer 생성
public class DancerMain {

    public static void main(String[] args) {

        // 데이터 타입: 데이터를 담는 그릇
        // 기본 데이터 타입: byte,short,int,long ...

        // 설계도(class)를 가져와서 객체를 찍어낸다.
        // new ~ heap 영역에 생성한다는 뜻
        // 객체의 데이터형이 어떻게 될지 가늠할수없으므로
        // 객체 이름자체를 데이터형 처럼 적어버림
        Dancer park = new Dancer();


//        park.dancerName = "박격포";
//        park.crewName = "전쟁크루";
//        park.danceLevel = 1;
//        park.genres = new String[] {"케이팝", "코레오"};

        Dancer kim = new Dancer();



        /*
         * js 로 하면 이런 코드와 같다
         *
         *       const part = {
         *                       dancerName:'',
         *                       crewName: '',
         *                       genres: [],
         *                       danceLevel:0,
         *                     }
         *
         *
         * */

        System.out.println("park = " + park); // 이렇게 하면 배열처럼 주소가 출력
        System.out.println("kim = " + kim); // 두 객체의 주소는 다르다

        park.introduce();
        kim.introduce();

        System.out.println("=====================");

        Dancer pororo = new Dancer("뽀로로");
        pororo.introduce();
        System.out.println("=====================");
        Dancer heartPing = new Dancer("하츄핑","캐치티니핑");
        heartPing.introduce();

        System.out.println("==============");

        Dancer merong = new Dancer("메롱롱", "약오르지", "케이팝", "왁킹", "코레오");

        merong.introduce();

        System.out.println("=====================");

        Dancer king = new Dancer("천무스테파니", "춤신춤왕", 3, "춤");

        king.introduce();
    }
}
