package itunes.com.core.csd.model;

import com.orm.SugarRecord;

/**
 * Created by root on 11/11/15.
 */
public class AuthorEntity extends SugarRecord<AuthorEntity> {

    /**
     * label : iTunes Store
     */

    private NameEntity name;
    /**
     * label : http://www.apple.com/itunes/
     */

    private UriEntity uri;

    public void setName(NameEntity name) {
        this.name = name;
    }

    public void setUri(UriEntity uri) {
        this.uri = uri;
    }

    public NameEntity getName() {
        return name;
    }

    public UriEntity getUri() {
        return uri;
    }

}
