package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DungeonSlipRevivePointActivateRsp {
    public enum DungeonSlipRevivePointActivateRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=979) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public Integer slipRevivePointId = null;
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
}
