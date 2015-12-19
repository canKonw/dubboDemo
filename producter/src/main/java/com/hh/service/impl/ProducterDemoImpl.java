package com.hh.service.impl;

import com.hh.service.ProducterDemo;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 15-12-19.
 */
@Service("producterDemo")
public class ProducterDemoImpl implements ProducterDemo {
    @Override
    public String saySomeThing(String say) {
        return "我收到了你的消息："+say;
    }
}
