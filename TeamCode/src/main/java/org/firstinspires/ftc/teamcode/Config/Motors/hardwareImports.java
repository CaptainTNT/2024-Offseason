package org.firstinspires.ftc.teamcode.Config.Motors;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.acmerobotics.dashboard.config.Config;


@Config
public class hardwareImports {

    //Defines drive variables
    DcMotor leftFront = null;
    DcMotor rightFront = null;
    DcMotor leftRear = null;
    DcMotor rightRear = null;

    //Defines attachment variables
    DcMotorEx armMotor = null;
    DcMotorEx armMotor2 = null;
    Servo Servo1 = null;
    Servo Servo2 = null;
    Servo Servo3 = null;
    Servo Servo4 = null;
    Servo Servo5 = null;
    Servo Servo6 = null;
    Servo Servo7 = null;

    public hardwareImports(HardwareMap hardwareMap) {


        //Defines the driving variables to the hardwareMap
        leftFront = hardwareMap.get(DcMotorEx.class, "leftFront");
        rightFront = hardwareMap.get(DcMotorEx.class, "rightFront");
        leftRear = hardwareMap.get(DcMotorEx.class, "leftRear");
        rightRear = hardwareMap.get(DcMotorEx.class, "rightRear");

        //Defines the attachment variables to the hardwareMap
        armMotor = hardwareMap.get(DcMotorEx.class, "Launch Motor");
        armMotor2 = hardwareMap.get(DcMotorEx.class, "Launch Motor 2");
        Servo1 = hardwareMap.get(Servo.class, "Servo1");
        Servo2 = hardwareMap.get(Servo.class, "servo2");
        Servo3 = hardwareMap.get(Servo.class, "servo 3");
        Servo4 = hardwareMap.get(Servo.class, "servo 4");
        Servo5 = hardwareMap.get(Servo.class, "servo 5");
        Servo6 = hardwareMap.get(Servo.class, "servo 6");
        Servo7 = hardwareMap.get(Servo.class, "servo 7");


    }
}