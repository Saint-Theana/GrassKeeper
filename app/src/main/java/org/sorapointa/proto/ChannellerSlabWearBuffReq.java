package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChannellerSlabWearBuffReq {
    public enum ChannellerSlabWearBuffReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8487) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=8) public Boolean isMp = null;
    @Tag(tag=11) public Integer slotId = null;
    @Tag(tag=12) public Integer buffId = null;
}
