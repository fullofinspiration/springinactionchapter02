package com.zzp.springinaction.autoassemble;

import org.springframework.stereotype.Component;

@Component("longHeartsClub")
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Betales";

    @Override
    public void play() {
        System.out.println("Playing" + title + "by" + artist);
    }
}
