package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AdjustWorldLevelRsp {
    public enum AdjustWorldLevelRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=140) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public Integer cdOverTime = null;
    @Tag(tag=15) public Integer afterWorldLevel = null;
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
}
