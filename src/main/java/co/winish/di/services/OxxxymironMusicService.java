package co.winish.di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("musicService")
@Profile("oxxxy")
public class OxxxymironMusicService implements MusicService {
    @Override
    public String getMusicGenre() {
        return "Rap is the real mvp";
    }
}
