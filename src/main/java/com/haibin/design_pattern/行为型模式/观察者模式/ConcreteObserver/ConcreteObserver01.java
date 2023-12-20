package com.haibin.design_pattern.行为型模式.观察者模式.ConcreteObserver;

import com.haibin.design_pattern.行为型模式.观察者模式.Observer.Observer;

/**
 * @project: design-pattern
 * @className: ConcreteObserver01
 * @description:
 * @author: zhanghaibin
 * @create: 2023-11-08
 */
public class ConcreteObserver01 implements Observer {
    @Override
    public void update() {
        System.out.println("观察者01收到状态变化信息，并进行处理...");
    }
}
