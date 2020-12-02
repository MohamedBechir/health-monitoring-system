package com.hms.composite;

import java.util.ArrayList;
import java.util.List;

public class PlayList extends MusicItem {

    List<MusicItem> musicItemList = new ArrayList<MusicItem>();
    private String name;

    public PlayList(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void browse() {
        System.out.println();
        System.out.println("PlayList: "+ getName());
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
