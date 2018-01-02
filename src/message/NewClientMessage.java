package message;

import java.io.Serializable;
import identification.Receiver;
import identification.Sender;

/**
 * This class in intended to be used when a client connect to the
 * server. The message should contain data that the new client should
 * be aware of. For example the server could assign a client an unique id.
 * @author Simon Berntsson
 *
 */
public class NewClientMessage implements Serializable, ISendableMessage {
    
    /**
     * 
     */
    private static final long serialVersionUID = -3796807017724815475L;
    
    private Sender sender;
    private Receiver receiver;
    private Integer clientId;
    
    public NewClientMessage(int clientId, Sender sender, Receiver receiver) {
        this.clientId = clientId;
        this.sender = sender;
        this.receiver = receiver;
    }
    
    public NewClientMessage(int clientId) {
        this.clientId = clientId;
    }
    
    public Sender getSender() {
        return this.sender;
    }
    
    public Receiver getReceiver() {
        return this.receiver;
    }
    
    public String getMessage() {
        return this.clientId.toString();
    }
    
    public String getType() {
        return "NewClientMessage";
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
