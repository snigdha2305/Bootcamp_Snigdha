package FunctionalInterface;

/**
 * Created by sahoos on 7/28/2017.
 */
public class MessageService {

    String[] messageTypes;

    public MessageService(String[] messageTypes) {
        this.messageTypes = messageTypes;
    }

    public void decideMessageType (Message msg) {
        for(String value : messageTypes) {
            msg.decide(value);
        }
    }
}
