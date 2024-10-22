package com.example.meepmeeptesting;
import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;


public class MeepMeepTesting {



        public static void main(String[] args) {
            MeepMeep meepMeep = new MeepMeep(500);

            RoadRunnerBotEntity myBot = new DefaultBotBuilder(meepMeep)
                    // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                    .setConstraints(47, 20, 238, Math.toRadians(60), 15.535)
                    .followTrajectorySequence(drive ->
                            drive.trajectorySequenceBuilder(new Pose2d(10.95, -59.45, Math.toRadians(90.00)))
                                    .splineTo(new Vector2d(41.58, 34.35), Math.toRadians(90.00))
                                    .splineTo(new Vector2d(36.69, 59.03), Math.toRadians(179.22))
                                    .splineTo(new Vector2d(-48.60, 33.93), Math.toRadians(266.19))
                                    .splineTo(new Vector2d(-24.57, -59.88), Math.toRadians(0.00))
                                    .splineTo(new Vector2d(30.74, -58.17), Math.toRadians(0.00))
                                    .build()
                    );



            meepMeep.setBackground(MeepMeep.Background.FIELD_CENTERSTAGE_JUICE_DARK)
                    .setDarkMode(true)
                    .setBackgroundAlpha(0.95f)
                    .addEntity(myBot)
                    .start();
        }
    }
