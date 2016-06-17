package org.usfirst.frc.team1360.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
	public static final int JOYSTICK_DRIVER		= 0;
	public static final int JOYSTICK_OPERATOR	= 1;
	
	// PWM port definitions.
	public static final int PWM_DRIVE_LEFT_FRONT	= 0;
	public static final int PWM_DRIVE_LEFT_REAR		= 1;
	public static final int PWM_DRIVE_RIGHT_FRONT	= 2;
	public static final int PWM_DRIVE_RIGHT_REAR	= 3;
	
	// DIO port definitions.
	public static final int DIO_DRIVE_LEFT_ENCODER_A	= 3;
	public static final int DIO_DRIVE_LEFT_ENCODER_B	= 4;
	public static final int	DIO_DRIVE_RIGHT_ENCODER_A	= 5;
	public static final int	DIO_DRIVE_RIGHT_ENCODER_B	= 6;
	
	
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
