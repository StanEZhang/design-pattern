package com.haibin.design_pattern.行为型模式.观察者模式.Subject;

import com.haibin.design_pattern.行为型模式.观察者模式.Observer.Observer;

import java.util.Vector;

/**
 * @project: design-pattern
 * @className: Subject
 * @description: 被观察者
 * 保存观察者列表
 * 可以添加观察者、删除观察者，更新列表中观察者状态
 * @author: zhanghaibin
 * @create: 2023-11-08
 */
public abstract class Subject {
    private Vector<Observer> obs = new Vector<>();

    public void addObserver(Observer obs) {
        this.obs.add(obs);
    }

    public void delObserver(Observer obs) {
        this.obs.remove(obs);
    }

    protected void notifyObserver() {
        for (Observer ob : obs) {
            ob.update();
        }
    }

    public abstract void doSomething();

}
