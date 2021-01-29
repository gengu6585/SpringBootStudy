package com.zwj.git_springboot_study;

import com.zwj.git_springboot_study.cglibStudy.SayHello;
import com.zwj.git_springboot_study.cglibStudy.SayHelloIml;
import com.zwj.git_springboot_study.cglibStudy.SayHelloProxy;
import net.sf.cglib.proxy.Enhancer;

/**
 * @Author:zengwenjie
 * @Date:2021/1/28 14:47
 */
public class Test {
//    @org.junit.jupiter.api.Test
//    public void test1() {
//        SayHelloProxy sayHelloProxy = new SayHelloProxy();
//        Enhancer enhancer = new Enhancer();
//        enhancer.setSuperclass(SayHelloIml.class);
//        enhancer.setCallback(sayHelloProxy);
//        SayHello sayHello = (SayHello) enhancer.create();
//        sayHello.sayHello();
//
//    }
}
