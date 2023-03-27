package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MultistagePlayFinishStageRsp {
    public enum MultistagePlayFinishStageRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5313) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public Integer playIndex = null;
    @Tag(tag=12) public Integer groupId = null;
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
}
