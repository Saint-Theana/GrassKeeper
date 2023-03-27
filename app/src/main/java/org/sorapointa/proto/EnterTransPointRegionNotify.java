package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EnterTransPointRegionNotify {
    public enum EnterTransPointRegionNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=269) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=1) public Integer pointId = null;
    @Tag(tag=3) public Integer sceneId = null;
}
