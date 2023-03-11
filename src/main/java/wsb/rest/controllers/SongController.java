package wsb.rest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import wsb.rest.models.Song;
import wsb.rest.repositories.SongRepository;
import wsb.rest.services.SongService;

import java.util.List;

@RestController
public class SongController {

    final private SongService songService;

    public SongController(SongService songService) {
        this.songService = songService;
    }

    @GetMapping("/songs")
    List<Song> findAll() {
        return songService.findAll();
    }


}
