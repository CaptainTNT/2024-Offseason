package org.firstinspires.ftc.teamcode.Config.Motors;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.dashboard.telemetry.MultipleTelemetry;
import com.arcrobotics.ftclib.controller.PIDController;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.Range;

public class PIDFarm {
    private static PIDController controller;
    public static double p = 0.0025, i = 0, d = 0.00001;
    public static double f = 0.083;

    public static int target = 0;

    private static final double ticks_in_degree = 700 / 180.0;

    int armPos;

    static hardwareImports m = new hardwareImports(hardwareMap);

    public static void PIDF_Arm(int Target){
        controller = new PIDController(p, i, d);

        m.armMotor = hardwareMap.get(DcMotorEx.class, "Launch Motor");
        m.armMotor2 = hardwareMap.get(DcMotorEx.class, "Launch Motor 2");
        m.armMotor2.setDirection(DcMotorSimple.Direction.REVERSE);

        controller.setPID(p, i, d);
        int armPos = m.armMotor.getCurrentPosition();
        double pid = controller.calculate(armPos, target);
        double ff = Math.cos(Math.toRadians(target / ticks_in_degree)) * f;

        double power = pid + ff;

        double proportionalTerm = 0.0015 * (target - armPos);

        power = pid + ff - proportionalTerm;
        power = Range.clip(power, -0.5, 0.5);

        m.armMotor.setPower(power);
        m.armMotor2.setPower(power);
    }
}
