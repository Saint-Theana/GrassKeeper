package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SeaLampContributeItemRsp {
    public enum SeaLampContributeItemRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2166) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public Integer addProgress = null;
    @Tag(tag=9) public Integer totalContribution = null;
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
    @Tag(tag=2) public Integer addContribution = null;
}
