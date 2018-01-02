package communication;

import java.io.ObjectInputStream;

import message.ISendableMessage;

/**
 * An interface used for classes that is handling the actual communication
 * between server and client
 * @author Simon Berntsson
 *
 */
public interface ISender {

    /**
     * Sends a message to the server
     * @param msg Message to be sent
     */
    public void send(ISendableMessage msg);

    /**
     * Initialize the streams between the server and client
     */
    public void setupCommunications();

    /**
     * Gets the ObjectInputStream object. <b>(Only implemented in ObjectSender-class)</b>
     * @return ObjectInputStream object
     */
    public ObjectInputStream getObjectInputStream();
    
}
