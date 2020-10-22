package main.java.com.faelzaga.classesTest;

import main.java.com.faelzaga.classesTest.entities.Door;

public class ProgramDoor {

    public static void main(String[] args) {
        try {
            Door doorA = new Door("Blue", 2.0, 0.5, 0.02);

            System.out.println(doorA);

            doorA.open();
            doorA.colorIt("Red");

            System.out.println(doorA);

            doorA.close();

            System.out.println(doorA);

            doorA.setDimensions(3.0, 0.9, 0.1);

            System.out.println(doorA);

        }catch(RuntimeException e) {
            System.out.println(e);

        }
    }
}
