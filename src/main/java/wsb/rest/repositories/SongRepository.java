package wsb.rest.repositories;

import org.springframework.stereotype.Repository;
import wsb.rest.models.Song;

import java.util.LinkedList;
import java.util.List;

@Repository
public class SongRepository {

    static Long currentId = 4L;

    private List<Song> songs = new LinkedList<>() {{
        add(new Song(1L, "Yellow", "Coldplay", 2005L));
        add(new Song(2L, "Nowa piosenka", "Najlepszy zespół", 2023L));
        add(new Song(3L, "Hit", "Zenek Martyniuk", 2024L));
    }};

    public List<Song> findAll() {
        return songs;
    }

    public Song find(Long id) {
        return songs.stream()
                .filter(song -> song.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Song create(Song song) {
        Song createdSong = new Song(
                currentId++,
                song.getTitle(),
                song.getAuthor(),
                song.getYear()
        );

        songs.add(createdSong);
        return createdSong;
    }

    public Song update(Long id, Song song) {
        Song songToUpdate = find(id);
        if (songToUpdate == null) {
            return null;
        }

        songToUpdate.setTitle(song.getTitle());
        songToUpdate.setAuthor(song.getAuthor());
        songToUpdate.setYear(song.getYear());

        return songToUpdate;
    }
}
