package com.haibin.design_pattern.创建型模式.单例模式;

/**
 * @project: design-pattern
 * @className: EagerSingleton
 * @description:
 * @author: zhanghaibin
 * @create: 2023-12-18
 */
public class EagerSingleton {
    /**
     * 静态常量保存唯一实例
     */
    public static final EagerSingleton EAGER_SINGLETON = new EagerSingleton();
    /**
     * 私有化构造器
     */
    private EagerSingleton() {
    }

    /**
     * 开放实例化方法
     */
    public EagerSingleton getInstance() {
        return EAGER_SINGLETON;
    }
}
