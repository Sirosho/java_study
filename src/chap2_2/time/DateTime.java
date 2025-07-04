//package chap2_2.time;
//
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.util.Calendar;
//import java.util.Date;
//
//public class DateTime {
//
//    public static void main(String[] args) {
//
//        // 날짜와 시간을 표현
//        // 1970년 1월 1일 00:00:00 이전의 시간은 모름 - 에폭 타임 (유닉스 타임)
//        // 밀리초단위로 시간을 늘려나감
//
//        System.out.println(System.currentTimeMillis()); // 에폭타임 이후로 쌓인 밀리초
//
//        // 자바 8 이전 (자바 8은 자바 1.8 을 뜻함)
//        Date date = new Date(); // 지금은 사용되지 않음 자바1때 만들어짐
//
//        System.out.println(date);
//
//        Calendar calendar = Calendar.getInstance(); // 현재 시간을 가져옴
//        System.out.println(calendar.JULY);
//
//        // 자바 8 이후
//        LocalDate nowDateTime = LocalDate.now();
//
//        // 특정 날짜정보 생성
//        LocalDate futureDate = LocalDate.of(2025,1,1);
//        System.out.println(futureDate);
//
//        // 날짜 연산
//        LocalDate targetDate = nowDateTime.plusDays(67);
//
//
//        // 날짜 포맷 변경
//        DateTimeFormatter formatter =
//                DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초");
//
//        System.out.println(nowDateTime.format(formatter));
//
//        String formattedDate = nowDateTime.format(formatter);
//        System.out.println(formattedDate);
//
//
//
//    }
//
//}
