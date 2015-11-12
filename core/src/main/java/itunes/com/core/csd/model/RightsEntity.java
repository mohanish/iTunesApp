package itunes.com.core.csd.model;

import com.orm.SugarRecord;

/**
 * Created by root on 11/11/15.
 */
public class RightsEntity extends SugarRecord<RightsEntity> {

    private String label;

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

}
