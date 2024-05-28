package org.firstinspires.ftc.teamcode

import net.hivemindrobotics.swarm.hardware.motor.factory.EncoderFactory
import net.hivemindrobotics.swarm.hardware.motor.factory.MotorFactory
import net.hivemindrobotics.swarm.math.Pose
import net.hivemindrobotics.swarm.subsystem.drive.HMMecanumOdoDrive
import net.hivemindrobotics.swarm.subsystem.odometry.HMThreeWheelOdometry
import org.firstinspires.ftc.teamcode.subsystem.constants.OdoConstants

class IntoTheDeep(pose: Pose) {
    private val frontLeftMotor = MotorFactory("frontLeftMotor")
        .reverse
        .brake
        .build()

    private val frontRightMotor = MotorFactory("frontRightMotor")
        .reverse
        .brake
        .build()

    private val backLeftMotor = MotorFactory("backLeftMotor")
        .reverse
        .brake
        .build()

    private val backRightMotor = MotorFactory("backRightMotor")
        .reverse
        .brake
        .build()

    val odo = HMThreeWheelOdometry(
        leftEncoder = EncoderFactory(OdoConstants.ticksPerRev).build(frontLeftMotor),
        rightEncoder = EncoderFactory(OdoConstants.ticksPerRev).build(frontRightMotor),
        auxEncoder = EncoderFactory(OdoConstants.ticksPerRev).build(backLeftMotor),
        OdoConstants.LEFT_OFFSET,
        OdoConstants.RIGHT_OFFSET,
        OdoConstants.PERP_TRACKING,
        pose
    )

    val drive = HMMecanumOdoDrive(frontLeftMotor, frontRightMotor, backLeftMotor, backRightMotor, odo, false)
}