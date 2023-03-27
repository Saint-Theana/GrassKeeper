package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WorldChestOpenNotify {
    public enum GCDLLCOAPND {
        @Tag(tag=0) None ,
        @Tag(tag=3085) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public Integer groupId = null;
    @Tag(tag=6) public Integer sceneId = null;
    @Tag(tag=8) public Integer configId = null;
}
