// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.SparkMaxLimitSwitch;
import com.revrobotics.SparkMaxPIDController;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMax.SoftLimitDirection;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;


public class Shooter extends SubsystemBase {
  /** Creates a new Shooter. */

  private final CANSparkMax  shooterLeft;
 
 
  
  public Shooter() {
   // shooterLeft = new CANSparkMax(Constants.ShooterConstants.shooterLeft, MotorType.kBrushless);

    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
