package com.zzp.springinaction;

import com.zzp.springinaction.autoassemble.CDPlayer;
import com.zzp.springinaction.autoassemble.CDPlayerConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
    @Autowired
    private CDPlayer cdPlayer;

    @Test
    public void cdShoudNotBeNull() {
        assertNotNull(cdPlayer);
    }


}