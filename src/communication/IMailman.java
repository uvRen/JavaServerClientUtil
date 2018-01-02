package communication;

import message.ISendableMessage;

/**
 * An interface for classes that prepares messages to be sent from/to server/client.
 * The class is then using an ISender interface to transmit the message 
 * @author Simon Berntsson
 *
 */
public interface IMailman {

    /**
     * Send a message to another client
     * @param msg Message to be sent
     * @param receiverClientId ID of the client that the message should be sent to
     */
    public void sendToClient(ISendableMessage msg, int receiverClientId);
    
    /**
     * Send a message to the server
     * @param msg Message to be sent
     */
    public void sendToServer(ISendableMessage msg);

    /**
     * Sets the client ID for the client that are using this IMailmain interface
     * @param id ID of the client
     */
    public void setClientId(int id);
    
    /**
     * Reads incoming messages from socket
     * @return Object read from socket
     */
    public Object readIncoming();
    
    /**
     * Initialize the streams between the server and client
     */
    public void setupCommunications();
}
