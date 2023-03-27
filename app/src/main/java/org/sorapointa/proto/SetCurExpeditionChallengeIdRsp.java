package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SetCurExpeditionChallengeIdRsp {
    public enum SetCurExpeditionChallengeIdRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2050) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4,isSigned=true) public Integer retcode = null;
    @Tag(tag=5) public Integer id = null;
}
