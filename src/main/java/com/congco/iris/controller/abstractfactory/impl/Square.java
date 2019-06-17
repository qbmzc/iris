package com.congco.iris.controller.abstractfactory.impl;

import com.congco.iris.controller.abstractfactory.Shape;

/**
 * @author congco
 * @date 19-6-17 下午2:05
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
