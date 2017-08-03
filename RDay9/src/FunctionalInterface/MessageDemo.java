package FunctionalInterface;

/**
 * Created by sahoos on 7/28/2017.
 */
public class MessageDemo {
    public static void main(String[] args) {
        String[] messaage = new String[] {"SMS","E-mail","Whatsapp","JMS"};

        MessageService ms = new MessageService(messaage);

        ms.decideMessageType((String value) -> {
            System.out.printf("Decide : %s%n",value);
        });
    }
}
