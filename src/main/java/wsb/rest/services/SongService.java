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
}
