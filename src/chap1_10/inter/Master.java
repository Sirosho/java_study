package chap1_10.inter;

public class Master {

    // 동물에게 사냥을 명령
    public void letsHunt(Huntable animal){ // 인터페이스를 타입으로도 사용가능
        animal.hunt();
    }
    // 동물과 재밌게 놀아주는 명령
    public void letsPlay(Pet animal){
        animal.handle();
    }


}
