package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DelTeamEntityNotify {
    public enum DelTeamEntityNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=363) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public Integer sceneId = null;
    @Tag(tag=1) public List<Integer> delEntityIdList = new ArrayList<>();
}
