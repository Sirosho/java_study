package messenger;

public class MessageRelay {


    public void relay(Messenger sender,String message){

        sender.sendMessage(message);
    }
}
