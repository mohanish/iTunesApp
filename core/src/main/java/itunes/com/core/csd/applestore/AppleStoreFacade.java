package itunes.com.core.csd.applestore;

import itunes.com.core.csd.BaseFacade;
import itunes.com.core.csd.IResponseSubscribe;
import itunes.com.core.csd.application.IApplicationFacade;
import itunes.com.core.csd.request.AppleStoreRequestBuilder;
import itunes.com.core.csd.response.AppleStoreResponse;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by Mohanish on 11/11/15.
 */
public class AppleStoreFacade extends BaseFacade implements IAppleStoreFacade {

    AppleStoreRequestBuilder appleStoreRequestBuilder;

    public AppleStoreFacade(IResponseSubscribe responseSubscribe, IApplicationFacade appleStoreFacade) {
        super(responseSubscribe, appleStoreFacade);
        appleStoreRequestBuilder = new AppleStoreRequestBuilder();
    }

    @Override
    public void getAppleStoreData() {
        appleStoreRequestBuilder.getService().topfreeapplications(new Callback<AppleStoreResponse>() {
            @Override
            public void success(AppleStoreResponse appleStoreResponse, Response response) {
                mResponseSubscribe.onSuccess(appleStoreResponse, TAG);
            }

            @Override
            public void failure(RetrofitError error) {
                mResponseSubscribe.onFailure(error);
            }
        });

    }
}
