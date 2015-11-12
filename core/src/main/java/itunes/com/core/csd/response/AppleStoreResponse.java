package itunes.com.core.csd.response;

import itunes.com.core.csd.model.FeedEntity;

/**
 * Created by root on /11/15.
 */
public class AppleStoreResponse {

    private FeedEntity feed;

    public FeedEntity getFeed() {
        return feed;
    }

    public void setFeed(FeedEntity feed) {
        this.feed = feed;
    }

}
