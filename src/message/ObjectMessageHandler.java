package message;

public class ObjectMessageHandler implements IMessageHandler {

    @Override
    public void handleMessage(Object input) {
        ISendableMessage msg = (ISendableMessage)input;
        switch(msg.getType()) {
        case "DefaultMessage":
            System.out.println("DefaultMessage");
            break;
        case "NewClientMessage":
            System.out.println("NewClientMessage");
            break;
        }
    }

}
