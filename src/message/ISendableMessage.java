package message;

import identification.Receiver;
import identification.Sender;

public interface ISendableMessage {

    public Sender getSender();
    public Receiver getReceiver();
    public String getMessage();
    public String getType();
    
    public void setSender(Sender sender);
    public void setReceiver(Receiver receiver);
    
}
