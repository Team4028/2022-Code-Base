// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.TestingEther;

public class RunWithEncoder extends CommandBase {
  private TestingEther _TE = TestingEther.get_instance();
  /** Creates a new RunWithEncoder. */
  public RunWithEncoder() {
    addRequirements(_TE);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    _TE.runMotorWithEncoder(20, 0.2);
    
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    _TE.runMotorWithEncoder(20, 0.2);
    
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
