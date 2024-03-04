package org.firstinspires.ftc.teamcode.Config;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.acmerobotics.dashboard.config.Config;


@Config
public class hardwareImports {
    public hardwareImports(HardwareMap hardwareMap) {
        //Defines drive variables
        DcMotor leftFront = null;
        DcMotor rightFront = null;
        DcMotor leftRear = null;
        DcMotor rightRear = null;

        //Defines attachment variables
        DcMotor Attachment = null;
        Servo Servo = null;

        //Defines the driving variables to the hardwareMap
        leftFront = hardwareMap.get(DcMotorEx.class, "leftFront");
        rightFront = hardwareMap.get(DcMotorEx.class, "rightFront");
        leftRear = hardwareMap.get(DcMotorEx.class, "leftRear");
        rightRear = hardwareMap.get(DcMotorEx.class, "rightRear");

        //Defines the attachment variables to the hardwareMap
        Attachment = hardwareMap.get(DcMotorEx.class, "Attachment");
        Servo = hardwareMap.get(com.qualcomm.robotcore.hardware.Servo.class, "Servo");


    }
}