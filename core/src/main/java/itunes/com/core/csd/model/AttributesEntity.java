package itunes.com.core.csd.model;

import com.google.gson.annotations.SerializedName;
import com.orm.SugarRecord;

/**
 * Created by root on 11/11/15.
 */
public class AttributesEntity extends SugarRecord<AttributesEntity> {

    private String rel;
    private String type;
    private String href;

    // Attributes used in Images Entity
    private String height;

    // Attributes used in Category Entity
    @SerializedName("im:id")
    private String imid;
    private String scheme;

    // Attributes used in Price Entity
    private String amount;
    private String currency;

    // Attributes used in ContentType Entity
    private String term;
    private String label;

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

    public void setHeight(String height) {
        this.height = height;
    }

    public String getHeight() {
        return height;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
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
