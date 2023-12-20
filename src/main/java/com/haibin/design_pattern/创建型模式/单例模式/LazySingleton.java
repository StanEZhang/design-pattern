package com.haibin.design_pattern.创建型模式.单例模式;

/**
 * @project: design-pattern
 * @className: LazySingleton 懒汉式单例
 * @description:
 * @author: zhanghaibin
 * @create: 2023-12-18
 */
public class LazySingleton {
    /**
     * 不提前实例化
     */
    private static volatile LazySingleton lazySingleton;

    private LazySingleton() {

    }

    /**
     * 双检锁
     * @return
     */
    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            synchronized (LazySingleton.class) {
                if (lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
