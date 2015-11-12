package itunes.com.core.csd;

import itunes.com.core.csd.application.IApplicationFacade;

/**
 * Created by Intelliswift on 6/23/2015.
 */

public class BaseFacade implements IBaseFacade {

    protected final IResponseSubscribe mResponseSubscribe;
    protected String TAG;

    public BaseFacade(IResponseSubscribe responseSubscribe, IApplicationFacade appleStoreFacade) {
        this.mResponseSubscribe = responseSubscribe;
    }


    @Override
    public void setTag(String tag) {
        TAG = tag;
    }
}
