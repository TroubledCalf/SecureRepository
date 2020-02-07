package frc.robot.commands;
import frc.robot.*;
import edu.wpi.first.wpilibj2.command.CommandBase;
//import edu.wpi.first.wpilibj2.command.CommandScheduler;
import frc.robot.subsystems.*;
import frc.robot.Constants;
public class LeftStrafe extends CommandBase{
    
    public LeftStrafe(DriveTrain driveTrain){
        addRequirements(driveTrain);
    }
    public void initialize(){
        
    }
    public void execute(){
        RobotContainer.mecanum.mecanumDrive(Constants.strafeSpeed, Constants.strafeSpeed*-1,0, 0);
    }
    public boolean isFinished(){
        return false;
    }
    protected void end(){
    }
    protected void interrupted(){
 
    }
}