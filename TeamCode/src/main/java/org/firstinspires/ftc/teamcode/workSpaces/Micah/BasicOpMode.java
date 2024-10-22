/**package org.firstinspires.ftc.teamcode.workSpaces.Micah;



import com.acmerobotics.dashboard.config.Config;
import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;




import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.Config.RoadRunner.drive.SampleMecanumDrive;

import org.firstinspires.ftc.teamcode.Config.RoadRunner.trajectorysequence.TrajectorySequence;

@Autonomous
@Config
public class BasicOpMode extends LinearOpMode {





    public void runOpMode() throws InterruptedException {

        SampleMecanumDrive drive = new SampleMecanumDrive(hardwareMap);
        TrajectorySequence MicahRR = drive.trajectorySequenceBuilder(new Pose2d(10.95, -59.45, Math.toRadians(0)))
                .forward(10)
                .build();
        TrajectorySequence MicahTest = drive.trajectorySequenceBuilder(new Pose2d(10.95, -59.45, Math.toRadians(0)))
                .splineTo(new Vector2d(41.58, 34.35), Math.toRadians(0))
                        .build();




        waitForStart();
        drive.followTrajectorySequence(MicahRR);





    }
}
 **/