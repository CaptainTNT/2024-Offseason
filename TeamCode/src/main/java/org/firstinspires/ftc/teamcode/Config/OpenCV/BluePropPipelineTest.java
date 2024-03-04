package org.firstinspires.ftc.teamcode.Config.OpenCV;

import static org.firstinspires.ftc.teamcode.Config.OpenCV.BluePropPipeline.Location.MIDDLE;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.vision.VisionPortal;

@Config
@Autonomous(name = "PipelineTestBLUE")
public class BluePropPipelineTest extends LinearOpMode {
    private BluePropPipeline.Location location = MIDDLE;
    private BluePropPipeline BluePropProcessor;
    private VisionPortal visionPortal;

    @Override
    public void runOpMode() throws InterruptedException {
        BluePropProcessor = new BluePropPipeline(telemetry);
        visionPortal = VisionPortal.easyCreateWithDefaults(
                hardwareMap.get(WebcamName.class, "Webcam 1"), BluePropProcessor);



        while (!isStarted()) {
            location = BluePropProcessor.getLocation();
            telemetry.update();
        }
        waitForStart();

        while (opModeIsActive()) {
            telemetry.addData("Location", BluePropProcessor.getLocation());
            telemetry.update();
        }
    }
}
