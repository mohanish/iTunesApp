package itunes.com.core.csd;

import itunes.com.core.csd.response.AppleStoreResponse;

public interface IResponseSubscribe {

    void onSuccess(AppleStoreResponse appleStoreResponse, String tag);

    void onFailure(Exception error);


}
