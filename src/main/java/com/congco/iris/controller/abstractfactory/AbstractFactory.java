package com.congco.iris.controller.abstractfactory;

/**
 * 创建抽象类来获取工厂
 * @author congco
 * @date 19-6-17 下午2:10
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);

}
