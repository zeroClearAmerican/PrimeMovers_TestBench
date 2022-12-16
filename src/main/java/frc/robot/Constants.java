// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    // Motor CAN Id Constants
    public static final  byte TALON1_CAN_ID = 3;
    public static final byte TALON2_CAN_ID = 2;
    public static final byte FALCON1_CAN_ID = 8;
    public static final byte SPARK1_CAN_ID = 4;

    //Joystick Constants
    public static final byte JOYSTICK1_PORT_NUMBER = 0;
    public static final byte TALON1_AXIS = 0;
    public static final byte TALON2_AXIS = 1;
    public static final byte SPARK1AXIS = 2;
    public static final byte FALCON1_AXIS = 3;

    

}
