package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SyncScenePlayTeamEntityNotify {
    public enum SyncScenePlayTeamEntityNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3227) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public Integer sceneId = null;
    @Tag(tag=14) public List<PlayTeamEntityInfo> entityInfoList = new ArrayList<>();
}
