package be.vdab.music;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class SaveAlbum {
    public static void main(String[] args) {
        EntityManagerFactory emf = null;
        EntityManager em = null;

        try {
            emf = Persistence.createEntityManagerFactory("create");
            em = emf.createEntityManager();
            EntityTransaction tx = em.getTransaction();
            tx.begin();
            Album albumOne = new Album();

            albumOne.setTitle("See Without Eyes");
            albumOne.setAuthor("The Glitch Mob");

            Tracks tracksAlbumOne = new Tracks();
            tracksAlbumOne.setTrackTitle("Enter Formless");
            tracksAlbumOne.setTrackTitle("Take Me With You");
            tracksAlbumOne.setTrackTitle("Disintegrate Slowly");
            tracksAlbumOne.setTrackTitle("Keep On Breathing");


            em.persist(albumOne);
            tx.commit();
            System.out.println("Album Saved Saved");

        } finally {
            if (em != null)
                em.close();
            if (emf != null)
                emf.close();
        }
    }
}
