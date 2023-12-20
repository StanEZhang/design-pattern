package com.haibin.design_pattern.行为型模式.观察者模式.ConcreteSubject;

import com.haibin.design_pattern.行为型模式.观察者模式.Subject.Subject;

/**
 * @project: design-pattern
 * @className: ConcreteSubject
 * @description:
 * @author: zhanghaibin
 * @create: 2023-11-08
 */
public class ConcreteSubject extends Subject {
    @Override
    public void doSomething() {
        System.out.println("被观察者事件发生改变");
        this.notifyObserver();
    }
}
