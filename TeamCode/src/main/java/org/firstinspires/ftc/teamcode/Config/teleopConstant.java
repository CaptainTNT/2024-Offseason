package org.firstinspires.ftc.teamcode.Config;

import com.arcrobotics.ftclib.controller.PIDController;
import com.arcrobotics.ftclib.gamepad.GamepadEx;

public class teleopConstant {
    //This contains variables that will remain constant
    public static double Speed = 0.85;
    public static double MaxSpeed = 1;
    public static double MinSpeed = 0.65;
    public static double MaxTurnSpeed = 0.7;
    public static double MinTurnSpeed = 0.5;
    public static double TurnSpeed = 0.7;
    public static double Vertical;
    public static double Horizontal;
    public static double Pivot;
    public static double p = 0.0025, i = 0.074, d = 0.00001, f = 0.083;
    public static double ticks_in_degree = 700 / 180.0;
    public static double pid;
    public static double ff;
    public static double power;
    public static int newTarget = 10;
    public static int armPos;
    public static int target = 0;

    public static PIDController controller;

    public static GamepadEx DriverOp1;
    public static  GamepadEx DriverOp2;
}
