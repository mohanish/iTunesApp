package itunes.com.core.csd.model;

import com.orm.SugarRecord;

import java.util.List;

/**
 * Created by root on 7/11/15.
 */
public class FeedEntity {


    /**
     * im:name : {"label":"Unroll.Me"}
     * im:image : [{"label":"http://is3.mzstatic.com/image/thumb/Purple6/v4/a8/23/82/a82382bc-23da-175c-031f-871f9725e94e/pr_source.png/53x53bb-85.png","attributes":{"height":"53"}},{"label":"http://is5.mzstatic.com/image/thumb/Purple6/v4/a8/23/82/a82382bc-23da-175c-031f-871f9725e94e/pr_source.png/75x75bb-85.png","attributes":{"height":"75"}},{"label":"http://is3.mzstatic.com/image/thumb/Purple6/v4/a8/23/82/a82382bc-23da-175c-031f-871f9725e94e/pr_source.png/100x100bb-85.png","attributes":{"height":"100"}}]
     * summary : {"label":"Decluttering your inbox has never been so easy, or looked so good. With Unroll.Me, you can unsubscribe from unwanted emails, consolidate sales/newsletters/listserv emails into a convenient daily digest called the Rollup, and keep the rest in your inbox.\n\nStop stressing over your inbox and get back to spending time on what matters to you. Download Unroll.Me and get back the \u201cyou time\u201d you\u2019ve been missing.\n\n\u2022 Unsubscribe\nSwipe left to unsubscribe from the email subscriptions you don\u2019t want. No future emails from these senders will land in your inbox.\n\n\u2022 Rollup\nSwipe up to roll up the email subscriptions you want into a daily digest, the Rollup. All future emails from these senders will bypass your inbox and be included in your daily Rollup digest.\n\n\u2022 Keep\nSwipe right to keep the email subscriptions you want right in your inbox. These emails will continue to land directly in your inbox.\n\n\u2022 Managing your subscriptions\nEasily manage your email subscriptions by swiping left to unsubscribe, up to roll up and right to keep. If swiping isn\u2019t your thing, you can also tap the button below the email corresponding to the action you wish to take. You can re-edit your email subscriptions in the edit tab by tapping on them to view the editing options.\n\n\u2022 The Rollup\nThe Rollup is a once-daily digest containing all of the rolled up email subscriptions you receive and will be delivered each day at the time of your choosing: morning, afternoon, or evening.\n\n\u2022 Multiple accounts\nSwitch between multiple email accounts easily in the Settings.\n\nUnroll.Me currently supports Gmail, Google Apps, Yahoo! Mail, AOL, iCloud, and Outlook.com accounts."}
     * im:price : {"label":"Get","attributes":{"amount":"0.00000","currency":"USD"}}
     * im:contentType : {"attributes":{"term":"Application","label":"Application"}}
     * rights : {"label":"© 2015 Unroll.Me Inc."}
     * title : {"label":"Unroll.Me - Unroll.Me"}
     * link : {"attributes":{"rel":"alternate","type":"text/html","href":"https://itunes.apple.com/us/app/unroll.me/id1028103039?mt=8&uo=2"}}
     * id : {"label":"https://itunes.apple.com/us/app/unroll.me/id1028103039?mt=8&uo=2","attributes":{"im:id":"1028103039","im:bundleId":"com.unrollme.unrollapp"}}
     * im:artist : {"label":"Unroll.Me","attributes":{"href":"https://itunes.apple.com/us/developer/unroll.me/id1028103038?mt=8&uo=2"}}
     * category : {"attributes":{"im:id":"6007","term":"Productivity","scheme":"https://itunes.apple.com/us/genre/ios-productivity/id6007?mt=8&uo=2","label":"Productivity"}}
     * im:releaseDate : {"label":"2015-11-04T15:39:07-07:00","attributes":{"label":"November 4, 2015"}}
     */

    private List<EntryEntity> entry;
    /**
     * name : {"label":"iTunes Store"}
     * uri : {"label":"http://www.apple.com/itunes/"}
     */

    private AuthorEntity author;
    /**
     * label : 2015-11-06T22:29:39-07:00
     */

    private UpdatedEntity updated;
    /**
     * label : Copyright 2008 Apple Inc.
     */

    private RightsEntity rights;
    /**
     * label : iTunes Store: Top Free Applications in Productivity
     */

    private TitleEntity title;
    /**
     * label : http://itunes.apple.com/favicon.ico
     */

    private IconEntity icon;
    /**
     * label : http://ax.itunes.apple.com/WebObjects/MZStoreServices.woa/ws/RSS/topfreeapplications/sf=143441/limit=100/genre=6007/json
     */

    private IdEntity id;
    /**
     * attributes : {"rel":"alternate","type":"text/html","href":"https://itunes.apple.com/WebObjects/MZStore.woa/wa/viewTop?cc=us&id=25244&popId=27"}
     */

    private List<LinkEntity> link;

    public IdEntity getIdEntity() {
        return id;
    }

    public void setId(IdEntity id) {
        this.id = id;
    }

    public IconEntity getIcon() {
        return icon;
    }

    public void setIcon(IconEntity icon) {
        this.icon = icon;
    }

    public TitleEntity getTitle() {
        return title;
    }

    public void setTitle(TitleEntity title) {
        this.title = title;
    }

    public RightsEntity getRights() {
        return rights;
    }

    public void setRights(RightsEntity rights) {
        this.rights = rights;
    }

    public UpdatedEntity getUpdated() {
        return updated;
    }

    public void setUpdated(UpdatedEntity updated) {
        this.updated = updated;
    }

    public AuthorEntity getAuthor() {
        return author;
    }

    public void setAuthor(AuthorEntity author) {
        this.author = author;
    }

    public List<EntryEntity> getEntry() {
        return entry;
    }

    public void setEntry(List<EntryEntity> entry) {
        this.entry = entry;
    }

    public void setLink(List<LinkEntity> link) {
        this.link = link;
    }

    public List<LinkEntity> getLink() {
        return link;
    }
}
