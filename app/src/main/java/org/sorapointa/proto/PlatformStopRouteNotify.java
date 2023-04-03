package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PlatformInfo.*;
import org.sorapointa.proto.PlatformInfo;

public class PlatformStopRouteNotify {
    public enum PlatformStopRouteNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=284) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public Integer entityId = null;
    @Tag(tag=6) public PlatformInfo platform = null;
    @Tag(tag=3) public Integer sceneTime = null;
}
