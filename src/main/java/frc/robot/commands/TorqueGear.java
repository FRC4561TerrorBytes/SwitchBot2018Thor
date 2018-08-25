package frc.robot.commands;

import frc.robot.Robot;

/**
* @author Krishna P
*/
import frc.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *This is the TorqueGear command
 *@author krishna
 */

public class TorqueGear extends Command {
	
	public TorqueGear() {
		requires(Robot.transmission);
	}
	
protected void initialize() {
	if (RobotMap.TRANSMISSION_DEBUG) {
		System.out.println("[C:TorqueGear] Command initializes.");
	}
}

protected void execute() {
	Robot.transmission.torqueGear();
	Robot.driveTrain.switchToTorque();
	if (RobotMap.TRANSMISSION_DEBUG) {
		System.out.println("[TorqueGear] Command executes." );
	}
}



protected void end() {
	
	if (RobotMap.TRANSMISSION_DEBUG) {
		System.out.println("C[TorqueGear] Command finished.");
	}
}

protected boolean isFinished() {
	return true;
}


protected void interrupted() {
	if (RobotMap.TRANSMISSION_DEBUG) {
		System.out.println("C[TorqueGear] Command stop.");
	}
	end();
  }
}

