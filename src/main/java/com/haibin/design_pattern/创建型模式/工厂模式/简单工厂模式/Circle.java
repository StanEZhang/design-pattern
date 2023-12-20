package com.haibin.design_pattern.创建型模式.工厂模式.简单工厂模式;

/**
 * @project: design-pattern
 * @className: Circle
 * @description:
 * @author: zhanghaibin
 * @create: 2023-12-18
 */
public class Circle implements Shape {
    public Circle() {
        System.out.println("创造一个圈！");
    }

    @Override
    public void draw() {
        System.out.println("画一个圈！");
    }
}
