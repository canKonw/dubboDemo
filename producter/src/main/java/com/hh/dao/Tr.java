package com.hh.dao;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 15-12-19.
 */
public class Tr {
        public static void main(String[] args) throws Exception {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:dubbo/dubbo-config.xml"});
            context.start();

            System.in.read(); // 按任意键退出

    }
}
