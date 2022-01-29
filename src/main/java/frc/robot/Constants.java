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


    /*************** CAN IDS **************/

    //0-8 will be alotted for swerve motors
    //9-12 will be alotted and encoders

    public static final int INFEED_MOTOR_ID = 13;
    public static final int SINGULATOR_MOTOR_ID = 14;
    public static final int CONVERYOR_MOTOR_ID = 15;
    public static final int KICKER_MOTOR_ID = 16;
    public static final int SHOOTER_1_MOTOR_ID = 17;
    public static final int SHOOTER_2_MOTOR_ID = 18;

    public static final int CLIMB_MOTOR_ID = 19;

    public static final int TOF1_SENSOR_ID = 420;
    public static final int TOF2_SENSOR_ID = 69;





}
