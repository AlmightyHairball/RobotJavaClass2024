package frc.robot.PartTwo.SpaceshipStages;

public class SpaceshipStage2 {
    public String material;
    public String color;
    public int numberOfThrusters;
    public boolean readyForTakeoff;

    public SpaceshipStage2() {

    }

    void prepareForTakeoff() {
        readyForTakeoff = true;
        System.out.println("Ready for takeoff!");
    }

    public static void main() {
        SpaceshipStage2 mySpaceship = new SpaceshipStage2();
        mySpaceship.material = "Titanium";
        mySpaceship.color = "Blue";
        mySpaceship.numberOfThrusters = 4;
        // readyForTakeoff must be false for this part
        mySpaceship.readyForTakeoff = false;
        System.out.println("Spaceship Material: " + mySpaceship.material);
        System.out.println("Spaceship Color: " + mySpaceship.color);
        System.out.println("Number of Thrusters: " + mySpaceship.numberOfThrusters);
        System.out.println("Ready For Takeoff: " + mySpaceship.readyForTakeoff);
        mySpaceship.prepareForTakeoff();
        System.out.println("Ready For Takeoff: " + mySpaceship.readyForTakeoff);
    }
}