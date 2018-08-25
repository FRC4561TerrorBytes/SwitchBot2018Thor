package frc.robot.commands;

import frc.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ResetEncoders extends Command {

	@Override
	protected void execute() {
		Robot.driveTrain.resetEncoders();
	}
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
