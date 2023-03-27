package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeInvestigationRewardRsp {
    public enum TakeInvestigationRewardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1920) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public Integer id = null;
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
}
