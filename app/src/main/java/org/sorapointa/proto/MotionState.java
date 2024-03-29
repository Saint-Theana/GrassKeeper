package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum MotionState {
        @Tag(tag=0) MotionNone ,
        @Tag(tag=1) MotionReset ,
        @Tag(tag=2) MotionStandby ,
        @Tag(tag=3) MotionStandbyMove ,
        @Tag(tag=4) MotionWalk ,
        @Tag(tag=5) MotionRun ,
        @Tag(tag=6) MotionDash ,
        @Tag(tag=7) MotionClimb ,
        @Tag(tag=8) MotionClimbJump ,
        @Tag(tag=9) MotionStandbyToClimb ,
        @Tag(tag=10) MotionFight ,
        @Tag(tag=11) MotionJump ,
        @Tag(tag=12) MotionDrop ,
        @Tag(tag=13) MotionFly ,
        @Tag(tag=14) MotionSwimMove ,
        @Tag(tag=15) MotionSwimIdle ,
        @Tag(tag=16) MotionSwimDash ,
        @Tag(tag=17) MotionSwimJump ,
        @Tag(tag=18) MotionSlip ,
        @Tag(tag=19) MotionGoUpstairs ,
        @Tag(tag=20) MotionFallOnGround ,
        @Tag(tag=21) MotionJumpUpWallForStandby ,
        @Tag(tag=22) MotionJumpOffWall ,
        @Tag(tag=23) MotionPoweredFly ,
        @Tag(tag=24) MotionLadderIdle ,
        @Tag(tag=25) MotionLadderMove ,
        @Tag(tag=26) MotionLadderSlip ,
        @Tag(tag=27) MotionStandbyToLadder ,
        @Tag(tag=28) MotionLadderToStandby ,
        @Tag(tag=29) MotionDangerStandby ,
        @Tag(tag=30) MotionDangerStandbyMove ,
        @Tag(tag=31) MotionDangerWalk ,
        @Tag(tag=32) MotionDangerRun ,
        @Tag(tag=33) MotionDangerDash ,
        @Tag(tag=34) MotionCrouchIdle ,
        @Tag(tag=35) MotionCrouchMove ,
        @Tag(tag=36) MotionCrouchRoll ,
        @Tag(tag=37) MotionNotify ,
        @Tag(tag=38) MotionLandSpeed ,
        @Tag(tag=39) MotionMoveFailAck ,
        @Tag(tag=40) MotionWaterfall ,
        @Tag(tag=41) MotionDashBeforeShake ,
        @Tag(tag=42) MotionSitIdle ,
        @Tag(tag=43) MotionForceSetPos ,
        @Tag(tag=44) MotionQuestForceDrag ,
        @Tag(tag=45) MotionFollowRoute ,
        @Tag(tag=46) MotionSkiffBoarding ,
        @Tag(tag=47) MotionSkiffNormal ,
        @Tag(tag=48) MotionSkiffDash ,
        @Tag(tag=49) MotionSkiffPoweredDash ,
        @Tag(tag=50) MotionDestroyVehicle ,
        @Tag(tag=51) MotionFlyIdle ,
        @Tag(tag=52) MotionFlySlow ,
        @Tag(tag=53) MotionFlyFast ,
        @Tag(tag=54) MotionAimMove ,
        @Tag(tag=55) MotionAirCompensation ,
        @Tag(tag=56) MotionNum ;
}
