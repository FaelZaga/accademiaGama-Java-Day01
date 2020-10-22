package main.java.com.faelzaga.classesTest;

import main.java.com.faelzaga.classesTest.entities.Door;
import main.java.com.faelzaga.classesTest.entities.House;

public class ProgramHouse {

    public static void main(String[] args) {

        Door doorA = new Door("Blue",2,1,1);
        Door doorB = new Door("Blue",2,1,1);
        Door doorC = new Door("Blue",2,1,1);

        House myHouse = new House("Green",doorA,doorB,doorC);

        System.out.println("Number of open doors are "+myHouse.howManyDoorsAreOpen());

        doorA.open();
        doorB.open();

        System.out.println("Number of open doors are "+myHouse.howManyDoorsAreOpen());

    }
}
