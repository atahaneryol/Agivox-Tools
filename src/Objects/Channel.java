package Objects;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Atahan-MSI on 6/3/2015.
 */
public class Channel {

    private String _id;
    private String _rev;
    private String sortOrderName;
    private String homelink;
    private String tempo;
    private String description;
    private String imagewidth;
    private String copyright;
    private String imageheight;
    private String rssUrl;
    private String title;
    private String rssName;
    private String imageurl;
    private String webMaster;
    private String imageDescription;
    private String managingEditor;
    private String phoneticName;
    private String imagetitle;
    private String error;
    private String reason;




    public Channel()
    {
        _id = "";
        _rev = "";
        //sortOrderName = "";
        //homelink = "";
        //tempo = "";
    }

    public Channel(String _id, String _rev, String sortOrderName,
                   String homelink, String tempo) {
        super();
        this._id = _id;
        this._rev = _rev;
        this.sortOrderName = sortOrderName;
        this.homelink = homelink;
        this.tempo = tempo;
    }

    public boolean isValid()
    {
        if(error != null)
        {
            if(error.equals("not_found"))
            {
                return false;
            }
            return false;
        }
        return true;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImagewidth() {
        return imagewidth;
    }

    public void setImagewidth(String imagewidth) {
        this.imagewidth = imagewidth;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getImageheight() {
        return imageheight;
    }

    public void setImageheight(String imageheight) {
        this.imageheight = imageheight;
    }

    public String getRssUrl() {
        return rssUrl;
    }

    public void setRssUrl(String rssUrl) {
        this.rssUrl = rssUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRssName() {
        return rssName;
    }

    public void setRssName(String rssName) {
        this.rssName = rssName;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getWebMaster() {
        return webMaster;
    }

    public void setWebMaster(String webMaster) {
        this.webMaster = webMaster;
    }

    public String getImageDescription() {
        return imageDescription;
    }

    public void setImageDescription(String imageDescription) {
        this.imageDescription = imageDescription;
    }

    public String getManagingEditor() {
        return managingEditor;
    }

    public void setManagingEditor(String managingEditor) {
        this.managingEditor = managingEditor;
    }

    public String getPhoneticName() {
        return phoneticName;
    }

    public void setPhoneticName(String phoneticName) {
        this.phoneticName = phoneticName;
    }

    public String getImagetitle() {
        return imagetitle;
    }

    public void setImagetitle(String imagetitle) {
        this.imagetitle = imagetitle;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_rev() {
        return _rev;
    }

    public void set_rev(String _rev) {
        this._rev = _rev;
    }
    public String getSortOrderName() {
        return sortOrderName;
    }

    public void setSortOrderName(String sortOrderName) {
        this.sortOrderName = sortOrderName;
    }

    public String getHomelink() {
        return homelink;
    }

    public void setHomelink(String homelink) {
        this.homelink = homelink;
    }

}
