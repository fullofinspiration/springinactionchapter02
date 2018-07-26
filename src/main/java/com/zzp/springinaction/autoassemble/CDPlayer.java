package com.zzp.springinaction.autoassemble;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    @Autowired(required = false)
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }
     @Override
    public void play() {
        System.out.println("sjdkfsjkfjk");
    }
}
