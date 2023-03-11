package wsb.rest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import wsb.rest.models.Song;
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

    @GetMapping("/songs/{id}")
    ResponseEntity<Song> find(@PathVariable Long id) {
        Song song = songService.find(id);
        if (song != null) {
            return ResponseEntity.ok(song);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }


}
