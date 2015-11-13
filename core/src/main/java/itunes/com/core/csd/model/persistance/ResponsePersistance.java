package itunes.com.core.csd.model.persistance;

import com.orm.SugarRecord;

/**
 * Created by root on 13/11/15.
 */
public class ResponsePersistance extends SugarRecord<ResponsePersistance> {

    private String objectJson;

    public ResponsePersistance(String objectJson) {
        this.objectJson = objectJson;
    }

    public String getObjectJson() {
        return objectJson;
    }

    public void setObjectJson(String objectJson) {
        this.objectJson = objectJson;
    }
}
