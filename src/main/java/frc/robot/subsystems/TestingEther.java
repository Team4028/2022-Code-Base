// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class TestingEther extends SubsystemBase {
  /** Creates a new TestingEther. */
  private TalonSRX _MotorOne;
  private CANSparkMax _MotorTwo;
  private CANSparkMax _MotorThree; // needs to be reversed

  private TalonFX _MotorFive;
  private TalonFX _MotorSix;

  private RelativeEncoder _enc;
  private static TestingEther _instance = new TestingEther();
 public static TestingEther get_instance() {
   return _instance;
 }


  public TestingEther() {
  _MotorOne = new TalonSRX(1);
  _MotorTwo = new CANSparkMax(2, MotorType.kBrushless);
  _MotorThree = new CANSparkMax(3, MotorType.kBrushless);

  _MotorFive = new TalonFX(5);
  _MotorSix = new TalonFX(6);

    _enc = _MotorThree.getEncoder();
    _enc.setPosition(0);
 
  }

  public void runMotorOneAndTwo(){
    //_MotorOne.set(ControlMode.PercentOutput, .6);
    _MotorTwo.set(.6);
  }

  public void runThree(){
    _MotorThree.set(-.5);
  }

  public void stopThree(){
    _MotorThree.set(0);
  }

  public void stopTwoThree(){
    _MotorOne.set(ControlMode.PercentOutput, 0);
    _MotorTwo.set(0);
    _MotorThree.set(0);
  }

  public void runMotorWithEncoder(){
    if (_enc.getPosition()>150)
    {
      _MotorThree.set(0);
    }
    else{
      _MotorThree.set(-.2);
    }
    
  }

  public void runMotorThreeWithEncoderA(){
    if (_enc.getPosition()>-20)
    {
      _MotorThree.set(-.5);
      System.out.println(_enc.getPosition());
    }
    else{
      _MotorThree.set(0);
    }

  }

  public void runFiveSix(){
    _MotorFive.set(ControlMode.PercentOutput, .4);
    _MotorSix.set(ControlMode.PercentOutput, .6);
  }

  public void stopFiveSix(){
    _MotorFive.set(ControlMode.PercentOutput, 0);
    _MotorSix.set(ControlMode.PercentOutput, 0);
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
