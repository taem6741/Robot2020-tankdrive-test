/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import frc.robot.subsystems.RoboDrive;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj.Joystick;

/**
 * An example command that uses an example subsystem.
 */
public class TankDrive extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final RoboDrive m_driver; //The robot's drive
  private final Joystick m_leftJstick; // Left joystick
  private final Joystick m_rightJstick; // Right joystick

  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public TankDrive(final RoboDrive drive, final Joystick L_stick, final Joystick R_stick) {
    m_driver = drive;
    m_leftJstick = L_stick;
    m_rightJstick = R_stick;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(drive);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_driver.resetMotors(); // Starts with motors on 0
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_driver.tankDrive(m_leftJstick.getY(), m_rightJstick.getY()); // Uses the joysticks to get input for driving
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(final boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false; // Command does not need to finish, it will be automatically interrupted
                  // once the subsystem is required for a different command
  }
}
