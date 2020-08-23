/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;

import frc.robot.Constants;

public class RoboDrive extends SubsystemBase {
  private final TalonSRX m_leftMotor = new TalonSRX(Constants.LEFT_TALON_ID);
  private final TalonSRX m_rightMotor = new TalonSRX(Constants.RIGHT_TALON_ID);
  
  /**
   * Creates a new ExampleSubsystem.
   */
  public RoboDrive() {
    m_leftMotor.setInverted(true);
    m_leftMotor.setNeutralMode(NeutralMode.Brake);
    m_rightMotor.setNeutralMode(NeutralMode.Brake);
  }

  public void tankDrive(double left_y, double right_y) {
    m_leftMotor.set(ControlMode.PercentOutput, left_y);
    m_rightMotor.set(ControlMode.PercentOutput, right_y);
  }

  public void resetMotors() {
    m_leftMotor.set(ControlMode.PercentOutput, 0);
    m_rightMotor.set(ControlMode.PercentOutput, 0);
  }
}
