package itunes.com.core.csd.model;

import com.orm.SugarRecord;

/**
 * Created by root on 11/11/15.
 */
public class LinkEntity extends SugarRecord<LinkEntity> {

    /**
     * rel : alternate
     * type : text/html
     * href : https://itunes.apple.com/WebObjects/MZStore.woa/wa/viewTop?cc=us&id=25244&popId=27
     */

    private AttributesEntity attributes;

    public void setAttributes(AttributesEntity attributes) {
        this.attributes = attributes;
    }

    public AttributesEntity getAttributes() {
        return attributes;
    }

}
