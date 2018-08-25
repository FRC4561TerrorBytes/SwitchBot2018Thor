
package frc.robot.commands;

import frc.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ArmIntakePosition extends Command {

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return Robot.arm.nearGoal();
	}
	
	protected void initialize(){
		Robot.arm.IntakePosition();
	}

}
