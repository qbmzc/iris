package com.congco.iris.controller.abstractfactory;

/**
 * @author congco
 * @date 19-6-17 下午2:16
 */
public class FactoryProducer {
    public static  AbstractFactory getFactory(String choice){
        if (choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }else if (choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
