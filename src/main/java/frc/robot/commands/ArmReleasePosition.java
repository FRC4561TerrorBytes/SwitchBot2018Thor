
package frc.robot.commands;

import frc.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ArmReleasePosition extends Command {

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return Robot.arm.nearGoal();
	}
	
	protected void initialize(){
		Robot.arm.DiagonalPosition();
	}

}
