package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ScenePlayOutofRegionNotify {
    public enum ScenePlayOutofRegionNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4419) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=5) public Integer playId = null;
}
