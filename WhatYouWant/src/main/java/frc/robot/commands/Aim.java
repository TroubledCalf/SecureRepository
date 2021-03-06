/**
 * Using the limelight's aim adjust api, the bot will get into a certain position to line up to the upper goal.
 */
package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Limelight;

public class Aim extends CommandBase{
    public static double leftDriveAdjust =0;
    public static double rightDriveAdjust = 0;
    public Aim(DriveTrain drive, Limelight lime){
        addRequirements(drive);

    }
    public void initialize(){

    }
    /**
     * left/rightDriveAdjust variables are called upon and used in the .differentialDrive() method, which will make the robot
     * go the speed of whatever DriveAdjust is
     */
    public void execute(){
        
        leftDriveAdjust =RobotContainer.lime.getAimAdjust(); // Constants.autoDriveSpeed + 
        rightDriveAdjust = RobotContainer.lime.getAimAdjust(); // Constants.autoDriveSpeed + 

        RobotContainer.lime.aim(RobotContainer.differential);
        RobotContainer.differential.differentialDrive(leftDriveAdjust, rightDriveAdjust);
        
    }
    public boolean isFinished(){
        return false;
    }
    public boolean isInterrupted(){
        return false;

    }
    public void end(){

    }
    public void interrupted(){
        
    }




}