package identification;

import java.io.Serializable;

import identification.Identification.ID;

public class Receiver implements Serializable {

    private ID receiver;
    private int id;
    
    public Receiver(ID receiver) {
        this.receiver = receiver;
        this.id = -1;
    }
    
    public Receiver(ID receiver, int id) {
        this.receiver = receiver;
        this.id = id;
    }
    
    public ID getReceiver() {
        return this.receiver;
    }
    
    public int getReceiverId() {
        return this.id;
    }
}
