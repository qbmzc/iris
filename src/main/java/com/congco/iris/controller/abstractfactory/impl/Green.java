package com.congco.iris.controller.abstractfactory.impl;

import com.congco.iris.controller.abstractfactory.Color;

/**
 * @author congco
 * @date 19-6-17 下午2:09
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
