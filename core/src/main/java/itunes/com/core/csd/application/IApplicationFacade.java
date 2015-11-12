package itunes.com.core.csd.application;

import itunes.com.core.csd.IBaseFacade;

/**
 * Created by Intelliswift on 6/18/2015.
 */
public interface IApplicationFacade extends IBaseFacade {

    void setResponse(String key, Object value);

    Object getResponse(String key);

}
