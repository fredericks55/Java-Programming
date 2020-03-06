/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.susbsytems.*;
//import frc.robot.*;

/**
 * This is a demo program showing the use of the RobotDrive class, specifically
 * it contains the code necessary to operate a robot with tank drive.
 */
public class Robot extends TimedRobot 
{
  public static Drivetrain m_Drivetrain = null;
  public static OI m_oi=null;
  private DifferentialDrive m_myRobot= null;
  private Joystick m_leftStick;
  private Joystick m_rightStick;

  @Override
  public void startCompetition() 
  {
    // TODO Auto-generated method stub
    super.startCompetition();
  }

  @Override
  public void robotInit()
   {
    m_Drivetrain=new Drivetrain();
    //Talons
    //SpeedControllerGroup RSide= new SpeedControllerGroup(new Talon(1),new Talon(2));
    //SpeedControllerGroup LSide = new SpeedControllerGroup(new Talon(3), new Talon(4));
    //m_myRobot = new DifferentialDrive(RSide,LSide);
    m_leftStick = new Joystick(0);
    m_oi = new OI();
    m_rightStick = new Joystick(1);
  }

  @Override
  public void teleopPeriodic() 
  {
    m_myRobot.tankDrive(m_leftStick.getY(), m_rightStick.getY());
  }
  
}
