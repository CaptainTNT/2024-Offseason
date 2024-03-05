package org.firstinspires.ftc.teamcode.Config.Motors;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.acmerobotics.dashboard.config.Config;


@Config
public class hardwareImports {

    //Defines drive variables
    public DcMotor leftFront = null;
    public DcMotor rightFront = null;
    public DcMotor leftRear = null;
    public DcMotor rightRear = null;

    //Defines attachment variables
    public DcMotorEx armMotor = null;
    public DcMotorEx armMotor2 = null;
    public DcMotor spoolMotor = null;
    public Servo Servo1 = null;
    public Servo Servo2 = null;
    public Servo Servo3 = null;
    public Servo Servo4 = null;
    public Servo Servo5 = null;
    public Servo Servo6 = null;
    public Servo Servo7 = null;

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