package identification;

import java.io.Serializable;

import identification.Identification.ID;

public class Sender implements Serializable {

    private ID sender;
    private int id;
    
    public Sender(ID sender) {
        this.sender = sender;
        this.id = -1;
    }
    
    public Sender(ID sender, int id) {
        this.sender = sender;
        this.id = id;
    }
    
    public ID getSender() {
        return this.sender;
    }
    
    public int getSenderId() {
        return this.id;
    }
}
