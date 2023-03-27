package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ItemGivingRsp {
    public enum ItemGivingRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=137) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public Integer givingId = null;
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
    @Tag(tag=8) public Integer givingGroupId = null;
}
