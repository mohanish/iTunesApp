package itunes.com.core.csd.model;

import com.orm.SugarRecord;

/**
 * Created by root on 11/11/15.
 */
public class ReleaseDateEntity extends SugarRecord<ReleaseDateEntity> {

    private String label;
    /**
     * label : November 4, 2015
     */

    private ReleaseDateAttributesEntity attributes;

    public void setLabel(String label) {
        this.label = label;
    }

    public void setAttributes(ReleaseDateAttributesEntity attributes) {
        this.attributes = attributes;
    }

    public String getLabel() {
        return label;
    }

    public ReleaseDateAttributesEntity getAttributes() {
        return attributes;
    }

    public static class ReleaseDateAttributesEntity {
        private String label;

        public void setLabel(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }


}
