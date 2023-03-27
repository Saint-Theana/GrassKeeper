package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlatformChangeRouteNotify {
    public enum PlatformChangeRouteNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=211) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public Integer sceneTime = null;
    @Tag(tag=6) public PlatformInfo platform = null;
    @Tag(tag=1) public Integer entityId = null;
}
