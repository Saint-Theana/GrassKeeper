package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class LoadActivityTerrainNotify {
    public enum LoadActivityTerrainNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2006) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=3) public Integer activityId = null;
}
