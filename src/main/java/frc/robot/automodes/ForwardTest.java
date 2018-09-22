package frc.robot.automodes;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;
import frc.robot.commands.*;
import frc.robot.Robot;
//import frc.robot.commands.ArmVertical;
import frc.robot.commands.DriveMagic;
import frc.robot.commands.SpeedGear;
/**
 * This auto mode drives past the auto line if the robot is on the left or right side of the field.
 * @author Ben
 */
public class ForwardTest extends CommandGroup {
	
	public ForwardTest() {
		// torque mode
		addSequential(new SpeedGear());
		//addSequential(new ArmVertical());
		// wait preassigned time
		addSequential(new DriveMagic(150, 150));
//		addSequential(new WaitCommand(3));
		//addSequential(new TankDriveTimed(1, 1, 1));
		// addSequential(new WaitCommand(3));
		// done
	}
}
