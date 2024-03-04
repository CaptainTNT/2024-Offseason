package org.firstinspires.ftc.teamcode.Config;

import static org.firstinspires.ftc.teamcode.Config.teleopConstant.*;
import org.firstinspires.ftc.teamcode.Config.hardwareImports.*;

import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.dashboard.config.Config;
import com.acmerobotics.dashboard.telemetry.MultipleTelemetry;
import com.arcrobotics.ftclib.controller.PIDController;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.Range;


@Config
@TeleOp
public class PIDFconfig extends OpMode {
    hardwareImports motor = new hardwareImports(hardwareMap);
    @Override
    public void init(){
        controller = new PIDController(p, i, d);
        telemetry = new MultipleTelemetry(telemetry, FtcDashboard.getInstance().getTelemetry());

        motor.armMotor2.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    @Override
    public void loop(){
        controller.setPID(p, i, d);
        int armPos = motor.armMotor.getCurrentPosition();
        double pid = controller.calculate(armPos, target);
        double ff = Math.cos(Math.toRadians(target / ticks_in_degree)) * f;

        double power = pid + ff;

        double proportionalTerm = 0.0015 * (target - armPos);

        power = pid + ff - proportionalTerm;
        power = Range.clip(power, -0.5, 0.5);

        motor.armMotor.setPower(power);
        motor.armMotor2.setPower(power);


        if (gamepad2.left_stick_y > 0){
            target += 2;
        } else if (gamepad2.left_stick_y < 0){
            target -= 2;
        }


        telemetry.addData("pos ", armPos);
        telemetry.addData("target", target);
    }
}