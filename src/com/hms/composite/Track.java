package com.hms.composite;

public class Track extends MusicItem{

    private String name;

    public Track(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void browse() {

    }

    @Override
    public void add(MusicItem musicItem) {}

    @Override
    public void remove(MusicItem musicItem) {}
}
