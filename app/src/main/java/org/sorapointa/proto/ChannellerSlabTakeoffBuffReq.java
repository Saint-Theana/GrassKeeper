package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChannellerSlabTakeoffBuffReq {
    public enum ChannellerSlabTakeoffBuffReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8329) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=8) public Boolean isMp = null;
    @Tag(tag=10) public Integer buffId = null;
    @Tag(tag=13) public Integer slotId = null;
}
