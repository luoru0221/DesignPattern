package com.rul.designpattern.factory.simplefactory;

/**
 * 工厂角色
 *
 * @author LuoRu
 */
public class AnimalFactory {

    public static Animal createAnimal(String animalType) {
        if (animalType == null) {
            return null;
        }
        if (animalType.equalsIgnoreCase("SHEEP")) {
            return new Sheep();
        } else if (animalType.equalsIgnoreCase("BIRD")) {
            return new Bird();
        } else if (animalType.equalsIgnoreCase("CAT")) {
            return new Cat();
        }
        return null;
    }
}
