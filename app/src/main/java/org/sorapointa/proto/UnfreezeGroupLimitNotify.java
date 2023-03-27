package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UnfreezeGroupLimitNotify {
    public enum UnfreezeGroupLimitNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3346) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public Integer sceneId = null;
    @Tag(tag=13) public Integer pointId = null;
}
