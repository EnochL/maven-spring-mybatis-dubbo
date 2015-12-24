package com.winit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by xiangyu.liang on 2015/12/23.
 */
@ContextConfiguration(locations={"/applicationContext-producer.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class StartProducer {
    @Test
    public void start()
    {
        try {
            Thread.sleep(600000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
