package itunes.com.core.csd.model;

import com.google.gson.annotations.SerializedName;
import com.orm.SugarRecord;

/**
 * Created by root on 11/11/15.
 */
public class CategoryEntity {
    /**
     * im:id : 6007
     * term : Productivity
     * scheme : https://itunes.apple.com/us/genre/ios-productivity/id6007?mt=8&uo=2
     * label : Productivity
     */

    private CategoryAttributesEntity attributes;

    public void setAttributes(CategoryAttributesEntity attributes) {
        this.attributes = attributes;
    }

    public CategoryAttributesEntity getAttributes() {
        return attributes;
    }

    public static class CategoryAttributesEntity {

        @SerializedName("im:id")
        private String imid;
        private String scheme;
        private String term;
        private String label;


        public void setImid(String imid) {
            this.imid = imid;
        }

        public String getImid() {
            return imid;
        }

        public void setScheme(String scheme) {
            this.scheme = scheme;
        }

        public String getScheme() {
            return scheme;
        }

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
