package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ScenePlayBattleInterruptNotify {
    public enum ScenePlayBattleInterruptNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4379) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public Integer playType = null;
    @Tag(tag=12) public Integer interruptState = null;
    @Tag(tag=14) public Integer playId = null;
}
