package com.haibin.design_pattern.行为型模式.观察者模式02.ConcreteObserver;

import com.haibin.design_pattern.行为型模式.观察者模式02.Observer.Observer;
import com.haibin.design_pattern.行为型模式.观察者模式02.Subject.AllyControlCenter;

/**
 * @project: design-pattern
 * @className: Player
 * @description:
 * @author: zhanghaibin
 * @create: 2023-11-15
 */
public class Player implements Observer {
    private String name;

    public Player(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 支援盟友的方法实现
     */
    @Override
    public void help() {
        System.out.println("坚持住，"+this.name +"来救你了！");
    }

    /**
     * 遭受攻击的方法实现
     * 当遭受攻击时，调用战队控制中心类的通知方法notifyObserver()来通知盟友
     * @param acc
     */
    @Override
    public void beAttacked(AllyControlCenter acc) {
        System.out.println(this.name + "被攻击！");
        acc.notifyObserver(name);

    }
}
