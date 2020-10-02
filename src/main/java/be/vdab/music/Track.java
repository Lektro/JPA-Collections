package be.vdab.music;

import javax.persistence.*;

/// one to many relation
//@Embeddable
public class Track {

    //@EmbeddedId
   // @Column(name="ALBUM_ID")
    private int albumId;
   @Column(name="TRACK_TITLE")
    private String trackTitle;

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public String getTrackTitle() {
        return trackTitle;
    }

    public void setTrackTitle(String trackTitle) {
        this.trackTitle = trackTitle;
    }
}
