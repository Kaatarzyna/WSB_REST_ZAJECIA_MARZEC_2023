package wsb.rest.services;

import org.springframework.stereotype.Service;
import wsb.rest.models.Song;
import wsb.rest.repositories.SongRepository;

import java.util.List;

@Service
public class SongService {
    final private SongRepository songRepository;

    public SongService(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public List<Song> findAll() {
        return songRepository.findAll();
    }

    public Song find(Long id) {
        return songRepository.find(id);
    }

    public Song create(Song song) {
        return songRepository.create(song);
    }

    public Song update(Long id, Song song) {
        return songRepository.update(id, song);
    }

    public void delete(Long id) {
        songRepository.delete(id);
    }
}
