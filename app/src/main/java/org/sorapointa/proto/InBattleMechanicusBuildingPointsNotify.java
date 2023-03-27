package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InBattleMechanicusBuildingPointsNotify {
    public static class MapPlayerBuildingPointsMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public enum InBattleMechanicusBuildingPointsNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5380) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public List<MapPlayerBuildingPointsMap> playerBuildingPointsMap = new ArrayList<>();
}
