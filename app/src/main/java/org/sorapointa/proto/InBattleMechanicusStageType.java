package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum InBattleMechanicusStageType {
        @Tag(tag=0) IN_BATTLE_MECHANICUS_STAGE_TYPE_NONE ,
        @Tag(tag=1) IN_BATTLE_MECHANICUS_STAGE_TYPE_BUILD ,
        @Tag(tag=2) IN_BATTLE_MECHANICUS_STAGE_TYPE_CARD_FLIP ,
        @Tag(tag=3) IN_BATTLE_MECHANICUS_STAGE_TYPE_KILL ;
}
