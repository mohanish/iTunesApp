package itunes.com.core.csd.application;

import itunes.com.core.csd.ApplicationObjectsCollectionPool;
import itunes.com.core.csd.BaseFacade;

/**
 * Created by Intelliswift on 6/18/2015.
 */
public class ApplicationFacade extends BaseFacade implements IApplicationFacade {

    public ApplicationFacade() {
        super(null, null);
    }

    @Override
    public Object getResponse(String key) {
        return ApplicationObjectsCollectionPool.getInstance().get(key);
    }

    @Override
    public void setResponse(String key, Object value) {
        ApplicationObjectsCollectionPool.getInstance().put(key, value);
    }

}
