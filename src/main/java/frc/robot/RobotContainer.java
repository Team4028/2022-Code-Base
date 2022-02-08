// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.RunWithEncoder;
import frc.robot.commands.RunWithEncoderA;
import frc.robot.commands.ToggleFiveAndSix;
import frc.robot.commands.ToggleOneAndTwo;
import frc.robot.commands.ToggleThree;
import frc.robot.subsystems.TestingEther;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final ToggleOneAndTwo _TEcom = new ToggleOneAndTwo();
  private BeakXBoxController _Controller = new BeakXBoxController(0);
  private RunWithEncoder _RunWithEncoder = new RunWithEncoder();
  private final ToggleFiveAndSix _TFiveAndSixCom = new ToggleFiveAndSix();
  private RunWithEncoderA _RunWithEncoderA = new RunWithEncoderA();
  private final ToggleThree _TThree = new ToggleThree();

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();

  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
  _Controller.y.toggleWhenPressed(_TEcom);
  _Controller.b.whenPressed(_RunWithEncoder);
  _Controller.x.toggleWhenPressed(_TFiveAndSixCom);
  _Controller.a.whenPressed(_RunWithEncoderA);
  _Controller.back.toggleWhenPressed(_TThree);
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
 
}
