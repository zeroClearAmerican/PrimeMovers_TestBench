// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import javax.print.attribute.standard.JobHoldUntil;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.SparkSubsystem;

public class ControlSparkCommand extends CommandBase {
  // Instance Variables
  // private sparkSubsystem;
  private Joystick joystick;
  private byte axis;
  /** Creates a new ControlSparkCommand. */
  public ControlSparkCommand(CANSparkMax spark, Joystick joystick, byte axis) {
    // this.spark = spark;
    this.joystick = joystick;
    this.axis = axis;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // spark.set(joystick.getRawAxis(axis));
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
