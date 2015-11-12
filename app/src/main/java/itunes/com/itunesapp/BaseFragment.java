package itunes.com.itunesapp;

import android.support.v4.app.Fragment;

import itunes.com.core.csd.IResponseSubscribe;
import itunes.com.core.csd.response.AppleStoreResponse;

/**
 * Created by Mohanish on 7/30/2015.
 */
public class BaseFragment extends Fragment implements IResponseSubscribe {

    public BaseFragment() {
    }


    @Override
    public void onSuccess(AppleStoreResponse appleStoreResponse, String tag) {

    }

    @Override
    public void onFailure(Exception error) {

    }
}
