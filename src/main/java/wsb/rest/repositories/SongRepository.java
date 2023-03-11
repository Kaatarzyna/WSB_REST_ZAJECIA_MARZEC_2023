package wsb.rest.repositories;

import org.springframework.stereotype.Repository;
import wsb.rest.models.Song;

import java.util.LinkedList;
import java.util.List;

@Repository
public class SongRepository {

    private List<Song> songs = new LinkedList<>() {{
        add(new Song(1L, "Yellow", "Coldplay", 2005L));
        add(new Song(1L, "Nowa piosenka", "Najlepszy zespół", 2023L));
        add(new Song(1L, "Hit", "Zenek Martyniuk", 2024L));
    }};

    public List<Song> findAll() {
        return songs;
    }
}
