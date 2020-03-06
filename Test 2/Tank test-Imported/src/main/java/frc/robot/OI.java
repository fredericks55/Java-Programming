/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

//import com.fasterxml.jackson.databind.ser.std.EnumSerializer;

import edu.wpi.first.wpilibj.Joystick;
//import edu.wpi.first.wpilibj.buttons.Button;
//import edu.wpi.first.wpilibj.buttons.JoystickButton;
/**
 * Add your docs here.
 */


public class OI
 {
    public static Joystick driverController = new Joystick(RobotMap.OI_DRIVER_CONTROLER);
    public static Joystick stick1 = new Joystick(0);
    public static Joystick stick2 = new Joystick(1);

    public static Joystick getStick(int stick)
    {
        if(stick == 1)
        {
            return stick1;

        }else if (stick == 2)
        {
            return stick2;
        }else{
            return stick1;

        }

    }
    
}
