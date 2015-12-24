package com.winit.consumer;

import org.springframework.stereotype.Component;
import com.winit.producer.TestProducer;

import javax.annotation.Resource;

/**
 * Created by xiangyu.liang on 2015/12/23.
 */
@Component(value = "consumer")
public class TestConsumer {
    @Resource(name = "RPCProducer")
    private TestProducer producer;

    public void consume()
    {
        System.out.println(producer.getName());
    }
}
