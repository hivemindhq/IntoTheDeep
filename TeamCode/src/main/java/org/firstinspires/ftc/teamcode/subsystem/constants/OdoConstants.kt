package org.firstinspires.ftc.teamcode.subsystem.constants

import com.acmerobotics.dashboard.config.Config

@Config
object OdoConstants {
    const val ticksPerRev = 2000.0

    @JvmField var PERP_TRACKING = 0.0;
    @JvmField var RIGHT_OFFSET = 0.0;

    val LEFT_OFFSET = -RIGHT_OFFSET
}