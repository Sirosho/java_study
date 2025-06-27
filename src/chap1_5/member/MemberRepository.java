package chap1_5.member;


// 회원들의 CRUD를 담당하는 창고(데이터베이스) 역할
public class MemberRepository {

    // 회원들을 저장할 배열
    // Member => [{},{},{}] 객체배열

    Member[] memberList;// 가입된 회원 배열

    MemberRepository() { // 객체의 필드는 생성자에서 초기화 하는것을 권장함
        memberList = new Member[]{
                new Member("sadfdsafdsaf@sdafsdf.com","sadfsdf","ㅇㅇㅇ",Gender.MALE,30),
                new Member("a2222af@sdafsdf.com","sadfsdf","rrr",Gender.FEMALE,30),
                new Member("s111afdsaf@sdafsdf.com","sadfsdf","ㄱㄱㄱ",Gender.MALE,30),

        };

    }

    // 메서드

    // 회원 배열을 리턴하는 메서드


    Member[] getMembers(){

        return this.memberList;
    }

    /**
     * 현재 회원 목록에 저장된 회원 수를 반환합니다.
     * @return 회원 목록의 총 회원 수
     */
    int size(){
        return this.memberList.length;
    }



    //  /** 엔터 하면 나옴 문서주석
    /**
     * 새로운 회원을 저장소에 추가합니다
     *
     * @param newMember 저장소에 추가할 새로운 회원
     *
     */
    void addMember(Member newMember){
        // 배열에 push를 적용
        // 배열에 push를 적용
        // 1. 기존배열보다 1개 더 큰 새로운 배열 생성
        Member[] temp = new Member[memberList.length + 1];
        // 2. 기존배열의 데이터를 복사해서 신규배열에 저장
        for (int i = 0; i < memberList.length; i++) {
            temp[i] = memberList[i];
        }
        // 3. 신규데이터를 마지막 인덱스에 추가
        temp[temp.length - 1] = newMember;
        // 4. 신규배열을 실제 배열로 변경
        memberList = temp;
    }

    // 탐색 기능 (특정 회원을 찾는 기능)

    /**
     * 회원 목록에서 주어진 이메일 주소로 회원을 검색합니다.
     * 일치하는 이메일을 가진 회원이 발견되면 해당 회원이 반환됩니다.
     * 일치하는 회원이 없으면 null이 반환됩니다.
     *
     * @param targetEmail 검색할 회원의 이메일 주소
     * @return 해당 이메일을 가진 회원 객체,
     * 해당 이메일을 가진 회원이 없는 경우 null
     *
     * 이렇게 메타데이터를 적어주면 좋음
     * @author - 백
     * @since - 2025.06.27
     */

    Member findMemberByEmail(String targetEmail){
        for (Member member : memberList) {
            if(targetEmail.equals(member.email)){
                return member;
            }
        }
        return null;// 탐색에 실패한 경우
    }





    boolean isDuplicateEmail(String inputEmail){
        return  findMemberByEmail(inputEmail) != null;
    }



}
