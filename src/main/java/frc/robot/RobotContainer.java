// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.ControlFalconCommand;
import frc.robot.commands.ControlSparkCommand;
import frc.robot.commands.ControlTalonCommand;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.TalonSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import frc.robot.Constants;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();

  private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);
  // Instance Variables
  // private TalonSRX talon2;
  private CANSparkMax spark1;
  private WPI_TalonFX falcon1;
  public Joystick joystick1;

  private TalonSubsystem talonSubsystem;

  //control motors
  private ControlTalonCommand controlTalon1;
  private ControlTalonCommand controlTalon2;
  private ControlSparkCommand controlSpark1;
  private ControlFalconCommand controlFalcon1;
  
  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Assign Motors
    // talon2 = new TalonSRX(Constants.TALON2_CAN_ID);
    spark1 = new CANSparkMax(Constants.SPARK1_CAN_ID, MotorType.kBrushed);
    falcon1 = new WPI_TalonFX(Constants.FALCON1_CAN_ID);

    // Assign Joysticks
    joystick1 =  new Joystick(Constants.JOYSTICK1_PORT_NUMBER);

    talonSubsystem = new TalonSubsystem();

    //Control motors
    controlTalon1 = new ControlTalonCommand(talonSubsystem, joystick1);
    CommandScheduler.getInstance().setDefaultCommand(talonSubsystem, controlTalon1);
    // controlTalon2 = new ControlTalonCommand(talon2, joystick1, Constants.TALON2_AXIS);
    // controlSpark1 = new ControlSparkCommand(spark1, joystick1, Constants.SPARK1AXIS);
    // controlFalcon1 = new ControlFalconCommand(falcon1, joystick1, Constants.FALCON1_AXIS);

    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {}

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  }
}
