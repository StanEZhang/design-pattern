package com.haibin.design_pattern.行为型模式.观察者模式02.Observer;

import com.haibin.design_pattern.行为型模式.观察者模式02.Subject.AllyControlCenter;

public interface Observer {
    public String getName();

    public void setName(String name);

    /**
     * 声明支援盟友的方法
     */
    public void help();

    /**
     * 声明遭受攻击的方法
     */
    public void beAttacked(AllyControlCenter acc);
}