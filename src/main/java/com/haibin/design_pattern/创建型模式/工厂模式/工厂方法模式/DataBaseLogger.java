package com.haibin.design_pattern.创建型模式.工厂模式.工厂方法模式;

/**
 * @project: design-pattern
 * @className: DataBaseLogger
 * @description:
 * @author: zhanghaibin
 * @create: 2023-12-19
 */
public class DataBaseLogger implements Logger{
    @Override
    public void writeLog() {
        System.out.println("数据库日志记录...");
    }
}
