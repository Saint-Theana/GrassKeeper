package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ScenePlayBattleInfoListNotify {
    public enum ScenePlayBattleInfoListNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4363) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public List<ScenePlayBattleInfo> battleInfoList = new ArrayList<>();
}
