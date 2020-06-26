package co.winish.di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("musicService")
@Primary
public class AliceCooperMusicService implements MusicService {
    @Override
    public String getMusicGenre() {
        return "Hard rock is for the boys, everything else is for the losers";
    }
}
