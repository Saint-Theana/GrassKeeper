package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneKickPlayerNotify {
    public enum SceneKickPlayerNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=282) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=8) public Integer kickerUid = null;
    @Tag(tag=15) public Integer targetUid = null;
}
