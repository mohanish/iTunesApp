package itunes.com.core.csd.request;

import itunes.com.core.csd.response.AppleStoreResponse;
import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by root on 7/11/15.
 */
public class AppleStoreRequestBuilder extends RetroRequestBuilder {

    public AppleStoreService getService() {

        return super.build().create(AppleStoreService.class);
    }

    public interface AppleStoreService {

        @GET("/topfreeapplications/sf=143441/limit=100/genre=6007/json")
        void topfreeapplications(Callback<AppleStoreResponse> callback);

    }

}
