package com.congco.iris.controller.abstractfactory.impl;

import com.congco.iris.controller.abstractfactory.Color;

/**
 * @author congco
 * @date 19-6-17 下午2:08
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
