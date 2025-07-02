package chap1_8.poly.casting.emp;

// 사장님
public class Owner {

    // 직원들에게 일을 명령하는 기능
    public void orderWork(Employee employee){
        //employee 로만 명령을 하면 그 직원이 디자이너인지 개발자인지 컴파일러는 알 수가 없다.
        System.out.println("사장님이 업무를 지시합니다.");
        // 다운캐스팅을 함부로 하면 에러발생 가능성이 있다.
        // 타입캐스팅을 하고 맞는지 확인을 한다.
        if(employee instanceof Developer){
        ((Developer)employee).develop();
        }else if(employee instanceof Designer){ // instanceof 연산자는 타입이 맞는지 확인하는 기능이다.
        ((Designer)employee).design();
        }

    }
}
