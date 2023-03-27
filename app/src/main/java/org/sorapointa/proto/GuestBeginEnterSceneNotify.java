package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GuestBeginEnterSceneNotify {
    public enum GuestBeginEnterSceneNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3490) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public Integer uid = null;
    @Tag(tag=9) public Integer sceneId = null;
}
