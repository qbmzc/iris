package com.congco.iris.controller.abstractfactory;

import com.congco.iris.controller.abstractfactory.impl.Blue;
import com.congco.iris.controller.abstractfactory.impl.Green;
import com.congco.iris.controller.abstractfactory.impl.Red;

/**
 * @author congco
 * @date 19-6-17 下午2:15
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
