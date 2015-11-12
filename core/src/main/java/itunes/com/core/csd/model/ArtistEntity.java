package itunes.com.core.csd.model;

import com.orm.SugarRecord;

/**
 * Created by root on 11/11/15.
 */
public class ArtistEntity extends SugarRecord<ArtistEntity>{

    private String label;
    /**
     * href : https://itunes.apple.com/us/developer/unroll.me/id1028103038?mt=8&uo=2
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
