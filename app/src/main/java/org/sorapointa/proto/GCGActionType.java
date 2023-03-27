package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum GCGActionType {
        @Tag(tag=0) GCGActionTypeNone ,
        @Tag(tag=1) GCGActionTypeSpecialPhase ,
        @Tag(tag=2) GCGActionTypeNextPhase ,
        @Tag(tag=3) GCGActionTypeDraw ,
        @Tag(tag=4) GCGActionTypeRedraw ,
        @Tag(tag=5) GCGActionTypeSelectOnstage ,
        @Tag(tag=6) GCGActionTypeRoll ,
        @Tag(tag=7) GCGActionTypeReroll ,
        @Tag(tag=8) GCGActionTypeAttack ,
        @Tag(tag=9) GCGActionTypePlayCard ,
        @Tag(tag=10) GCGActionTypePass ,
        @Tag(tag=11) GCGActionTypeReboot ,
        @Tag(tag=12) GCGActionTypeGameover ,
        @Tag(tag=13) GCGActionTypeTrigger ,
        @Tag(tag=14) GCGActionTypePhaseExit ,
        @Tag(tag=15) GCGActionTypeCustom ,
        @Tag(tag=16) GCGActionTypeNotifyCost ,
        @Tag(tag=17) GCGActionTypeAfterOperation ,
        @Tag(tag=18) GCGActionTypeUseSkill ,
        @Tag(tag=19) GCGActionTypeNotifySkillPreview ,
        @Tag(tag=20) GCGActionTypePreviewAttack ,
        @Tag(tag=21) GCGActionTypePreviewAfterAttack ,
        @Tag(tag=22) GCGActionTypeSendMessage ,
        @Tag(tag=23) GCGActionTypeWaitingCharacter ,
        @Tag(tag=24) GCGActionTypeTriggerSkill ,
        @Tag(tag=25) GCGActionTypeBeforeNextOperation ;
}
