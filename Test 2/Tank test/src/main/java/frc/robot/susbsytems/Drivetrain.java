/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.susbsytems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.DriveArcade;
import edu.wpi.first.wpilibj.drive.*;
import edu.wpi.first.wpilibj.*;

/**
 * Add your docs here.
 */

public class Drivetrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  
  Talon FLSmotor = null;
  Talon RLSmotor = null;
  Talon FRSmotor = null;
  Talon RRSmotor = null;

  //Differnetial Drive
  DifferentialDrive differentialDrive =null;

  private int dIndex = 0;
    private int[] dividers = {1, 2};

  public Drivetrain()
  {
    //Talons
    FLSmotor = new Talon(RobotMap.DRIVETRAIN_LEFT_FRONT_TALON);
    RLSmotor = new Talon(RobotMap.DRIVETRAIN_LEFT_BACK_TALON);
    FRSmotor = new Talon(RobotMap.DRIVETRAIN_RIGHT_FRONT_TALON);
    RRSmotor = new Talon(RobotMap.DRIVETRAIN_RIGHT_FRONT_TALON);

    SpeedControllerGroup LSmotors = new SpeedControllerGroup(FLSmotor,RLSmotor);
    SpeedControllerGroup RSmotors = new SpeedControllerGroup(FRSmotor, RRSmotor);
    
    differentialDrive = new DifferentialDrive(LSmotors, RSmotors);
    //differentialDrive.close();

  }

  @Override
  public void initDefaultCommand() 
  {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    
    setDefaultCommand(new DriveArcade());

  }
  public void move(double yAxis, double xAxis) 
  {
    differentialDrive.tankDrive(yAxis/dividers[dIndex], xAxis/dividers[dIndex]);
}

  /*public void arcadeDrive (double moveSpeed, double rotateSpeed)
  {
    differentialDrive.tankDrive(moveSpeed, rotateSpeed);

  }
  */
}
