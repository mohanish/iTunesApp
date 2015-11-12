package itunes.com.core.csd.request;

import itunes.com.core.csd.IOCContainer;
import retrofit.RestAdapter;
import retrofit.RestAdapter.LogLevel;

public abstract class RetroRequestBuilder {

    private static RestAdapter restAdapter = null;

    protected RestAdapter build() {

        if (restAdapter == null) {
            restAdapter = new RestAdapter.Builder()
                    .setEndpoint(IOCContainer.APPLE_STORE_URL)
                    .setLogLevel(LogLevel.FULL)
                    .build();
        }
        return restAdapter;
    }
}
