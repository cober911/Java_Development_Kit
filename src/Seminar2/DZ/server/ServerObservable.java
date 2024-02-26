package Seminar2.DZ.server;

import Seminar2.DZ.client.ClientObserver;

public interface ServerObservable {
    void registerObserver(ClientObserver observer);
    void removeObserver(ClientObserver observer);
    void notifyClientStatusObservers();

}


