package com.haibin.design_pattern.行为型模式.观察者模式02.ConcreteSubject;

import com.haibin.design_pattern.行为型模式.观察者模式02.Observer.Observer;
import com.haibin.design_pattern.行为型模式.观察者模式02.Subject.AllyControlCenter;

/**
 * @project: design-pattern
 * @className: ConcreteAllayControlCenter
 * @description:
 * @author: zhanghaibin
 * @create: 2023-11-15
 */
public class ConcreteAllayControlCenter extends AllyControlCenter {
    public ConcreteAllayControlCenter(String name) {
        System.out.println(name + "战队组建成功！");
        System.out.println("-------------");
        this.allyName = name;
    }

    /**
     * 实现通知方法
     * @param name
     */
    @Override
    public void notifyObserver(String name) {
        System.out.println(this.allyName + "战队紧急通知，盟友" + name + "遭受敌人攻击");
        // 遍历观察者集合，调用每一个盟友（除了自己）的支援方法
        for (Observer obs : players) {
            if (!obs.getName().equalsIgnoreCase(name)) {
                obs.help();
            }
        }
    }
}
