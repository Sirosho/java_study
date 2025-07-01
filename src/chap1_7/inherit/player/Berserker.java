package chap1_7.inherit.player;

public class Berserker extends Warrior{

    public Berserker(String nickName){
//        super(); //부모의 기본생성자가 없어서 에러가 남
        super(nickName);
    }
}
