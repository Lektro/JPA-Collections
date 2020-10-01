package be.vdab.music;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table (name ="ALBUMS", uniqueConstraints = {@UniqueConstraint(columnNames ="id")})
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;

    @Column(name="TITLE")
    private String title;

    @Column(name="AUTHOR")
    private String author;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name ="trackTitle", column = @Column(name = "TRACK_TITLE"))
    })

    @ElementCollection
    @Column(name="TRACKS")
    @CollectionTable()
    private List<String> tracks = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<String> getTracks() {
        return tracks;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Album)) return false;
        Album album = (Album) o;
        return getId() == album.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
