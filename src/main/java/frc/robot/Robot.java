// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
import edu.wpi.first.wpilibj.TimedRobot;

// Import the neccessary library classes for the motors and joysticks
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;
import edu.wpi.first.wpilibj.Joystick;


public class Robot extends TimedRobot {

   // Declare and define robot motors
   CANSparkMax motorLeftFront = new CANSparkMax(32, MotorType.kBrushless);
   CANSparkMax motorLeftBack = new CANSparkMax(33, MotorType.kBrushless);
   CANSparkMax motorRightFront = new CANSparkMax(30, MotorType.kBrushless);
   CANSparkMax motorRightBack = new CANSparkMax(31, MotorType.kBrushless);

   // Declare and define joysticks
   Joystick joystickLeft = new Joystick(0);
   Joystick joystickRight = new Joystick(1);


  /**
   * robotInit() is run when the robot is first started up and should be used for any
   * initialization code.
   */

  @Override
  public void robotInit() {

    // Call the follow method to make the back motors follow
    // thir respective front motors.
    motorRightBack.follow(motorRightFront);
    motorLeftBack.follow(motorLeftFront);

  }

  @Override
  public void robotPeriodic() {

    // Set the motor output to the joystick input (There will be stick drift)
    motorLeftFront.set(joystickLeft.getY());
    motorLeftBack.set(-joystickRight.getY());

  }

  @Override
  public void autonomousInit() {}

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {}

  @Override
  public void teleopPeriodic() {}

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}

  @Override
  public void simulationInit() {}

  @Override
  public void simulationPeriodic() {}
}
