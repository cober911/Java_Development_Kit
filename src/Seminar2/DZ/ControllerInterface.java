package Seminar2.DZ;

import Seminar2.DZ.client.ClientObserver;
import Seminar2.DZ.sender.ReceiverObserver;

public interface ControllerInterface {
    void startServer();
    void stopServer();
    void pushMessage(String message);
    boolean isServerWorking();
    void write(String message);
    String read();
    void registerClientOnServer(ClientObserver observer);
    void registerSendingMessages(ReceiverObserver observer);
}

