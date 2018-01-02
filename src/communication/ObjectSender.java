package communication;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import message.ISendableMessage;

public class ObjectSender implements ISender {
    
    protected Socket socket;
    protected ObjectOutputStream output;
    protected ObjectInputStream input;
    
    public ObjectSender(Socket socket) {
        this.socket = socket;
    }
    
    @Override
    public ObjectInputStream getObjectInputStream() {
        return this.input;
    }

    @Override
    public void send(ISendableMessage msg) {
        try {
            output.writeObject(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void setupCommunications() {
        try {
            this.output = new ObjectOutputStream(socket.getOutputStream());
            this.input = new ObjectInputStream(socket.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
