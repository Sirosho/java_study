package chap1_6.encap;

public class Car {
    // 정보가 은닉되어있지 않으면 마음대로 Main에서 데이터 접근이 가능
    // private로 정보은닉을 해주고
    // 접근시킬 데이터는 메서드를 통해서
    private String model;// 모델명
    private String mode; //변속모드(P,R,N,D)
    private String ownerName; //차주명
    private boolean on; // 시동여부







    // 변속을 수행하는 메서드(setter 메서드: 필드값을 안전하게 처리하는 메서드)
    // 세터 메서드는 관례적으로 set으로 시작하여 캐멀케이스로 적음
    public void setMode(String mode){
        switch(mode){
            case "D": case "N": case "P": case "R":
                this.mode = mode;
                break;
            default:
                this.mode = "P";
        }
    }


    public String getMode(){
        return mode;
    }

    // 기능
    // 엔진오일을 분사하는 기능
    private void injectOil(){
        System.out.println("엔진오일이 분사됩니다.");
    }

    // 엔진 실린더가 반복 작동하는 기능

    private void moveCylinder(){
        if(!on){
            System.out.println("시동이 안걸린 상태에서는 차량이 폭발합니다 뻥!");
            return;
        }
        System.out.println("엔진 실린더가 작동합니다.");
    }
    //시동이 걸리는 기능
   private void powerOn(){
        on = true;
        System.out.println("시동이 걸렸습니다.");
    }
    // 시동 버튼을 누르는 기능
   public void pressButton(){
        injectOil();
        powerOn();
        moveCylinder();
        System.out.println("시동 버튼을 눌렀습니다.");

    }

}
