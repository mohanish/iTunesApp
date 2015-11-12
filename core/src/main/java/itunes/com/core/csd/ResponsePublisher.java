package itunes.com.core.csd;

import java.util.concurrent.CopyOnWriteArrayList;

import itunes.com.core.csd.response.AppleStoreResponse;

public class ResponsePublisher implements IResponseSubscribe {

    private final CopyOnWriteArrayList<IResponseSubscribe> responseObservers;

    public ResponsePublisher() {
        responseObservers = new CopyOnWriteArrayList<>();
    }

    public void registerResponseSubscribe(IResponseSubscribe responseObserver) {
        if (!responseObservers.contains(responseObserver)) {
            responseObservers.add(responseObserver);
        }

    }

    public void unregisterResponseSubscribe(IResponseSubscribe responseObserver) {
        responseObservers.remove(responseObserver);
    }

    @Override
    public void onSuccess(AppleStoreResponse appleStoreResponse, String tag) {
        System.err.println("ResponsePublisher.onResponse()");

        for (IResponseSubscribe observer : responseObservers) {
            observer.onSuccess(appleStoreResponse, tag);
        }
    }

    @Override
    public void onFailure(Exception error) {
        System.err.println("ResponsePublisher.onErrorResponse()");

        for (IResponseSubscribe observer : responseObservers) {
            observer.onFailure(error);
        }
    }

}
