package com.congco.iris.controller.abstractfactory;

import com.congco.iris.controller.abstractfactory.impl.Circle;
import com.congco.iris.controller.abstractfactory.impl.Rectangle;
import com.congco.iris.controller.abstractfactory.impl.Square;

/**
 * @author congco
 * @date 19-6-17 下午2:12
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if ("CIRCLE".equals(shapeType)) {
            return new Circle();
        } else if ("RECTANGLE".equals(shapeType)) {
            return new Rectangle();
        } else if ("SQUARE".equals(shapeType)) {
            return new Square();
        }
        return null;
    }
}
