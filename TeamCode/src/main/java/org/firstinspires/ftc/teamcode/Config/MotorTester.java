package org.firstinspires.ftc.teamcode.Config;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class MotorTester extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {

        DcMotor frontLeft;
        DcMotor frontRight;
        DcMotor leftRear;
        DcMotor rightRear;


        frontLeft = hardwareMap.get(DcMotor.class, "leftFront");
        frontRight = hardwareMap.get(DcMotor.class, "rightFront");
        leftRear = hardwareMap.get(DcMotor.class, "leftRear");
        rightRear = hardwareMap.get(DcMotor.class, "rightRear");

        waitForStart();
        while (opModeIsActive()) {
            if (gamepad1.triangle){
                telemetry.addLine("Left Front");
                frontLeft.setPower(1);
                telemetry.update();
            } else {
                frontLeft.setPower(0);
                telemetry.update();
            }

            if (gamepad1.circle){
                telemetry.addLine("Right Front");
                frontRight.setPower(1);
                telemetry.update();
            } else {
                frontRight.setPower(0);
                telemetry.update();
            }

            if (gamepad1.cross){
                telemetry.addLine("Left Back");
                leftRear.setPower(1);
                telemetry.update();
            } else {
                leftRear.setPower(0);
                telemetry.update();
            }

            if (gamepad1.square){
                telemetry.addLine("Right Back");
                rightRear.setPower(1);
                telemetry.update();
            } else {
                rightRear.setPower(0);
                telemetry.update();
            }
        }
    }
}
