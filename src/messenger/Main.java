package messenger;

public class Main {
    public static void main(String[] args) {

        Messenger user = new User("홍길동");

        Messenger admin = new Admin("관리자");
        MessageRelay messageRelay = new MessageRelay();

        messageRelay.relay(user,"안녕하세요");
        messageRelay.relay(admin,"안녕하세요");

        user.sendMessage("안녕하세요");
        admin.sendMessage("안녕하세요");


    }
}
