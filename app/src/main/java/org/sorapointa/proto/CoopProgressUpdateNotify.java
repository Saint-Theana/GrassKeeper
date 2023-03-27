package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CoopProgressUpdateNotify {
    public enum CoopProgressUpdateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1956) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public Integer curCoopPoint = null;
    @Tag(tag=1) public Boolean isHaveProgress = null;
}
