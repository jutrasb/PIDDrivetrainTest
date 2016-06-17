
package org.usfirst.frc.team1360.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.VictorSP;

import org.usfirst.frc.team1360.robot.RobotMap;

/**
 *
 */
public class DriveSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	private final VictorSP VICTOR_DRIVE_LEFT_FRONT 	= new VictorSP(RobotMap.PWM_DRIVE_LEFT_FRONT);
	private final VictorSP VICTOR_DRIVE_LEFT_REAR 	= new VictorSP(RobotMap.PWM_DRIVE_LEFT_REAR);
	private final VictorSP VICTOR_DRIVE_RIGHT_FRONT	= new VictorSP(RobotMap.PWM_DRIVE_RIGHT_FRONT);
	private final VictorSP VICTOR_DRIVE_RIGHT_REAR 	= new VictorSP(RobotMap.PWM_DRIVE_RIGHT_REAR);
	
	private final Encoder ENCODER_DRIVE_LEFT 	= new Encoder(RobotMap.DIO_DRIVE_LEFT_ENCODER_A, RobotMap.DIO_DRIVE_LEFT_ENCODER_B, true);
	private final Encoder ENCODER_DRIVE_RIGHT	= new Encoder(RobotMap.DIO_DRIVE_RIGHT_ENCODER_A, RobotMap.DIO_DRIVE_RIGHT_ENCODER_B, true);
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void tankDrive(double leftPercentage, double rightPercentage) {
    	// To drive straight, one side must be reversed.
    	VICTOR_DRIVE_LEFT_FRONT.set(-leftPercentage);
    	VICTOR_DRIVE_LEFT_REAR.set(-leftPercentage);
    	VICTOR_DRIVE_RIGHT_FRONT.set(rightPercentage);
    	VICTOR_DRIVE_RIGHT_REAR.set(rightPercentage);
    }
    
    public void arcadeDrive(double turn, double speed) {
    	tankDrive((-speed) - turn, (-speed) + turn);
    }
    
    public void zeroDrive() {
    	tankDrive(0.0, 0.0);
    }
}

