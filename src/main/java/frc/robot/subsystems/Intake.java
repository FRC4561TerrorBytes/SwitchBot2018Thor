/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.*;
import com.ctre.phoenix.motorcontrol.can.*;

/**
 * Intake Subsystem. Eats Cubes
 */
public class Intake extends Subsystem {
  private WPI_TalonSRX rightMotor;
  private WPI_TalonSRX leftMotor;

  @Override
  public void initDefaultCommand() {
  
  }

  public void intakeIn(){
      rightMotor.set(-1);
      leftMotor.set(-1);
  }

  public void intakeOut(){
      rightMotor.set(1);
      leftMotor.set(1);
  }

  public void intakeStop(){
    rightMotor.set(0);
    leftMotor.set(0); 
  }
}
