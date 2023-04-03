package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.NpcPositionInfo.*;
import org.sorapointa.proto.NpcPositionInfo;

public class GetSceneNpcPositionRsp {
    public enum GetSceneNpcPositionRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=520) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public Integer sceneId = null;
    @Tag(tag=6) public List<NpcPositionInfo> npcInfoList = new ArrayList<>();
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
}
