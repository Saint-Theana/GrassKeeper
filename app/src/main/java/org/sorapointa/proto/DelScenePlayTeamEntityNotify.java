package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DelScenePlayTeamEntityNotify {
    public enum DelScenePlayTeamEntityNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3203) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public Integer sceneId = null;
    @Tag(tag=6) public List<Integer> delEntityIdList = new ArrayList<>();
}
