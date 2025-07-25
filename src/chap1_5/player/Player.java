package chap1_5.player;

public class Player {

    String nickName;
    int level;
    int hp;

    // 생성자: 캐릭터가 태어날 때 가져야 할 값들을 세팅
    Player(String nickName/*지역변수 nickName*/){
        // 둘을 구분지어 인식시키려면 this 사용
        this.nickName/*객체에서 선언된 nickName*/ = nickName;
        level = 1;
        hp = 100;
    }
    // 자바의 모든 메서드는 첫번째 파라미터가 생략되어있음 (this 가 생략되어있음)
    // 다른 플레이어를 때릴 수 있는 기능
    void attack(Player targetPlayer){

        if(this == targetPlayer) {
            System.out.println("자기자신을 공격 할 수 없습니다.");
            return;
        }
        System.out.println("targetPlayer = " + targetPlayer);
        // 상대방의 체력이 10 감소
        targetPlayer.hp -= 10;
        // 백데미지로 내 체력도 5 감소
        this.hp-=5;

        System.out.printf("%s님이 %s님을 때렸습니다.\n",this.nickName,targetPlayer.nickName);
        System.out.printf("공격자 남은체력: %d, 타겟 남은체력: %d\n",this.hp,targetPlayer.hp);

    }

}
