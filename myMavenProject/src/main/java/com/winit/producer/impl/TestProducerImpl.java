package com.winit.producer.impl;

import org.springframework.stereotype.Service;
import com.winit.producer.TestProducer;

/**
 * Created by xiangyu.liang on 2015/12/23.
 */
@Service(value = "TestProducerImpl")
public class TestProducerImpl implements TestProducer {
    @Override
    public String getName() {
        return "bored";
    }
}
