package com.haibin.design_pattern.行为型模式.观察者模式02.Subject;

import com.haibin.design_pattern.行为型模式.观察者模式02.Observer.Observer;

import java.util.Vector;

/**
 * @project: design-pattern
 * @className: AllyControlCenter
 * @description:
 * @author: zhanghaibin
 * @create: 2023-11-15
 */
public abstract class AllyControlCenter {

    /**
     * 战队名称
     */
    protected String allyName;
    /**
     * 定义一个集合，用来存储具体观察者，也就是战队成员
     */
    protected Vector<Observer> players = new Vector<Observer>();

    /**
     * 加入战队
     */
    public void join(Observer observer) {
        System.out.println(observer.getName() + "加入" + this.allyName + "战队！");
        players.add(observer);
    }

    /**
     * 退出战队
     */
    public void quit(Observer observer) {
        System.out.println(observer.getName() + "退出" + this.allyName + "战队！");
        players.remove(observer);
    }

    /**
     * 声明抽象通知方法
     * @param name
     */
    public abstract void notifyObserver(String name);

    /**
     * 设置成员变量方法
     * @param allyName
     */
    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }

    /**
     * 获取成员变量方法
     * @return
     */
    public String getAllyName() {
        return this.allyName;
    }


}
