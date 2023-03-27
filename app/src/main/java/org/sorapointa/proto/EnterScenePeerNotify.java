package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EnterScenePeerNotify {
    public enum EnterScenePeerNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=286) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public Integer hostPeerId = null;
    @Tag(tag=8) public Integer destSceneId = null;
    @Tag(tag=9) public Integer enterSceneToken = null;
    @Tag(tag=6) public Integer peerId = null;
}
