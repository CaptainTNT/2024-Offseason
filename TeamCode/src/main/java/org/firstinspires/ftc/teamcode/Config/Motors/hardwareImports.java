package org.firstinspires.ftc.teamcode.Config.Motors;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.acmerobotics.dashboard.config.Config;

import java.util.Arrays;
import java.util.List;


@Config
public class hardwareImports {

    private DcMotorEx rightFront,leftFront,leftRear,rightRear = null;



    //Defines attachment variables
    private DcMotorEx armMotor = null;
    private DcMotorEx armMotor2 = null;
    private  DcMotor spoolMotor = null;
    private Servo Servo1 = null;
    private Servo Servo2 = null;
    private Servo Servo3 = null;
    private Servo Servo4 = null;
    private Servo Servo5 = null;
    private Servo Servo6 = null;
    private Servo Servo7 = null;

    public hardwareImports(HardwareMap hardwareMap) {

        //Defines the driving variables to the hardwareMap
        leftFront = hardwareMap.get(DcMotorEx.class, "leftFront");
        rightFront = hardwareMap.get(DcMotorEx.class, "rightFront");
        leftRear = hardwareMap.get(DcMotorEx.class, "leftRear");
        rightRear = hardwareMap.get(DcMotorEx.class, "rightRear");

        //Defines the attachment variables to the hardwareMap
        armMotor = hardwareMap.get(DcMotorEx.class, "Launch Motor");
        armMotor2 = hardwareMap.get(DcMotorEx.class, "Launch Motor 2");
        spoolMotor = hardwareMap.get(DcMotor.class, "Launch Motor 3");
        Servo1 = hardwareMap.get(Servo.class, "Servo1");
        Servo2 = hardwareMap.get(Servo.class, "servo2");
        Servo3 = hardwareMap.get(Servo.class, "servo 3");
        Servo4 = hardwareMap.get(Servo.class, "servo 4");
        Servo5 = hardwareMap.get(Servo.class, "servo 5");
        Servo6 = hardwareMap.get(Servo.class, "servo 6");
        Servo7 = hardwareMap.get(Servo.class, "servo 7");


    }
}