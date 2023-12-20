package com.haibin.design_pattern.创建型模式.工厂模式.简单工厂模式;

/**
 * @project: design-pattern
 * @className: Test
 * @description:
 * @author: zhanghaibin
 * @create: 2023-12-18
 */
public class Test {
    public static void main(String[] args) {
        Shape circle = SimpleFactory.create("circle");
        circle.draw();
        SimpleFactory.create("triangle");
        SimpleFactory.create("rectangle");
    }
}
