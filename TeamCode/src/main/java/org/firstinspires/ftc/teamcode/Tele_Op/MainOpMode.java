package org.firstinspires.ftc.teamcode.Tele_Op;

import static org.firstinspires.ftc.teamcode.Config.Motors.PIDFarm.PIDF_Arm;

import com.arcrobotics.ftclib.controller.PIDController;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.arcrobotics.ftclib.gamepad.ToggleButtonReader;
import com.arcrobotics.ftclib.gamepad.TriggerReader;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode.Config.Motors.PIDFarm.*;

import org.firstinspires.ftc.teamcode.Config.Motors.hardwareImports;

public class MainOpMode extends OpMode {
    hardwareImports hm = new hardwareImports(hardwareMap);

    double Speed;
    double MaxSpeed;
    double MinSpeed;
    double MaxTurnSpeed;
    double MinTurnSpeed;
    double TurnSpeed;
    double Vertical;
    double Horizontal;
    double Pivot;
    double pid;
    double ff;
    double power;
    int newTarget;

    boolean Safety;
    Boolean Armed;

    PIDController controller;

    GamepadEx DriverOp1 = new GamepadEx(gamepad1);
    GamepadEx DriverOp2 = new GamepadEx(gamepad2);

    TriggerReader LTR = new TriggerReader(DriverOp1, GamepadKeys.Trigger.LEFT_TRIGGER);
    TriggerReader RTR = new TriggerReader(DriverOp1, GamepadKeys.Trigger.RIGHT_TRIGGER);
    TriggerReader LTR2 = new TriggerReader(DriverOp2, GamepadKeys.Trigger.LEFT_TRIGGER);
    TriggerReader RTR2 = new TriggerReader(DriverOp2, GamepadKeys.Trigger.RIGHT_TRIGGER);


    @Override
    public void init() {

        Speed = 0.85;
        MaxSpeed = 1;
        MinSpeed = 0.65;
        TurnSpeed = 0.7;
        MaxTurnSpeed = 0.7;
        MinTurnSpeed = 0.5;
        newTarget = 10;
        Safety = true;
        Armed = false;

        hm.Servo3.setPosition(1);
        hm.Servo4.setPosition(0);

        telemetry.addData("Info", "OpMode is ready to run");
        telemetry.update();
    }



    @Override
    public void loop() {
        PIDF_Arm(newTarget);

        if (gamepad2.touchpad && Safety){
            gamepad2.rumble(1000);
            Safety = false;
        } else if (!gamepad2.touchpad && Safety){
            Armed = true;
        } else if (gamepad2.touchpad && Armed){
            hm.Servo5.setPosition(1);
        }

        if (LTR.isDown()){
            Speed = MinSpeed;
            TurnSpeed = MinTurnSpeed;
        } else {
            Speed = MaxSpeed;
            TurnSpeed = MaxTurnSpeed;
        }

        if (DriverOp2.getLeftY() > 0){
            newTarget += 2;
        } else if (DriverOp2.getLeftY() < 0){
            newTarget -= 2;
        }

        if (DriverOp2.wasJustPressed(GamepadKeys.Button.LEFT_BUMPER)){
            newTarget = 50;
        }
        if (DriverOp2.wasJustPressed(GamepadKeys.Button.RIGHT_BUMPER)){
            newTarget = -1350;
        }
    }
}
