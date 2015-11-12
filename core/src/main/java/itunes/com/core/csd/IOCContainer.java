package itunes.com.core.csd;

import java.util.WeakHashMap;

import itunes.com.core.csd.applestore.AppleStoreFacade;
import itunes.com.core.csd.applestore.IAppleStoreFacade;
import itunes.com.core.csd.application.ApplicationFacade;
import itunes.com.core.csd.application.IApplicationFacade;

/**
 * Created by Intelliswift on 6/16/2015.
 */

public class IOCContainer {

    public static String APPLE_STORE_URL;

    public ResponsePublisher publisher;

    private final static WeakHashMap<Integer, Object> objectContainer = new WeakHashMap<>();
    private static IOCContainer instance;

    private IOCContainer() {
        publisher = new ResponsePublisher();
    }

    public static IOCContainer getInstance() {

        if (instance == null) {
            instance = new IOCContainer();
        }
        return instance;
    }

    public IBaseFacade getObject(Integer name, String tag) {
        IBaseFacade object = (IBaseFacade) objectContainer.get(name);
        switch (name) {
            case ServiceName.APPLE_STORE_DATE_SERVICE:
                object = new AppleStoreFacade(publisher, (IApplicationFacade) getObject(ServiceName.APPLICATION_SERVICE, tag));
                break;

            case ServiceName.APPLICATION_SERVICE:
                object = new ApplicationFacade();
                break;
        }

        if (object != null) {
            object.setTag(tag);
        }
        return object;
    }
}
