package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class QuickOpenActivityRsp {
    public enum QuickOpenActivityRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8108) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public Integer activityId = null;
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
}
