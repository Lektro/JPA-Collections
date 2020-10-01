package be.vdab.music;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

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
            Tracks tracksAlbumOne = new Tracks();

            albumOne.setTitle("See Without Eyes");
            albumOne.setAuthor("The Glitch Mob");

            tracksAlbumOne.setTrackTitle("Enter Formless");
            tracksAlbumOne.setTrackTitle("Take Me With You");
            tracksAlbumOne.setTrackTitle("Disintegrate Slowly");
            tracksAlbumOne.setTrackTitle("Keep On Breathing");

            //em.persist(tracksAlbumOne);
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
