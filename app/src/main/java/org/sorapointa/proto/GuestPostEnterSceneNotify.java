package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GuestPostEnterSceneNotify {
    public enum GuestPostEnterSceneNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3292) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public Integer sceneId = null;
    @Tag(tag=5) public Integer uid = null;
}
