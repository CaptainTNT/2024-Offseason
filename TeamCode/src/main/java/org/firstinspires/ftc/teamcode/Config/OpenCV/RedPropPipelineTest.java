package org.firstinspires.ftc.teamcode.Config.OpenCV;

import static org.firstinspires.ftc.teamcode.Config.OpenCV.RedPropPipeline.Location.MIDDLE;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.vision.VisionPortal;


@Config
@Autonomous(name = "PipelineTestRED")
public class RedPropPipelineTest extends LinearOpMode {
    private RedPropPipeline.Location location = MIDDLE;
    private RedPropPipeline redPropProcessor;
    private VisionPortal visionPortal;

    @Override
    public void runOpMode() throws InterruptedException {
        redPropProcessor = new RedPropPipeline(telemetry);
        visionPortal = VisionPortal.easyCreateWithDefaults(
                hardwareMap.get(WebcamName.class, "Webcam 1"), redPropProcessor);



        while (!isStarted()) {
            location = redPropProcessor.getLocation();
            telemetry.update();
        }
        waitForStart();

        while (opModeIsActive()) {
            telemetry.addData("Location", redPropProcessor.getLocation());
            telemetry.update();
        }
    }
}