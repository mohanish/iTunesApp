package itunes.com.core.csd.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import com.orm.SugarRecord;

/**
 * Created by root on 7/11/15.
 */
public class EntryEntity {


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

    /**
     * label : Unroll.Me
     */

    @SerializedName("im:name")
    private NameEntity name;

    /**
     * label : http://is3.mzstatic.com/image/thumb/Purple6/v4/a8/23/82/a82382bc-23da-175c-031f-871f9725e94e/pr_source.png/53x53bb-85.png
     * attributes : {"height":"53"}
     */

    @SerializedName("im:image")
    private List<ImageEntity> image;

    /**
     * label : Decluttering your inbox has never been so easy, or looked so good. With Unroll.Me, you can unsubscribe from unwanted emails, consolidate sales/newsletters/listserv emails into a convenient daily digest called the Rollup, and keep the rest in your inbox.
     * <p/>
     * Stop stressing over your inbox and get back to spending time on what matters to you. Download Unroll.Me and get back the “you time” you’ve been missing.
     * <p/>
     * • Unsubscribe
     * Swipe left to unsubscribe from the email subscriptions you don’t want. No future emails from these senders will land in your inbox.
     * <p/>
     * • Rollup
     * Swipe up to roll up the email subscriptions you want into a daily digest, the Rollup. All future emails from these senders will bypass your inbox and be included in your daily Rollup digest.
     * <p/>
     * • Keep
     * Swipe right to keep the email subscriptions you want right in your inbox. These emails will continue to land directly in your inbox.
     * <p/>
     * • Managing your subscriptions
     * Easily manage your email subscriptions by swiping left to unsubscribe, up to roll up and right to keep. If swiping isn’t your thing, you can also tap the button below the email corresponding to the action you wish to take. You can re-edit your email subscriptions in the edit tab by tapping on them to view the editing options.
     * <p/>
     * • The Rollup
     * The Rollup is a once-daily digest containing all of the rolled up email subscriptions you receive and will be delivered each day at the time of your choosing: morning, afternoon, or evening.
     * <p/>
     * • Multiple accounts
     * Switch between multiple email accounts easily in the Settings.
     * <p/>
     * Unroll.Me currently supports Gmail, Google Apps, Yahoo! Mail, AOL, iCloud, and Outlook.com accounts.
     */

    private SummaryEntity summary;

    /**
     * label : Get
     * attributes : {"amount":"0.00000","currency":"USD"}
     */

    @SerializedName("im:price")
    private PriceEntity price;

    /**
     * attributes : {"term":"Application","label":"Application"}
     */

    @SerializedName("im:contentType")
    private ContentTypeEntity contentType;

    /**
     *
     */

    private RightsEntity rights;

    /**
     *
     */

    private TitleEntity title;

    /**
     *
     */

    private LinkEntity link;

    /**
     *
     */

    private IdEntity id;

    /**
     * label : Unroll.Me
     * attributes : {"href":"https://itunes.apple.com/us/developer/unroll.me/id1028103038?mt=8&uo=2"}
     */
    @SerializedName("im:artist")
    private ArtistEntity artist;

    /**
     * attributes : {"im:id":"6007","term":"Productivity","scheme":"https://itunes.apple.com/us/genre/ios-productivity/id6007?mt=8&uo=2","label":"Productivity"}
     */

    private CategoryEntity category;

    /**
     * label : 2015-11-04T15:39:07-07:00
     * attributes : {"label":"November 4, 2015"}
     */

    @SerializedName("im:release")
    private ReleaseDateEntity releaseDate;


    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    public IdEntity getIdEntity() {
        return id;
    }

    public void setIdEntity(IdEntity id) {
        this.id = id;
    }

    public LinkEntity getLink() {
        return link;
    }

    public void setLink(LinkEntity link) {
        this.link = link;
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

    public void setName(NameEntity name) {
        this.name = name;
    }

    public NameEntity getName() {
        return name;
    }

    public void setSummary(SummaryEntity summary) {
        this.summary = summary;
    }

    public SummaryEntity getSummary() {
        return summary;
    }

    public void setImage(List<ImageEntity> image) {
        this.image = image;
    }

    public List<ImageEntity> getImage() {
        return image;
    }

    public void setPrice(PriceEntity price) {
        this.price = price;
    }

    public PriceEntity getPrice() {
        return price;
    }

    public void setContentType(ContentTypeEntity contentType) {
        this.contentType = contentType;
    }

    public ContentTypeEntity getContentType() {
        return contentType;
    }

    public void setArtist(ArtistEntity artist) {
        this.artist = artist;
    }

    public ArtistEntity getArtist() {
        return artist;
    }

    public void setReleaseDate(ReleaseDateEntity releaseDate) {
        this.releaseDate = releaseDate;
    }

    public ReleaseDateEntity getReleaseDate() {
        return releaseDate;
    }

}
