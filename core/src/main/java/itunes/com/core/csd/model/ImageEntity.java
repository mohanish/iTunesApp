package itunes.com.core.csd.model;

import com.orm.dsl.Ignore;

/**
 * Created by root on 11/11/15.
 */
public class ImageEntity {

    private String label;
    /**
     * height : 53
     */
    @Ignore
    private ImagesAttributesEntity attributes;

    public void setLabel(String label) {
        this.label = label;
    }

    public void setAttributes(ImagesAttributesEntity attributes) {
        this.attributes = attributes;
    }

    public String getLabel() {
        return label;
    }

    public ImagesAttributesEntity getAttributes() {
        return attributes;
    }

    public static class ImagesAttributesEntity {
        // Attributes used in Images Entity
        private String height;

        public void setHeight(String height) {
            this.height = height;
        }

        public String getHeight() {
            return height;
        }
    }

}
