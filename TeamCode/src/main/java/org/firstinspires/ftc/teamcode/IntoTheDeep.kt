package org.firstinspires.ftc.teamcode

import net.hivemindrobotics.swarm.hardware.motor.factory.MotorFactory
import net.hivemindrobotics.swarm.math.Pose

class IntoTheDeep(pose: Pose) {
    private val frontLeftMotor = MotorFactory("frontLeftMotor")
            .reverse
            .brake
            .build()

    init {
        frontLeftMotor.power = 1.0
    }
}