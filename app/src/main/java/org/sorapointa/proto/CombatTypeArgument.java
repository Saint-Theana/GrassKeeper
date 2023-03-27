package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum CombatTypeArgument {
        @Tag(tag=0) CombatNone ,
        @Tag(tag=1) CombatEvtBeingHit ,
        @Tag(tag=2) CombatAnimatorStateChanged ,
        @Tag(tag=3) CombatFaceToDir ,
        @Tag(tag=4) CombatSetAttackTarget ,
        @Tag(tag=5) CombatRushMove ,
        @Tag(tag=6) CombatAnimatorParameterChanged ,
        @Tag(tag=7) EntityMove ,
        @Tag(tag=8) SyncEntityPosition ,
        @Tag(tag=9) CombatSteerMotionInfo ,
        @Tag(tag=10) CombatForceSetPosInfo ,
        @Tag(tag=11) CombatCompensatePosDiff ,
        @Tag(tag=12) CombatMonsterDoBlink ,
        @Tag(tag=13) CombatFixedRushMove ,
        @Tag(tag=14) CombatSyncTransform ,
        @Tag(tag=15) CombatLightCoreMove ,
        @Tag(tag=16) CombatBeingHealedNtf ,
        @Tag(tag=17) CombatSkillAnchorPositionNtf ,
        @Tag(tag=18) CombatGrapplingHookMove ;
}
