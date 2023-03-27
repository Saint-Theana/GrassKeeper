package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BlitzRushParkourRestartRsp {
    public enum BlitzRushParkourRestartRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8502) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public Integer scheduleId = null;
    @Tag(tag=15) public Integer groupId = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
}
