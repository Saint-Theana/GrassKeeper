package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeRegionSearchRewardRsp {
    public enum TakeRegionSearchRewardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5641) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public Integer id = null;
    @Tag(tag=14) public Integer searchId = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
}
