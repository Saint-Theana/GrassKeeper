package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChannellerSlabWearBuffRsp {
    public enum ChannellerSlabWearBuffRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8651) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public Integer buffId = null;
    @Tag(tag=5) public Integer slotId = null;
    @Tag(tag=9) public Boolean isMp = null;
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
}
