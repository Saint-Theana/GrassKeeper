package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeReunionSignInRewardRsp {
    public enum TakeReunionSignInRewardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5085) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public ReunionSignInInfo signInInfo = null;
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
}
