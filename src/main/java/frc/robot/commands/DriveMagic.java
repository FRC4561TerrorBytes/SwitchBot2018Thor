package frc.robot.commands;

import frc.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DriveMagic extends Command {

	int left;
	int right;
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public DriveMagic(int left, int right){
		this.left = left;
		this.right = right;
	}
	
	protected void execute(){
		if (Robot.oi.getLeftTrigger()){
			double tLeft = 3600*Robot.oi.getLeftStickY()*10;
			double tRight = -1800*Robot.oi.getLeftStickY()*10;
			Robot.driveTrain.magicDrive(tLeft, tRight);
			System.out.print(tLeft);
			System.out.print(" ");
			System.out.println(tRight);
		}
		SmartDashboard.putNumber("Left Speed", Robot.driveTrain.getLeftSpeed());
		SmartDashboard.putNumber("Right Speed", Robot.driveTrain.getRightSpeed());
		SmartDashboard.putNumber("Left Pos", Robot.driveTrain.getLeftPos());
		SmartDashboard.putNumber("Right Pos", Robot.driveTrain.getRightPos());
	}
}
