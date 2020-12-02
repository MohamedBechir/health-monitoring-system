package com.hms.composite;

import java.util.ArrayList;
import java.util.List;

public class Album extends MusicItem {

    List<MusicItem> musicItemList = new ArrayList<MusicItem>();

    @Override
    public void browse() {
        this.musicItemList.forEach(MusicItem::browse);
    }

    @Override
    public void add(MusicItem musicItem) {
        this.musicItemList.add(musicItem);
    }

    @Override
    public void remove(MusicItem musicItem) {
        this.musicItemList.remove(musicItem);
    }
}
