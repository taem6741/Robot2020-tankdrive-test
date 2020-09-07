/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    // motor controllers
    public static final int LEFT_TALON_ID = 2;
    public static final int RIGHT_TALON_ID = 4;
    public static final int LEFT_VICTOR_ID = 1;
    public static final int RIGHT_VICTOR_ID = 3;

    // joysticks + buttons
    public static final int LEFT_JSTICK = 1;
    public static final int RIGHT_JSTICK = 0;
}
