package message;

import java.io.Serializable;

/**
 * This class in intended to be used when a client connect to the
 * server. The message should contain data that the new client should
 * be aware of. For example the server could assign a client an unique id.
 * @author Simon Berntsson
 *
 */
public class NewClientMessage implements Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = -3796807017724815475L;
    
    private int clientId;
    
    public NewClientMessage(int clientId) {
        this.clientId = clientId;
    }
    
    public int getClientId() {
        return this.clientId;
    }
}
