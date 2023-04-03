package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PbNavMeshStatsInfo.*;
import org.sorapointa.proto.PbNavMeshStatsInfo;

public class NavMeshStatsNotify {
    public enum NavMeshStatsNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2395) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=13) public List<PbNavMeshStatsInfo> infos = new ArrayList<>();
}
