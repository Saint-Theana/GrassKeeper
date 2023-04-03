package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ScenePlayBattleInfo.*;
import org.sorapointa.proto.ScenePlayBattleInfo;

public class ScenePlayBattleInfoNotify {
    public enum ScenePlayBattleInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4355) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public ScenePlayBattleInfo battleInfo = null;
}
