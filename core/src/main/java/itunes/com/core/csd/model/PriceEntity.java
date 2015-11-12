package itunes.com.core.csd.model;

import com.orm.SugarRecord;

/**
 * Created by root on 11/11/15.
 */
public class PriceEntity extends SugarRecord<PriceEntity> {

    private String label;
    /**
     * amount : 0.00000
     * currency : USD
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
