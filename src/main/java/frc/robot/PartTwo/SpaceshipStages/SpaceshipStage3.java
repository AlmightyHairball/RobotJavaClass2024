package frc.robot.PartTwo.SpaceshipStages;

public class SpaceshipStage3 {
    // Attributes can now be private since they are not being accessed by other classes
    String material;
    String color;
    int numberOfThrusters;
    boolean readyForTakeoff;

    public SpaceshipStage3(String mat, String col, int thrusters) {
        material = mat;
        color = col;
        numberOfThrusters = thrusters;
        readyForTakeoff = false;
    }

    void prepareForTakeoff() {
        readyForTakeoff = true;
        System.out.println("Ready for takeoff!");
    }

    public static void main() {
        SpaceshipStage3 mySpaceship = new SpaceshipStage3("Titanium", "Blue", 4);
        System.out.println("Spaceship Material: " + mySpaceship.material);
        System.out.println("Spaceship Color: " + mySpaceship.color);
        System.out.println("Number of Thrusters: " + mySpaceship.numberOfThrusters);
        System.out.println("Ready For Takeoff: " + mySpaceship.readyForTakeoff);
        mySpaceship.prepareForTakeoff();
        System.out.println("Ready For Takeoff: " + mySpaceship.readyForTakeoff);
    }
}