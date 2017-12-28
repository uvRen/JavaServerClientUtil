package message;

import java.io.Serializable;

public class DefaultMessage implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 243350683684412085L;

    private int senderId;
    private int receiverId;
    private String message;
    
    public DefaultMessage(String message) {
        this.message = message;
    }
    
    public String getMessage() {
        return this.message;
    }
    
}
