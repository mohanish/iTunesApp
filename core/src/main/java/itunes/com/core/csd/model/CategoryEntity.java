package itunes.com.core.csd.model;

import com.orm.SugarRecord;

/**
 * Created by root on 11/11/15.
 */
public class CategoryEntity  extends SugarRecord<CategoryEntity> {
    /**
     * im:id : 6007
     * term : Productivity
     * scheme : https://itunes.apple.com/us/genre/ios-productivity/id6007?mt=8&uo=2
     * label : Productivity
     */

    private AttributesEntity attributes;

    public void setAttributes(AttributesEntity attributes) {
        this.attributes = attributes;
    }

    public AttributesEntity getAttributes() {
        return attributes;
    }

}
