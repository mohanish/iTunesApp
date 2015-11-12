package itunes.com.core.csd.model;

import com.orm.SugarRecord;

/**
 * Created by root on 11/11/15.
 */
public class ContentTypeEntity extends SugarRecord<ContentTypeEntity> {

    /**
     * term : Application
     * label : Application
     */

    private AttributesEntity attributes;

    public void setAttributes(AttributesEntity attributes) {
        this.attributes = attributes;
    }

    public AttributesEntity getAttributes() {
        return attributes;
    }

    public static class AttributesEntity {

    }

}
