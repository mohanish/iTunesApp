package itunes.com.core.csd.model;

import com.orm.SugarRecord;

/**
 * Created by root on 11/11/15.
 */
public class ArtistEntity {

    private String label;
    /**
     * href : https://itunes.apple.com/us/developer/unroll.me/id1028103038?mt=8&uo=2
     */

    private ArtistAttributesEntity attributes;

    public void setLabel(String label) {
        this.label = label;
    }

    public void setAttributes(ArtistAttributesEntity attributes) {
        this.attributes = attributes;
    }

    public String getLabel() {
        return label;
    }

    public ArtistAttributesEntity getAttributes() {
        return attributes;
    }

    public static class ArtistAttributesEntity {
        private String href;

        public void setHref(String href) {
            this.href = href;
        }

        public String getHref() {
            return href;
        }
    }

}
