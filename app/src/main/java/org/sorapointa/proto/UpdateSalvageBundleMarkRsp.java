package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UpdateSalvageBundleMarkRsp {
    public enum UpdateSalvageBundleMarkRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8990) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public Integer challengeType = null;
    @Tag(tag=10) public Integer stageId = null;
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
}
