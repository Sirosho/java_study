package chap1_5.member;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        Member m1 = new Member("adsaf1234@gmail.com","qortmdgus","말포이",Gender.MALE,30);
        System.out.println(m1);

        // 클래스 안에 있는 데이터는 반드시 객체생성을 통해 접근함

        MemberRepository mr = new MemberRepository();


        //멤버 추가 테스트
        mr.addMember(new Member("ddd1234@gmail.com","qortmdgus","해리",Gender.MALE,29));
        mr.addMember(new Member("zzz1234@gmail.com","qortmdgus","ㅋㅋ",Gender.MALE,29));
        mr.addMember(new Member("dfff1234@gmail.com","qortmdgus","ㅠㅠ",Gender.MALE,29));

        System.out.println(Arrays.toString(mr.getMembers()));
        System.out.println(mr.size());

        Member foundMember = mr.findMemberByEmail("ddd1234@gmail.com");

        System.out.println(foundMember);
        System.out.println("=====================");
        mr.isDuplicateEmail("zzz1234@gmail.com");
    }
}
