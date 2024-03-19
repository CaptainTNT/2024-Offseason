package org.firstinspires.ftc.teamcode.Tele_Op;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.acmerobotics.roadrunner.util.Angle;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.Config.RoadRunner.drive.SampleMecanumDrive;

@Autonomous

public class ZeroPLock extends LinearOpMode {


    SampleMecanumDrive drive;



    @Override
    public void runOpMode() throws InterruptedException {

        SampleMecanumDrive drive = new SampleMecanumDrive(hardwareMap);
        waitForStart();

        while (opModeIsActive()) {
            lockTo(new Pose2d(1,1,0));
            drive.update();
        }

    }

    public void lockTo(Pose2d targetPos){
        Pose2d currPos = drive.getPoseEstimate();
        Pose2d difference = targetPos.minus(currPos);
        Vector2d xy = difference.vec().rotated(-currPos.getHeading());

        double heading = Angle.normDelta(targetPos.getHeading()) - Angle.normDelta(currPos.getHeading());
        drive.setWeightedDrivePower(new Pose2d(xy, heading));
    }


}
