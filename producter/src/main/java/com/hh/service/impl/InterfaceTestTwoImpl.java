package com.hh.service.impl;

import com.hh.service.InterfaceTest;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 15-12-21.
 */
@Service("groupTestTwo")
public class InterfaceTestTwoImpl implements InterfaceTest {
    @Override
    public String say(String name) {
        return "我是GroupTest接口实现类2，收到你的数据："+name;
    }
}
