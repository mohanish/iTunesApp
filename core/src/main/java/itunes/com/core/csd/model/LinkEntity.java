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

    private LinkAttributesEntity attributes;

    public void setAttributes(LinkAttributesEntity attributes) {
        this.attributes = attributes;
    }

    public LinkAttributesEntity getAttributes() {
        return attributes;
    }

    public static class LinkAttributesEntity {
        private String rel;
        private String type;
        private String href;

        public void setRel(String rel) {
            this.rel = rel;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setHref(String href) {
            this.href = href;
        }

        public String getRel() {
            return rel;
        }

        public String getType() {
            return type;
        }

        public String getHref() {
            return href;
        }

    }

}
