package main.java.com.faelzaga.classesTest.entities;

public class House {
    private String color;
    private Door[] doors = new Door[3];

    public House(String color, Door firstDoor, Door secondDoor, Door thirdDoor) {
        this.color = color;
        doors[0] = firstDoor;
        doors[1] = secondDoor;
        doors[2] = thirdDoor;
    }

    public int howManyDoorsAreOpen() {
        int doorOpen = 0;
        for (Door door : doors) {
            if (door.getDoorOpen()){
                doorOpen += 1;
            }
        }
        return doorOpen;
    }
}
