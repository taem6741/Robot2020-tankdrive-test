/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.*;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;

import frc.robot.Constants;

public class RoboDrive extends SubsystemBase {
  private final TalonSRX m_leftMotorTalon = new TalonSRX(Constants.LEFT_TALON_ID);
  private final VictorSPX m_leftMotorVictor = new VictorSPX(Constants.LEFT_VICTOR_ID);
  private final VictorSPX m_rightMotorVictor = new VictorSPX(Constants.RIGHT_VICTOR_ID);
  private final TalonSRX m_rightMotorTalon = new TalonSRX(Constants.RIGHT_TALON_ID);
  
  /**
   * Creates a new ExampleSubsystem.
   */
  public RoboDrive() {
    m_leftMotorTalon.setInverted(true);
    m_leftMotorVictor.setInverted(true);
    m_leftMotorTalon.setNeutralMode(NeutralMode.Brake);
    m_rightMotorTalon.setNeutralMode(NeutralMode.Brake);
    m_leftMotorVictor.setNeutralMode(NeutralMode.Brake);
    m_rightMotorVictor.setNeutralMode(NeutralMode.Brake);
  }

  public void tankDrive(double left_y, double right_y) {
    m_leftMotorTalon.set(ControlMode.PercentOutput, left_y);
    m_rightMotorTalon.set(ControlMode.PercentOutput, right_y);
    m_leftMotorVictor.set(ControlMode.PercentOutput, left_y);
    m_rightMotorVictor.set(ControlMode.PercentOutput, right_y);
  }

  public void resetMotors() {
    m_leftMotorTalon.set(ControlMode.PercentOutput, 0);
    m_rightMotorTalon.set(ControlMode.PercentOutput, 0);
    m_leftMotorVictor.set(ControlMode.PercentOutput, 0);
    m_rightMotorVictor.set(ControlMode.PercentOutput, 0);
  }
}
