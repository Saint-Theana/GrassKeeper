package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SyncTeamEntityNotify {
    public enum SyncTeamEntityNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=327) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public List<TeamEntityInfo> teamEntityInfoList = new ArrayList<>();
    @Tag(tag=5) public Integer sceneId = null;
}
