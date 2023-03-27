package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum InBattleMechanicusStageType {
        @Tag(tag=0) InBattleMechanicusStageNone ,
        @Tag(tag=1) InBattleMechanicusStageBuild ,
        @Tag(tag=2) InBattleMechanicusStageCardFlip ,
        @Tag(tag=3) InBattleMechanicusStageKill ;
}
