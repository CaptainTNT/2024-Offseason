package org.firstinspires.ftc.teamcode.Config;

import com.arcrobotics.ftclib.controller.PIDController;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class teleopConstant {
    double Speed;
    double MaxSpeed;
    double MinSpeed;
    double MaxTurnSpeed;
    double MinTurnSpeed;
    double TurnSpeed;
    double Vertical;
    double Horizontal;
    double Pivot;
    double p, i, d, f;
    double ticks_in_degree;
    double pid;
    double ff;
    double power;
    int newTarget;
    int armPos;
    int target;

    PIDController controller;

    GamepadEx DriverOp1;
    GamepadEx DriverOp2;

    public teleopConstant() {
        //This contains variables that will remain constant
        double Speed = 0.85;
        double MaxSpeed = 1;
        double MinSpeed = 0.65;
        double MaxTurnSpeed = 0.7;
        double MinTurnSpeed = 0.5;
        double TurnSpeed = 0.7;
        double Vertical;
        double Horizontal;
        double Pivot;
        double p = 0.0025, i = 0.074, d = 0.00001, f = 0.083;
        double ticks_in_degree = 700 / 180.0;
        double pid;
        double ff;
        double power;
        int newTarget = 10;
        int armPos;
        int target = 0;

        PIDController controller;

        GamepadEx DriverOp1;
        GamepadEx DriverOp2;




    }

}
