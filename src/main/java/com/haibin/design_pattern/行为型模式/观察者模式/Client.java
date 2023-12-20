package com.haibin.design_pattern.行为型模式.观察者模式;

import com.haibin.design_pattern.行为型模式.观察者模式.ConcreteObserver.ConcreteObserver01;
import com.haibin.design_pattern.行为型模式.观察者模式.ConcreteObserver.ConcreteObserver02;
import com.haibin.design_pattern.行为型模式.观察者模式.ConcreteSubject.ConcreteSubject;

/**
 * @project: design-pattern
 * @className: Client
 * @description:
 * @author: zhanghaibin
 * @create: 2023-11-08
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.addObserver(new ConcreteObserver01());
        subject.addObserver(new ConcreteObserver02());
        subject.doSomething();
    }
}
