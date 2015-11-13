package itunes.com.core.csd.model;

import com.google.gson.annotations.SerializedName;
import com.orm.SugarRecord;

/**
 * Created by root on 11/11/15.
 */
public class IdEntity extends SugarRecord<IdEntity> {

    private String label;

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    private IdAttributesEntity attributes;

    public void setIdAttributesEntity(IdAttributesEntity idAttributesEntity) {
        attributes = idAttributesEntity;
    }

    public IdAttributesEntity getAttributes() {
        return attributes;
    }

    public static class IdAttributesEntity {
        // Attributes used in Category Entity
        @SerializedName("im:id")
        private String imid;
        private String scheme;

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
    }
}
