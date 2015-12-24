package com.winit;

import com.winit.consumer.TestConsumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by xiangyu.liang on 2015/12/23.
 */
@ContextConfiguration(locations={"/applicationContext-consumer.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class CallConsumer {
    @Autowired
    private TestConsumer testConsumer;

    @Test
    public void  testDubbo(){
         testConsumer.consume() ;
    }
}
