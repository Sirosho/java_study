package chap1_5.member;


import java.util.Scanner;

// 역할: 회원관리 앱의 입출력을 담당
public class MemberController {

    // 객체의 협력과 위임
    // 필드: 클래스의 속성 - 부품 속성
    MemberRepository mr; // 의존관계
    Scanner sc;

    MemberController(){
        mr = new MemberRepository();
        sc = new Scanner(System.in);
    }

    // 프로그램 초기 화면 출력
    void start() {
        while (true) {
            processMenu(showMenu());

        }//end while

    }




    void processMenu(String menuNum) {
        switch (menuNum) {
            case "1":
                signUp();
                break;
            case "2":
                showAllMembers();
                break;
            case "3":
                System.out.println("개별 회원정보를 조회합니다.");
                break;
            case "4":
                System.out.println("회원정보 수정을 시작합니다.");
                break;
            case "5":
                System.out.println("회원정보 삭제를 시작합니다.");
                break;
            case "6":
                System.out.println("회원정보 복구를 시작합니다.");
                break;
            case "7":
                System.out.println("프로그램을 종료합니다.");
                System.exit(0); // 프로그램 강제종료 코드
                break;
            default:
                System.out.println("# 메뉴를 숫자로 입력해주세요!");
        }// end switch

        prompt("=========== 계속 하시려면 Enter...=================");
    }

    void signUp() {
        System.out.println("\n# 회원정보 등록을 시작합니다.");
        String email = checkDuplicateEmail();
        String password = prompt("# 패스워드: ");
        String memberName = prompt("# 이름:");
        Gender gender = inputCorrectGender();
        String ageStr = prompt("# 나이: ");
        //회원 배열에 추가

        mr.addMember(new Member(
                email,
                password,
                memberName,
                gender,
                Integer.parseInt(ageStr)

        ));

    }

    private String checkDuplicateEmail() {
        while (true) {
            String email = prompt("# 이메일: ");
            if(!mr.isDuplicateEmail(email)){
                //중복이 아닌경우
                return email;
            }
            System.out.println("# 이메일이 중복되었습니다.");
        }
    }

    private Gender inputCorrectGender() {
        while (true) {
            String genderStr = prompt("# 성별 [M/F] :");
            switch(genderStr.toUpperCase().charAt(0)){
                case 'M':
                    return Gender.MALE;
                case 'F':
                    return Gender.FEMALE;

                default:
                    System.out.println("성별을 M 또는 F로 입력해주세요");
            }
        }

    }


    void showAllMembers() {
        System.out.println("\n# 전체 회원 정보를 조회합니다.");
        Member[] members = mr.getMembers();
        for (Member member : members) {
            member.inform();
        }
    }


    String showMenu() {
        System.out.printf("\n#####  회원 관리 시스템 (현재 회원 수: %d명)  #####\n", mr.size());
        System.out.println("* 1. 회원 정보 등록하기");
        System.out.println("* 2. 전체 회원 조회하기");
        System.out.println("* 3. 개별 회원 조회하기");
        System.out.println("* 4. 회원 정보 수정하기");
        System.out.println("* 5. 회원 정보 삭제하기");
        System.out.println("* 6. 회원 정보 복구하기");
        System.out.println("* 7. 프로그램 종료하기");
        System.out.println("================================");

        String menuNum = prompt(">> ");
        return menuNum;
    }

    /**
     * 사용자로부터 입력 메시지를 출력하며 데이터를 입력 받는 메서드입니다.
     *
     * @param message 입력을 요청하며 출력할 메시지
     * @return 사용자가 입력한 문자열
     */
    String prompt(String message) {
        System.out.print(message);
        return sc.nextLine();

    }

    }
