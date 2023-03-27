package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum PropChangeReason {
        @Tag(tag=0) PropChangeNone ,
        @Tag(tag=1) PropChangeStatueRecover ,
        @Tag(tag=2) PropChangeEnergyBall ,
        @Tag(tag=3) PropChangeAbility ,
        @Tag(tag=4) PropChangeLevelup ,
        @Tag(tag=5) PropChangeItem ,
        @Tag(tag=6) PropChangeAvatarCard ,
        @Tag(tag=7) PropChangeCityLevelup ,
        @Tag(tag=8) PropChangeAvatarUpgrade ,
        @Tag(tag=9) PropChangeAvatarPromote ,
        @Tag(tag=10) PropChangePlayerAddExp ,
        @Tag(tag=11) PropChangeFinishQuest ,
        @Tag(tag=12) PropChangeGm ,
        @Tag(tag=13) PropChangeManualAdjustWorldLevel ;
}
