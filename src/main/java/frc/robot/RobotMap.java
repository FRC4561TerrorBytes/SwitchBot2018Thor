package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static final int RIGHT_JOYSTICK_PORT = 0;
	public static final int LEFT_JOYSTICK_PORT = 0;
	
	// Joystick configuration
	public static final double RIGHT_JOYSTICK_DEAD_ZONE = 0.25;
	public static final double LEFT_JOYSTICK_DEAD_ZONE = 0.25;
	public static final double RIGHT_JOYSTICK_REDUCTION = 0.25;
	public static final double LEFT_JOYSTICK_REDUCTION = 0.25;
	
	// Right motor ports
	public static final int FRONT_RIGHT_MOTOR_PORT = 4;
	public static final int MID_RIGHT_MOTOR_PORT = 5;
	public static final int BOT_RIGHT_MOTOR_PORT = 6;

	// Left motor ports		
	public static final int FRONT_LEFT_MOTOR_PORT = 1;
	public static final int MID_LEFT_MOTOR_PORT = 2;
	public static final int BOT_LEFT_MOTOR_PORT = 3;
	
	// Drive mode
	public static final int DRIVE_MODE = 1; // 1 is arcade drive, 0 is tank drive
	
	//Transmission ports
	public static final int PCM_PORT = 0;
	public static final int TRANSMISSION_SOLENOID_PORT = 0;
	public static final int TRANSMISSION_SOLENOID_PORT_TWO = 0;
	public static final int TRANSMISSION_SOLENOID_TWO_PORT = 0;
	public static final int TRANSMISSION_SPEED_BUTTON = 0;
	public static final int TRANSMISSION_TORQUE_BUTTON = 0;
	public static final int TRANSMISSION_SOLENOID_TWO_PORT_TWO = 0;
	public static final int PCM = 0;

	// Arm ports
	public static final int ARM_MOTOR_1_PORT = 0;

	// Debug variables
	public static final boolean MASTER_DEBUG = true;
	@SuppressWarnings("unused")
	public static final boolean ARM_DEBUG = false || MASTER_DEBUG;
	public static final boolean TRANSMISSION_DEBUG = false || MASTER_DEBUG;
	public static final boolean DRIVETRAIN_DEBUG = true || MASTER_DEBUG;
	
	// PID variables
	public static boolean MASTER_PID = false;
	public static boolean DRIVETRAIN_PID = false || MASTER_PID;
	@SuppressWarnings("unused")
	public static boolean ARM_PID = true || MASTER_PID;

	// Automode constraints
	public static final boolean LEFT_SIDE_INVERTED = false; // Delta: false, Kongo: false, Janderson: false
	public static final boolean RIGHT_SIDE_INVERTED = true; // Delta: true, Kongo: true, Janderson: true
	public static final boolean LEFT_SIDE_SENSOR_PHASE_REVERSED = false;
	public static final boolean RIGHT_SIDE_SENSOR_PHASE_REVERSED = false;
	
	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
