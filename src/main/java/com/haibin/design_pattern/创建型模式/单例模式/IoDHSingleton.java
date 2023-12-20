package com.haibin.design_pattern.创建型模式.单例模式;

/**
 * @project: design-pattern
 * @className: IoDHSingleton
 * @description:
 * @author: zhanghaibin
 * @create: 2023-12-18
 */
public class IoDHSingleton {
    private IoDHSingleton() {

    }
    private static class HolderChlass{
        public static final IoDHSingleton SINGLETON = new IoDHSingleton();
    }

    public static IoDHSingleton getInstance() {
        return HolderChlass.SINGLETON;
    }

    public static void main(String[] args) {
        IoDHSingleton s1 = IoDHSingleton.getInstance();
        IoDHSingleton s2 = IoDHSingleton.getInstance();
        System.out.println(s1 == s2);
    }
}
