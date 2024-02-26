package Seminar2.DZ.sender;

public interface SenderObservable {
    void registerObserver(ReceiverObserver observer);
    void notifyReceiverMessageObservers();
    
    void pushMessage(String message);
    
}

