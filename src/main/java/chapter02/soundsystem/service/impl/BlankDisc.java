package chapter02.soundsystem.service.impl;

import chapter02.soundsystem.service.CompactDisc;

import java.util.List;

public class BlankDisc implements CompactDisc {

    private String title;
    private String artlist;
    private List<String> tracks;

    public BlankDisc(String title, String artlist, List tracks) {
        this.title = title;
        this.artlist = artlist;
        this.tracks = tracks;
    }

    public BlankDisc(String title, String artlist) {
        this.title = title;
        this.artlist = artlist;
    }

    public BlankDisc() {
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtlist(String artlist) {
        this.artlist = artlist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    public void play() {
        System.out.printf("Playing " + title + " by " + artlist);
        for (String str : tracks) {
            System.out.printf("-Track:" + str);
        }
    }

    public void playTrack(int track) {

    }
}
