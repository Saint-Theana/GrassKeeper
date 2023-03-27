package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlatformStartRouteNotify {
    public enum PlatformStartRouteNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=237) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public Integer entityId = null;
    @Tag(tag=6) public Integer sceneTime = null;
    @Tag(tag=7) public PlatformInfo platform = null;
}
