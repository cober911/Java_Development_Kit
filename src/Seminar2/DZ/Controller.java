package Seminar2.DZ;

import Seminar2.DZ.client.ClientObserver;
import Seminar2.DZ.logger.Logger;
import Seminar2.DZ.sender.ReceiverObserver;
import Seminar2.DZ.sender.SenderObservable;
import Seminar2.DZ.server.ServerModelInterface;
import Seminar2.DZ.server.ServerObservable;

public class Controller implements ControllerInterface {
    private final ServerModelInterface serverModel;
    private final SenderObservable senderModel;
    private final Logger logger = new Logger();
    
    
    
    public Controller(ServerModelInterface serverModel, SenderObservable sender) {
        this.serverModel = serverModel;
        this.senderModel = sender;
        this.serverModel.initialize();
        
    }

    @Override
    public void registerClientOnServer(ClientObserver observer) {
        ((ServerObservable) serverModel).registerObserver(observer);

    }

    @Override
    public void registerSendingMessages(ReceiverObserver observer) {
        senderModel.registerObserver(observer);
    }

    @Override
    public void startServer() {
        serverModel.run();
    }

    @Override
    public void stopServer() {
        serverModel.stop();
    }

    @Override
    public boolean isServerWorking() {
        return serverModel.isServerWorking();
    }

    @Override
    public void write(String message) {
        logger.write(message);
    }

    @Override
    public String read() {
        return logger.read();
    }

    @Override
    public void pushMessage(String message) {
        senderModel.pushMessage(message);
    }
    
    
}
