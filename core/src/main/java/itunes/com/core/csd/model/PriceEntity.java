package itunes.com.core.csd.model;

import com.orm.SugarRecord;

/**
 * Created by root on 11/11/15.
 */
public class PriceEntity {

    private String label;
    /**
     * amount : 0.00000
     * currency : USD
     */

    private PriceAttributesEntity attributes;

    public void setLabel(String label) {
        this.label = label;
    }

    public void setAttributes(PriceAttributesEntity attributes) {
        this.attributes = attributes;
    }

    public String getLabel() {
        return label;
    }

    public PriceAttributesEntity getAttributes() {
        return attributes;
    }

    public static class PriceAttributesEntity {
        // Attributes used in Price Entity
        private String amount;
        private String currency;

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
    }
}
