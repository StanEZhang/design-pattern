package com.haibin.design_pattern.创建型模式.工厂模式.工厂方法模式;

/**
 * @project: design-pattern
 * @className: Test
 * @description:
 * @author: zhanghaibin
 * @create: 2023-12-19
 */
public class Test {
    public static void main(String[] args) {
        LoggerFactory factory = new DataBaseLoggerFactory();
        Logger logger = factory.createLogger();
        logger.writeLog();

        LoggerFactory factory2 = new FileLoggerFactory();
        Logger logger2 = factory2.createLogger();
        logger2.writeLog();
    }
}
