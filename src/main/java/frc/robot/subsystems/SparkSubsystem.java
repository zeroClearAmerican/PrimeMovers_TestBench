// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class SparkSubsystem extends SubsystemBase {
  /** Creates a new sparkSubsystem. */
  private CANSparkMax spark1;
  public SparkSubsystem() {
    spark1 = new CANSparkMax(Constants.SPARK1_CAN_ID, MotorType.kBrushless);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void set(double val ){
    spark1.set(val);

  }

}
