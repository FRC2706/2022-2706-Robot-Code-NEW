// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.intakePneumaticSubsystem;

import edu.wpi.first.wpilibj2.command.InstantCommand;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class IntakeUp extends InstantCommand {
  intakePneumaticSubsystem intakePneumatic;
  /** Creates a new IntakeUp. */
  public IntakeUp() {
    intakePneumatic = intakePneumaticSubsystem.getInstance();
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(intakePneumatic);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    if ( intakePneumatic != null )
    {
      intakePneumatic.moveUp();
    }
  }

}
