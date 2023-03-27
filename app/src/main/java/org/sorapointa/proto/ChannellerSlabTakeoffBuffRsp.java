package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChannellerSlabTakeoffBuffRsp {
    public enum ChannellerSlabTakeoffBuffRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8646) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public Integer slotId = null;
    @Tag(tag=6) public Boolean isMp = null;
    @Tag(tag=14) public Integer buffId = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
}
