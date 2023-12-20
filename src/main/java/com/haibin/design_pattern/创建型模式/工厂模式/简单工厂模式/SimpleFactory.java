package com.haibin.design_pattern.创建型模式.工厂模式.简单工厂模式;

/**
 * @project: design-pattern
 * @className: SimpleFactory
 * @description:
 * @author: zhanghaibin
 * @create: 2023-12-18
 */
public class SimpleFactory {
    public SimpleFactory() {
        System.out.println("简单工厂建立！");
    }

    public static Shape create(String type) {
        Shape shape = null;
        if (type.equalsIgnoreCase("circle")) {
            shape = new Circle();
        } else if (type.equalsIgnoreCase("rectangle")) {
            shape = new Rectangle();
        } else if(type.equalsIgnoreCase("triangle")){
            shape = new Triangle();
        }
        return shape;
    }
}
