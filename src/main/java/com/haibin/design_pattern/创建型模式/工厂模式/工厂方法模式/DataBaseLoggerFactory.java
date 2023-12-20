package com.haibin.design_pattern.创建型模式.工厂模式.工厂方法模式;

/**
 * @project: design-pattern
 * @className: DataBaseLoggerFactory
 * @description:
 * @author: zhanghaibin
 * @create: 2023-12-19
 */
public class DataBaseLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        System.out.println("连接数据库！");
        System.out.println("创建数据库日志记录器对象！");
        // 创建数据库日志记录器对象
        Logger dataBaseLogger = new DataBaseLogger();
        System.out.println("初始化数据库日志记录器对象！");
        System.out.println("生成数据库日志记录对象！");
        return dataBaseLogger;
    }
}
