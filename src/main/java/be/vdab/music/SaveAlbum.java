package be.vdab.music;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

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
            List<String> tracks = new ArrayList<>();

            albumOne.setTitle("See Without Eyes");
            albumOne.setAuthor("The Glitch Mob");

            tracks.add(0, "Take Me With You");
            tracks.add(1,"Disintegrate Slowly");
            tracks.add(2, "Keep On Breathing");
            tracks.add(3,"Enter Formless");

            albumOne.setTracks(tracks);

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
