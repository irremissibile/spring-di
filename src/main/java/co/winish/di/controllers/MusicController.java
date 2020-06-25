package co.winish.di.controllers;

import co.winish.di.services.MusicService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MusicController {
    private final MusicService musicService;

    public MusicController(@Qualifier("musicService") MusicService musicService) {
        this.musicService = musicService;
    }

    public String getBestGenre() {
        return musicService.getMusicGenre();
    }
}
