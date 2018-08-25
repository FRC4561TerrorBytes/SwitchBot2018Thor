package frc.robot.commands;

import frc.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class TankDrive extends Command {

	public TankDrive(){
		requires(Robot.driveTrain);
	}
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	protected void execute(){
		Robot.driveTrain.tankDrive(Robot.oi.getLeftStickY(), Robot.oi.getRightStickY());
	}
	
	protected void stop(){
		Robot.driveTrain.tankDrive(0, 0);
	}

}
