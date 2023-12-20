package com.haibin.design_pattern.行为型模式.观察者模式02;

import com.haibin.design_pattern.行为型模式.观察者模式02.ConcreteObserver.Player;
import com.haibin.design_pattern.行为型模式.观察者模式02.ConcreteSubject.ConcreteAllayControlCenter;
import com.haibin.design_pattern.行为型模式.观察者模式02.Observer.Observer;
import com.haibin.design_pattern.行为型模式.观察者模式02.Subject.AllyControlCenter;

/**
 * @project: design-pattern
 * @className: Client
 * @description:
 * @author: zhanghaibin
 * @create: 2023-11-16
 */
public class Client {
    public static void main(String[] args) {
        // 定义被观察者
        AllyControlCenter acc = new ConcreteAllayControlCenter("金庸群侠");

        // 定义4个观察者
        Observer player1 = new Player("杨过");
        Observer player2 = new Player("令狐冲");
        Observer player3 = new Player("张无忌");
        Observer player4 = new Player("段誉");
        acc.join(player1);
        acc.join(player2);
        acc.join(player3);
        acc.join(player4);

        // 某成员遭受攻击
        player1.beAttacked(acc);

    }
}
