package itunes.com.itunesapp;

import android.util.Log;

import com.orm.SugarApp;
import com.orm.SugarConfig;

import itunes.com.core.csd.IOCContainer;

/**
 * Created by root on 11/11/15.
 */
public class AppleStoreApplication extends SugarApp {

    @Override
    public void onCreate() {
        super.onCreate();

        IOCContainer.APPLE_STORE_URL = itunes.com.itunesapp.BuildConfig.ENV;
        Log.d("", "DB Name : " + SugarConfig.getDatabaseName(getApplicationContext()));

    }
}
