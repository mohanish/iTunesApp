package itunes.com.itunesapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.orm.SugarApp;
import com.orm.SugarConfig;
import com.orm.SugarDb;
import com.orm.SugarRecord;
import com.orm.query.Select;

import java.util.List;

import itunes.com.core.csd.IOCContainer;
import itunes.com.core.csd.ServiceName;
import itunes.com.core.csd.applestore.IAppleStoreFacade;
import itunes.com.core.csd.model.LinkEntity;
import itunes.com.core.csd.model.NameEntity;
import itunes.com.core.csd.response.AppleStoreResponse;

/**
 * Created by root on 7/11/15.
 */
public class TabTwoFragment extends BaseFragment {

    final String TAG = "TabTwoFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tab_two, container, false);
        return rootView;
    }

    @Override
    public void onResume() {
        super.onResume();
        IOCContainer.getInstance().publisher.registerResponseSubscribe(this);
        ((IAppleStoreFacade) IOCContainer.getInstance().getObject(ServiceName.APPLE_STORE_DATE_SERVICE, TAG)).getAppleStoreData();
    }

    @Override
    public void onPause() {
        super.onPause();
        IOCContainer.getInstance().publisher.unregisterResponseSubscribe(this);
    }

    @Override
    public void onSuccess(AppleStoreResponse appleStoreResponse, String tag) {
        super.onSuccess(appleStoreResponse, tag);
        if (!tag.equals(TAG)) {
            return;
        }

        saveObjectsToDB(appleStoreResponse.getFeed().getAuthor());
//        saveListsToDB((List<SugarRecord>) appleStoreResponse.getFeed().getLink());
        saveObjectsToDB(appleStoreResponse.getFeed().getUpdated());
        saveObjectsToDB(appleStoreResponse.getFeed().getRights());
        saveObjectsToDB(appleStoreResponse.getFeed().getTitle());
        saveObjectsToDB(appleStoreResponse.getFeed().getIcon());
        saveObjectsToDB(appleStoreResponse.getFeed().getIdEntity());

    }

    @Override
    public void onFailure(Exception error) {
        super.onFailure(error);
    }

    void saveObjectsToDB(SugarRecord sugarEntity) {
        sugarEntity.save();
    }

    void saveListsToDB(List<SugarRecord> sugarEntityList) {
        for (SugarRecord entityList : sugarEntityList) {
            entityList.save();
        }
    }

}
