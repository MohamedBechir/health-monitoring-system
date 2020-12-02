package com.hms.facade;

import com.hms.composite.MusicItem;
import com.hms.composite.PlayList;
import com.hms.composite.Track;

public class ServicesFacade {

    private ServicesFacade(){}

    private static ServicesFacade instance = null;
    private static final MusicItem musicItem = new PlayList("Main List");

    public static ServicesFacade getInstance() {
        if (instance == null) {
           instance = new ServicesFacade();
        }
        return instance;
    }

    public void buildMusicList() {
        // Create an PlayList.
        PlayList rock = new PlayList("Rock");
        PlayList uTwoAlbum = new PlayList("U2Album");

        uTwoAlbum.add(new Track("California"));
        uTwoAlbum.add(new Track("Iris"));
        uTwoAlbum.add(new Track("Cedarwood Road"));

        rock.add(new Track("Indie Rokkers"));
        rock.add(uTwoAlbum);

        musicItem.add(rock);

    }

    public void browseMI() {
        musicItem.browse();
    }
}
