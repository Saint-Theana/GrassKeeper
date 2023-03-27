package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ScenePlayerSoundNotify {
    public enum ScenePlayerSoundNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=291) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public String soundName = null;
    @Tag(tag=6) public Vector playPos = null;
    @Tag(tag=10) public Integer playType = null;
}
