package frc.robot.PartTwo.SpaceshipStages;

public class SpaceshipStage1 {
    public String material;
    public String color;
    public int numberOfThrusters;
    public boolean readyForTakeoff;

    public SpaceshipStage1() {

    }

    public static void main() {
        SpaceshipStage1 mySpaceship = new SpaceshipStage1();
        mySpaceship.material = "Titanium";
        mySpaceship.color = "Blue";
        mySpaceship.numberOfThrusters = 4;
        mySpaceship.readyForTakeoff = false;
        System.out.println("Spaceship Material: " + mySpaceship.material);
        System.out.println("Spaceship Color: " + mySpaceship.color);
        System.out.println("Number of Thrusters: " + mySpaceship.numberOfThrusters);
        System.out.println("Ready For Takeoff: " + mySpaceship.readyForTakeoff);
    }
}