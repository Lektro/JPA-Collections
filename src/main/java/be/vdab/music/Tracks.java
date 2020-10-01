package be.vdab.music;

import javax.persistence.Embeddable;

@Embeddable
public class Tracks {

    private int albumId;
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
