package message;

import java.io.Serializable;

import identification.Identification.ID;
import identification.Receiver;
import identification.Sender;

public class DefaultMessage implements Serializable, ISendableMessage {

    /**
     * 
     */
    private static final long serialVersionUID = 243350683684412085L;

    private Sender sender;
    private Receiver receiver;
    private String message;
    
    public DefaultMessage(String message, Sender sender, Receiver receiver) {
        this.message = message;
        this.sender = sender;
        this.receiver = receiver;
    }
    
    public DefaultMessage(String message) {
        this.message = message;
        this.sender = null;
        this.receiver = null;
    }
    
    public String getMessage() {
        return this.message;
    }
    
    public Sender getSender() {
        return this.sender;
    }
    
    public Receiver getReceiver() {
        return this.receiver;
    }
    
    public String getType() {
        return "DefaultMessage";
    }

    @Override
    public void setSender(Sender sender) {
        this.sender = sender;
    }

    @Override
    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }
}
