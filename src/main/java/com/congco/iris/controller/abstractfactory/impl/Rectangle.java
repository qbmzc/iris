package com.congco.iris.controller.abstractfactory.impl;

import com.congco.iris.controller.abstractfactory.Shape;

/**
 * @author congco
 * @date 19-6-17 下午2:04
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
