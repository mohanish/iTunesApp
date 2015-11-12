package itunes.com.core.csd.model;

import com.orm.SugarRecord;

/**
 * Created by root on 11/11/15.
 */
public class ImageEntity extends SugarRecord<ImageEntity> {

    private String label;
    /**
     * height : 53
     */

    private AttributesEntity attributes;

    public void setLabel(String label) {
        this.label = label;
    }

    public void setAttributes(AttributesEntity attributes) {
        this.attributes = attributes;
    }

    public String getLabel() {
        return label;
    }

    public AttributesEntity getAttributes() {
        return attributes;
    }

}
