package itunes.com.core.csd.model;

import com.orm.SugarRecord;

/**
 * Created by root on 11/11/15.
 */
public class ContentTypeEntity {

    /**
     * term : Application
     * label : Application
     */

    private ConentTypeAttributesEntity attributes;

    public void setAttributes(ConentTypeAttributesEntity attributes) {
        this.attributes = attributes;
    }

    public ConentTypeAttributesEntity getAttributes() {
        return attributes;
    }

    public static class ConentTypeAttributesEntity {
        // Attributes used in ContentType Entity
        private String term;
        private String label;

        public void setTerm(String term) {
            this.term = term;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getTerm() {
            return term;
        }

        public String getLabel() {
            return label;
        }
    }
}
