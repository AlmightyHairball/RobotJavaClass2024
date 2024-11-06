package frc.robot.PartTwo.SpaceshipStages;

public class SpaceshipBonus {
    String material;
    String color;
    int numberOfThrusters;
    // fuel and tank size can both be private since they are not going to be altered outside of the class
    double fuel;
    double fuelTankSize;

    public SpaceshipBonus(String mat, String col, int thrusters, double tankSize) {
        material = mat;
        color = col;
        numberOfThrusters = thrusters;
        fuelTankSize = tankSize;
        fuel = 0;
    }

    void prepareForTakeoff() {
        fuel = fuelTankSize;
        System.out.println("Ready for takeoff!");
    }

    void launch() {
        if (fuel <= 0) {
            System.out.println("Ship cannot launch. Please prepare it for takeoff first.");
            return;
        }
        System.out.println("Launching in 5... 4... 3... 2... 1...");
        fuel = fuel - 2.5;
        if (fuel <= 0) {
            System.out.println("Fuel tank is empty!");
        }
        System.out.println("Launch successful!");
    }

    public static void main() {
        SpaceshipBonus mySpaceship = new SpaceshipBonus("Titanium", "Blue", 4, 12.5);
        System.out.println("Spaceship Material: " + mySpaceship.material);
        System.out.println("Spaceship Color: " + mySpaceship.color);
        System.out.println("Number of Thrusters: " + mySpaceship.numberOfThrusters);
        mySpaceship.prepareForTakeoff();
        mySpaceship.launch();
    }
}